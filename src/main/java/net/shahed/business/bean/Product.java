package net.shahed.business.bean;

import java.util.Date;
import java.util.List;

import net.shahed.business.bean.person.Person;

public abstract class Product {
	
	private Long id;
	private Date availabilityEndDate;
	private Date availabilityStartDate;
	private boolean plus;
	private Integer pricingPlan;
	private String media;
	private List<Person> cast;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public boolean isPlus() {
		return plus;
	}
	public void setPlus(boolean plus) {
		this.plus = plus;
	}
	public Integer getPricingPlan() {
		return pricingPlan;
	}
	public void setPricingPlan(Integer pricingPlan) {
		this.pricingPlan = pricingPlan;
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
	
	

}
