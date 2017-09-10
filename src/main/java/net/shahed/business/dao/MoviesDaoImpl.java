package net.shahed.business.dao;

import java.util.ArrayList;
import java.util.List;

import net.shahed.business.bean.movie.Movie;

public class MoviesDaoImpl implements MoviesDao {

	public Movie findMovieById(Long id) {
		Movie movie = new Movie();
		movie.setId(2134l);
		return movie;
	}

	public List<Movie> findAll() {
		ArrayList<Movie> moviesList = new ArrayList<Movie>();
		Movie movie = new Movie();
		movie.setId(123l);
		moviesList.add(movie);
		return moviesList;
	}

}
