package net.shahed.business.bean.movie;

import net.shahed.business.bean.Product;

public class Movie extends Product{

	private Trailer trailer;

	public Trailer getTrailer() {
		return trailer;
	}

	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}
	
	
}
