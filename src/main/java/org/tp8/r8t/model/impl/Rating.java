package org.tp8.r8t.model.impl;

import org.springframework.data.elasticsearch.annotations.Document;
import org.tp8.r8t.model.AbstractModel;
import org.tp8.r8t.model.enums.Score;

@Document(indexName="rating")
public class Rating extends AbstractModel {

	private static final long serialVersionUID = -4554458234472449306L;

	private String id;

	private String userId;

	private String movieId;

	private Score score;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
