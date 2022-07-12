package com.example.StoredProcedurePractice.service;

//import com.example.StoredProcedurePractice.modal.Request;
import com.example.StoredProcedurePractice.modal.Response;
//import com.example.demo.entites.Response;

public interface MoviesService {

	//Request getMovieDetail(int id);
	public Response getCustomerDetail(int id);
	
	public Response getCrewDetail(String crew);
	
}
