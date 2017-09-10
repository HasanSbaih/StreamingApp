package net.shahed;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

import net.shahed.business.dao.MoviesDao;
import net.shahed.business.dao.MoviesDaoImpl;
import net.shahed.business.service.MoviesService;
import net.shahed.business.service.MoviesServiceImpl;
import net.shahed.controller.MoviesController;
import net.shahed.controller.assembler.TrailerResourceAssembler;
import net.shahed.controller.resource.TrailerResource;

@Configuration
@ComponentScan(value = "net.shahed.controller.*")
@EnableHypermediaSupport(type = { HypermediaType.HAL })
public class AppConifg {

	@Bean
	public Filter shallowEtagHeaderFilter() {
		return new ShallowEtagHeaderFilter();
	}

	@Bean
	public MoviesService getMoviesService() {
		return new MoviesServiceImpl();
	}

	@Bean
	public MoviesDao getMoviesDao() {
		return new MoviesDaoImpl();
	}

	@Bean
	public TrailerResourceAssembler getTrailerResourceAssembler() {
		return new TrailerResourceAssembler(MoviesController.class, TrailerResource.class);
	}

}
