package net.shahed.controller.movies.movie.list;

import java.util.List;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import net.shahed.controller.movies.movie.single.MovieResource;

public class MoviesResourceAssembler extends ResourceAssemblerSupport<List<MovieResource>, MoviesResource> {

	public MoviesResourceAssembler(Class<?> controllerClass, Class<MoviesResource> resourceType) {
		super(controllerClass, resourceType);
	}

		

	public MoviesResource toResource(List<MovieResource> entity) {
		MoviesResource moviesResource = new MoviesResource(entity);
		

		return moviesResource;
	}

}
