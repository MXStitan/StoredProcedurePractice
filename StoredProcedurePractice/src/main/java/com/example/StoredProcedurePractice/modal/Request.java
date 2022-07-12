package com.example.StoredProcedurePractice.modal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {

	private int id;
	private String crew;

	@JsonCreator
	public Request( @JsonProperty("id, crew")int id, String crew) {
		super();
		this.id = id;
		this.crew=crew;
	}
//	@JsonCreator
//	public Request( @JsonProperty("crew") String crew) {
//		super();
//		this.crew = crew;
//	}



@Override
	public String toString() {
		return "Request [id=" + id + ", crew=" + crew + "]";
	}

public String getCrew() {
	return crew;
}


public void setCrew(String crew) {
	this.crew = crew;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
}
