package net.shahed.controller.movies.movie.list;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import net.shahed.controller.movies.movie.single.MovieResource;

public class MoviesResource extends ResourceSupport{


	@JsonUnwrapped
	private final List<MovieResource> movies;
	
	public MoviesResource(List<MovieResource>movies) {
		this.movies=movies;
	}

	public List<MovieResource> getMovies() {
		return movies;
	}
	
	
}
