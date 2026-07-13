package com.MIS.Dao;

import com.MIS.Entity.MovieEntity;

public class MovieDao {
	public MovieEntity getMovie() {
		MovieEntity movie=new MovieEntity(1001,"Bahubali",5.4f);
		return movie;
	}
}
