package org.tp8.r8t.model.impl;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;
import org.tp8.r8t.model.AbstractModel;

@Document(indexName="Movie")
public class Movie extends AbstractModel {

	private static final long serialVersionUID = -3302105327717083879L;

	private String id;

	private String title;

	private List<MovieCategory> categories;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<MovieCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<MovieCategory> categories) {
		this.categories = categories;
	}

}
