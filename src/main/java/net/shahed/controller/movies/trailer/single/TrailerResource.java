package net.shahed.controller.movies.trailer.single;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import net.shahed.business.bean.movie.Trailer;

public class TrailerResource extends ResourceSupport{


	@JsonUnwrapped
	private final Trailer trailer;
	
	public TrailerResource(Trailer trailer) {
		this.trailer=trailer;
	}

	public Trailer getTrailer() {
		return trailer;
	}
	
	
}
