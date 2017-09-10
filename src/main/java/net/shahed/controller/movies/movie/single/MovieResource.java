package net.shahed.controller.movies.movie.single;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import net.shahed.business.bean.movie.Movie;

public class MovieResource extends ResourceSupport {

	@JsonUnwrapped
	private final Movie movie;

	public MovieResource(Movie movie) {
		this.movie = movie;
	}

	public Movie getMovie() {
		return movie;
	}
}