package net.shahed;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import net.shahed.business.dao.MoviesDao;
import net.shahed.business.dao.MoviesDaoImpl;
import net.shahed.business.service.MoviesService;
import net.shahed.business.service.MoviesServiceImpl;
import net.shahed.controller.movies.MoviesController;
import net.shahed.controller.movies.movie.list.MoviesResource;
import net.shahed.controller.movies.movie.list.MoviesResourceAssembler;
import net.shahed.controller.movies.movie.single.MovieResource;
import net.shahed.controller.movies.movie.single.MovieResourceAssembler;
import net.shahed.controller.movies.trailer.single.TrailerResource;
import net.shahed.controller.movies.trailer.single.TrailerResourceAssembler;

@Configuration
@ComponentScan(value = "net.shahed.controller.*")
@EnableHypermediaSupport(type = { HypermediaType.HAL })
@EnableWebMvc
public class AppConifg {

	@Bean
	public MoviesService getMoviesService() {
		return new MoviesServiceImpl();
	}

	@Bean
	public MoviesDao getMoviesDao() {
		return new MoviesDaoImpl();
	}

	@Bean
	public MoviesResourceAssembler getMoviesResourceAssembler() {
		return new MoviesResourceAssembler(MoviesController.class, MoviesResource.class);
	}
	
	@Bean
	public MovieResourceAssembler getMovieResourceAssembler() {
		return new MovieResourceAssembler(MoviesController.class, MovieResource.class);
	}
	
	@Bean
	public TrailerResourceAssembler getTrailerResourceAssembler() {
		return new TrailerResourceAssembler(MoviesController.class, TrailerResource.class);
	}
	
	
}
