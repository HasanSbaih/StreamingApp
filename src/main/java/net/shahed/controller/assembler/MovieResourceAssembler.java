package net.shahed.controller.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RelProvider;
import org.springframework.hateoas.core.EmbeddedWrapper;
import org.springframework.stereotype.Service;


import net.shahed.business.bean.movie.Movie;
import net.shahed.controller.MoviesController;
import net.shahed.controller.resource.MovieResource;

@Service
public class MovieResourceAssembler extends EmbeddableResourceAssemblerSupport<Movie, MovieResource, MoviesController> {

	@Autowired
	public MovieResourceAssembler(final EntityLinks entityLinks, final RelProvider relProvider) {
		super(entityLinks, relProvider, MoviesController.class, MovieResource.class);
	}

	@Override
	public MovieResource toResource(Movie entity) {
		final MovieResource resource = createResourceWithId(entity.getId(), entity);
		return resource;
	}

	@Override
	public Link linkToSingleResource(Movie movie) {
		return entityLinks.linkToSingleResource(MovieResource.class, movie.getId());
	}
	
	@Override
	public EmbeddedWrapper toEmbeddable(Movie entity) {
		// TODO Auto-generated method stub
		return super.toEmbeddable(entity);
	}
}
