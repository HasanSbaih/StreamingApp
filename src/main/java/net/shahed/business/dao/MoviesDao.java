package net.shahed.business.dao;

import java.util.List;

import net.shahed.business.bean.movie.Movie;

public interface MoviesDao {

	Movie findMovieById(Long id);

	List<Movie> findAll();
}
