package com.MIS.Service;

import com.MIS.Dao.MovieDao;
import com.MIS.Entity.MovieEntity;

public class MovieService {
	public MovieEntity getMovie() {
		MovieDao dao=new MovieDao();
		MovieEntity movie=dao.getMovie();
		return movie;
	}
}
