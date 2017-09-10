package net.shahed.controller.resource;

import java.util.Date;

import org.springframework.hateoas.core.Relation;

@Relation(value = "movie", collectionRelation = "movies")
public class MovieResource extends ResourceWithEmbeddeds {

	private Long movieId;
	private Date availabilityEndDate;
	private Date availabilityStartDate;
	private String media;

	private TrailerResource trailer;

	public Date getAvailabilityEndDate() {
		return availabilityEndDate;
	}

	public void setAvailabilityEndDate(Date availabilityEndDate) {
		this.availabilityEndDate = availabilityEndDate;
	}

	public Date getAvailabilityStartDate() {
		return availabilityStartDate;
	}

	public void setAvailabilityStartDate(Date availabilityStartDate) {
		this.availabilityStartDate = availabilityStartDate;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public TrailerResource getTrailer() {
		return trailer;
	}

	public void setTrailer(TrailerResource trailer) {
		this.trailer = trailer;
	}
}