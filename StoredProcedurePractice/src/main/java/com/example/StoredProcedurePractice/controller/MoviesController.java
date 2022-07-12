package com.example.StoredProcedurePractice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.StoredProcedurePractice.modal.Movies;
import com.example.StoredProcedurePractice.modal.Request;
import com.example.StoredProcedurePractice.modal.Response;
import com.example.StoredProcedurePractice.service.MoviesService;
//import com.example.demo.entites.Studentrollno;


@RestController
public class MoviesController {
	
	@Autowired
	private MoviesService moviesService;

//	@PostMapping("/Movies")
//	public Response getMovieDetail(@RequestBody Movies id)
//	{
//		
//		return this.moviesService.getCustomerDetail(id.getId());
//	}
	
	@PostMapping("/Movies")
	public Response getCustomerDetail(@RequestBody Request id)
	{
		
		return this.moviesService.getCustomerDetail(id.getId());
	}
	@PostMapping("/Movies1")
	public Response getCrewDetail(@RequestBody Request crew)
	{
		return this.moviesService.getCrewDetail(crew.getCrew());
	}
}
