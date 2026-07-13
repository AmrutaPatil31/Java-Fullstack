package com.MIS.Controller;

import com.MIS.Entity.MovieEntity;
import com.MIS.Service.MovieService;

public class MovieController {

	public static void main(String[] args) {
		MovieService service=new MovieService();
		MovieEntity m=service.getMovie();
		System.out.println(m);

	}

}
