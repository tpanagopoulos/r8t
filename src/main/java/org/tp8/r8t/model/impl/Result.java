package org.tp8.r8t.model.impl;

import java.util.Map;

import org.tp8.r8t.model.AbstractModel;
import org.tp8.r8t.model.enums.Score;

public class Result extends AbstractModel {

	private static final long serialVersionUID = 6442545317212908732L;

	private String id;

	private String userId;

	private Map<String, Score> averageRatings;

	private Map<String, Score> userRatings;

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

	public Map<String, Score> getAverageRatings() {
		return averageRatings;
	}

	public void setAverageRatings(Map<String, Score> averageRatings) {
		this.averageRatings = averageRatings;
	}

	public Map<String, Score> getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(Map<String, Score> userRatings) {
		this.userRatings = userRatings;
	}

}
