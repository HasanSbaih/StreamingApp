package net.shahed.business.bean.show;

import java.util.List;

import net.shahed.business.bean.Product;
import net.shahed.business.bean.show.asset.Episode;

public abstract class Show extends Product{

	List<Episode> episodes;
	List<Clip> clips;
	public List<Episode> getEpisodes() {
		return episodes;
	}
	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}
	public List<Clip> getClips() {
		return clips;
	}
	public void setClips(List<Clip> clips) {
		this.clips = clips;
	}
	
}
