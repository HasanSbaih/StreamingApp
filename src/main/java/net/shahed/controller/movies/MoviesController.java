package net.shahed.controller.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.shahed.business.bean.movie.Trailer;
import net.shahed.business.service.MoviesService;
import net.shahed.controller.movies.movie.list.MoviesResource;
import net.shahed.controller.movies.movie.list.MoviesResourceAssembler;
import net.shahed.controller.movies.movie.single.MovieResource;
import net.shahed.controller.movies.movie.single.MovieResourceAssembler;
import net.shahed.controller.movies.trailer.single.TrailerResource;
import net.shahed.controller.movies.trailer.single.TrailerResourceAssembler;

@RestController
@RequestMapping("/movies")
@ExposesResourceFor(MoviesResource.class)
public class MoviesController {

	@Autowired
	MoviesService moviesService;

	@Autowired
	MoviesResourceAssembler moviesResourceAssembler;

	@Autowired
	MovieResourceAssembler movieResourceAssembler;
	
	@Autowired
	TrailerResourceAssembler trailerResourceAssembler;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<MoviesResource> getMovies() {

		List<MovieResource> movieResource = movieResourceAssembler.toResources(moviesService.getMovies());

		MoviesResource moviesResource = new MoviesResource(movieResource);

		return ResponseEntity.ok(moviesResource);
	}

	@RequestMapping(path = "/featured", method = RequestMethod.GET)
	public ResponseEntity<MoviesResource> getFeaturedMovies() {

		MoviesResource moviesResource = moviesResourceAssembler
				.toResource(movieResourceAssembler.toResources(moviesService.getMovies()));

		return ResponseEntity.ok(moviesResource);
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
