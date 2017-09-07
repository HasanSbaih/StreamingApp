package net.shahed.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.shahed.business.bean.Product;
import net.shahed.business.bean.movie.Movie;
import net.shahed.business.bean.movie.Trailer;

@RestController
@RequestMapping("/product")
public class MoviesController {

	// http://localhost:8080/product/id?request={"id":1111,"productType":"SHOW","productSubType":"SERIES"}

	// http://localhost:8080/program/123/season/123/episode/123213
	@RequestMapping(path = "/id/{productType}/{id}/season/{id}/playlist/{id}/{mediaType}")
	public ResponseEntity<Product> getMovie(@PathVariable(value = "type") String type,
			@PathVariable(value = "id") Long id, @PathVariable(value = "secondType") String secondType,
			@PathVariable(value = "secondId") Long secondId, @PathVariable(value = "therdType") String therdType,
			@PathVariable(value = "therdId") Long therdId) {

		Movie movie = new Movie();
		movie.setId(15l);
		Trailer trailer = new Trailer();
		trailer.setId(50l);
		movie.setTrailer(trailer);
		return new ResponseEntity<Product>(movie, HttpStatus.OK);
	}

	@RequestMapping(path = "/id/{productType}/{productSubType}")
	public ResponseEntity<Product> getProduct(@PathVariable(value = "productType") String productType,
			@PathVariable(value = "id") Long id, @PathVariable(value = "productSubType") String productSubType) {

		// build criteria
		
		
		//id:id AND productType:ASSET
		if (productSubType != null) {
			//ANd productSubType:CLIP
		}
		
		// program
		
		
		
//		Movie movie = new Movie();
//		movie.setId(15l);
//		Trailer trailer = new Trailer();
//		trailer.setId(50l);
//		movie.setTrailer(trailer);
		return new ResponseEntity<Product>(new Movie(), HttpStatus.OK);
	}

}
