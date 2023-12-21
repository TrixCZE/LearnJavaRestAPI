package com.jakubstefcek.restfulwebdemo.user;

import java.time.LocalDate;

public class User {
	private Integer id;
	private String name;
	private LocalDate birthdate;
	
	// Constructor
	public User(Integer id, String name, LocalDate localDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = localDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
	}
}