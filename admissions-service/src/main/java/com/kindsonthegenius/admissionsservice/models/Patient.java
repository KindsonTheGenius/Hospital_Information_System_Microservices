package com.kindsonthegenius.admissionsservice.models;

public class Patient {
	
	String Id;
	String name;
	String nationality;
	
	public Patient() {
		
	}
	
	public Patient(String Id, String name, String nationality) {
		this.Id = Id;
		this.name = name;
		this.nationality = nationality;
	}

	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	
}
