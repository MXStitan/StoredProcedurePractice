package com.example.StoredProcedurePractice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StoredProcedurePractice.modal.Movies;

//import com.example.demo.entites.Student;

@Repository
public class MoviesDao {

	@Autowired
	private EntityManager eManager;
	
	@SuppressWarnings("unchecked")
	public List<Movies> getCustomerDetail(int id) {
		StoredProcedureQuery query = eManager.createStoredProcedureQuery("imbd","Movies")
				.registerStoredProcedureParameter("id", Integer.class, ParameterMode.IN)
				.setParameter("id", id);

		query.execute();
		return query.getResultList();
	}	
	@SuppressWarnings("unchecked")
	public List<Movies> getCrewDetail(String crew) {
		StoredProcedureQuery query = eManager.createStoredProcedureQuery("imbd","Movies")
				.registerStoredProcedureParameter("crew", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("id", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("ratings", String.class, ParameterMode.IN)
				.setParameter("crew", crew)
				.setParameter("id",0)
				.setParameter("ratings", "");

		query.execute();
		return query.getResultList();
	}	
}
