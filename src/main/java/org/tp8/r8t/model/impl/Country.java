package org.tp8.r8t.model.impl;

import org.springframework.data.elasticsearch.annotations.Document;
import org.tp8.r8t.model.AbstractModel;

@Document(indexName="country")
public class Country extends AbstractModel {

	private static final long serialVersionUID = 6442545317212908732L;

	private String id;

	private String name;

	private String countryCode;

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

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
