package com.example.StoredProcedurePractice.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StoredProcedurePractice.dao.MoviesDao;
import com.example.StoredProcedurePractice.modal.Movies;
//import com.example.StoredProcedurePractice.modal.Request;
import com.example.StoredProcedurePractice.modal.Response;


@Service
public class MoviesServiceImpl implements MoviesService{

	@Autowired
	private MoviesDao customerdao;

	@Override
	public Response getCustomerDetail(int id) {
		// TODO Auto-generated method stu	
		List<Movies> list = customerdao.getCustomerDetail(id);
		Response response  = new Response(1 ,0 , "I" , "sucess" , list);
		return response;
	}
	@Override
	public Response getCrewDetail(String crew) {
		// TODO Auto-generated method stu	
		List<Movies> list = customerdao.getCrewDetail(crew);
		Response response  = new Response(1 ,0 , "I" , "sucess" , list);
		return response;
	}
}