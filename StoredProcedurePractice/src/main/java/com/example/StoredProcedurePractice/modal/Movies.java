package com.example.StoredProcedurePractice.modal;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

@Entity
@Table
@SqlResultSetMapping(name = "Movies" , classes = @ConstructorResult(targetClass = Movies.class ,columns = {
		@ColumnResult(name = "id"  , type = Integer.class),
		@ColumnResult(name = "MovieName" , type = String.class),
		@ColumnResult(name = "crew" , type = String.class),
		@ColumnResult(name = "ratings" , type = Integer.class)
}))

public class Movies {
	@Id

	private int id;
	private String MovieName;
	private String crew;
	private int ratings;
	
	//start
	
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(int id, String MovieName, String crew, int ratings) {
		super();
		this.id = id;
		this.MovieName = MovieName;
		this.crew = crew;
		this.ratings =ratings;
	}
	
	//end

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String getCrew() {
		return crew;
	}
	public void setCrew(String crew) {
		this.crew = crew;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
	@Override
	public String toString() {
		return "Movies [id=" + id + ", MovieName=" + MovieName + ", crew=" + crew + ", ratings=" + ratings + "]";
	}

}
