package org.tp8.r8t.model.impl;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;
import org.tp8.r8t.model.AbstractModel;

@Document(indexName = "game")
public class Game extends AbstractModel {

	private static final long serialVersionUID = 5547906749768893348L;

	private String id;

	private String userId;

	private List<Movie> selectedMovies;

	private List<Rating> ratings;

	private long duration;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Movie> getSelectedMovies() {
		return selectedMovies;
	}

	public void setSelectedMovies(List<Movie> selectedMovies) {
		this.selectedMovies = selectedMovies;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

}
