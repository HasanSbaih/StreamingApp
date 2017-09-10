package net.shahed.controller.movies.movie.single;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import net.shahed.business.bean.movie.Movie;
import net.shahed.controller.movies.movie.list.MoviesResource;

public class MovieResourceAssembler extends ResourceAssemblerSupport<Movie, MovieResource> {

	@Autowired
	EntityLinks entityLinks;

	public MovieResourceAssembler(Class<?> controllerClass, Class<MovieResource> resourceType) {
		super(controllerClass, resourceType);
	}

	public MovieResource toResource(Movie entity) {

		MovieResource movieResource = new MovieResource(entity);

		Link selfRel = entityLinks.linkToSingleResource(MoviesResource.class, entity.getId());
;
		movieResource.add(selfRel);
		return movieResource;
	}

}
