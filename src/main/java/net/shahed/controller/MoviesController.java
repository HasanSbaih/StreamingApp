package net.shahed.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.hateoas.Resources;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.shahed.business.bean.movie.Trailer;
import net.shahed.business.service.MoviesService;
import net.shahed.controller.assembler.MovieResourceAssembler;
import net.shahed.controller.assembler.TrailerResourceAssembler;
import net.shahed.controller.resource.MovieResource;
import net.shahed.controller.resource.TrailerResource;

@RestController
@RequestMapping(value = "/movies", produces = MediaType.APPLICATION_JSON_VALUE)
@ExposesResourceFor(MovieResource.class)
public class MoviesController {

	private final MoviesService moviesService;

	private final MovieResourceAssembler movieResourceAssembler;

	private final TrailerResourceAssembler trailerResourceAssembler;

	@Autowired
	public MoviesController(final MoviesService moviesService, final MovieResourceAssembler movieResourceAssembler,
			final TrailerResourceAssembler trailerResourceAssembler) {
		this.moviesService = moviesService;
		this.movieResourceAssembler = movieResourceAssembler;
		this.trailerResourceAssembler = trailerResourceAssembler;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Resources<MovieResource>> getMovies() {
		Resources<MovieResource> movieResource = movieResourceAssembler.toEmbeddedList((moviesService.getMovies()));
		movieResource.add(linkTo(methodOn(MoviesController.class).getMovie(null)).withRel("Movie_By_Id"));
		return ResponseEntity.ok(movieResource);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<MovieResource> getMovie(@PathVariable("id") Long id) {
		MovieResource movieResource = movieResourceAssembler.toResource(moviesService.getMovieById(id));
		return ResponseEntity.ok(movieResource);
	}

	@RequestMapping(path = "/{id}/trailer", method = RequestMethod.GET)
	public ResponseEntity<TrailerResource> getMovieTrailer(@PathVariable("id") Long id) {

		Trailer movieTrailer = moviesService.getMovieTrailer(id);
		
		return ResponseEntity.ok(trailerResourceAssembler.toResource(movieTrailer));
	}

}
