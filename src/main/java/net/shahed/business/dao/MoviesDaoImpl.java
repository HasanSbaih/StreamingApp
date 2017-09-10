package net.shahed.business.dao;

import java.util.ArrayList;
import java.util.List;

import net.shahed.business.bean.movie.Movie;

public class MoviesDaoImpl implements MoviesDao {

	public Movie findMovieById(Long id) {
		Movie movie = new Movie();
		return movie;
	}

	public List<Movie> findAll() {
		ArrayList<Movie> moviesList = new ArrayList<Movie>();
		moviesList.add(new Movie());
		return moviesList;
	}

}
