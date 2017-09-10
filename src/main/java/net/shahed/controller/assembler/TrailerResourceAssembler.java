package net.shahed.controller.assembler;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import net.shahed.business.bean.movie.Trailer;
import net.shahed.controller.resource.TrailerResource;

public class TrailerResourceAssembler extends ResourceAssemblerSupport<Trailer, TrailerResource> {

	public TrailerResourceAssembler(Class<?> controllerClass, Class<TrailerResource> resourceType) {
		super(controllerClass, resourceType);
	}

	public TrailerResource toResource(Trailer entity) {
		return null;
	}

}
