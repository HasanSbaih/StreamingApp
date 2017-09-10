package net.shahed.controller.resource;

import java.util.Date;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import net.shahed.business.bean.person.Person;

public class TrailerResource extends ResourceSupport{


	private Long trailerId;
	private Date availabilityEndDate;
	private Date availabilityStartDate;
	private String media;
	private List<Person> cast;
	
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
	public List<Person> getCast() {
		return cast;
	}
	public void setCast(List<Person> cast) {
		this.cast = cast;
	}
	public Long getTrailerId() {
		return trailerId;
	}
	public void setTrailerId(Long trailerId) {
		this.trailerId = trailerId;
	}
	
	
}
