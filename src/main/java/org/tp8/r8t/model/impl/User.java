package org.tp8.r8t.model.impl;

import org.springframework.data.elasticsearch.annotations.Document;
import org.tp8.r8t.model.AbstractModel;
import org.tp8.r8t.model.enums.Gender;

@Document(indexName = "User")
public class User extends AbstractModel {

	private static final long serialVersionUID = -6675710347859895973L;

	private String id;

	private String name;

	private String surname;

	private Gender gender;

	private Country country;

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
