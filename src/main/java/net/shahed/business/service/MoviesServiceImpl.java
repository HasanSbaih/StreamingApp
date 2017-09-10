package net.shahed.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.shahed.business.bean.movie.Movie;
import net.shahed.business.bean.movie.Trailer;
import net.shahed.business.dao.MoviesDao;


public class MoviesServiceImpl implements MoviesService {

	@Autowired
	private MoviesDao moviesDao;
	
	/* (non-Javadoc)
	 * @see net.shahed.business.service.MoviesService#getMovieById(java.lang.Long)
	 */
	public Movie getMovieById(Long id) {
		return moviesDao.findMovieById(id);
	}

	public List<Movie> getMovies() {
		return moviesDao.findAll();
	}

	public List<Movie> getFeaturedMovies() {
		return moviesDao.findAll();
	}

	public Trailer getMovieTrailer(Long movieId) {
		return moviesDao.findMovieById(movieId).getTrailer();
	}
	
}
