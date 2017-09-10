package net.shahed.business.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.shahed.business.bean.movie.Movie;
import net.shahed.business.bean.movie.Trailer;

@Service
public interface MoviesService {

	Movie getMovieById(Long id);

	List<Movie> getMovies();
	
	List<Movie> getFeaturedMovies();
	
	Trailer getMovieTrailer(Long movieId);

}