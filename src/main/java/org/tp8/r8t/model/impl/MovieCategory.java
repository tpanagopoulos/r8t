package org.tp8.r8t.model.impl;

import org.springframework.data.elasticsearch.annotations.Document;
import org.tp8.r8t.model.AbstractModel;

@Document(indexName="moviecategory")
public class MovieCategory extends AbstractModel {

	private static final long serialVersionUID = 4766659384641003498L;

	private String id;

	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
