package net.shahed.controller.movies.trailer.single;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import net.shahed.business.bean.movie.Trailer;

public class TrailerResourceAssembler extends ResourceAssemblerSupport<Trailer,TrailerResource> {

	public TrailerResourceAssembler(Class<?> controllerClass, Class<TrailerResource> resourceType) {
		super(controllerClass, resourceType);
	}

		

	public TrailerResource toResource(Trailer entity) {
		TrailerResource moviesResource = new TrailerResource(entity);
		

		return moviesResource;
	}

}
