package org.tp8.r8t.model.impl;

import java.util.List;

import org.tp8.r8t.model.AbstractModel;

public class Result extends AbstractModel {

	private static final long serialVersionUID = 6442545317212908732L;

	private String id;

	private String userId;

	private List<ResultEntry> resultEntries;

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

	public List<ResultEntry> getResultEntries() {
		return resultEntries;
	}

	public void setResultEntries(List<ResultEntry> resultEntries) {
		this.resultEntries = resultEntries;
	}

}
