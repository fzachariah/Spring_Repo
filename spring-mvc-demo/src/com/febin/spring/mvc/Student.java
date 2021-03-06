package com.febin.spring.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	String firstName;
	String lastName;
	String country;
	
	String favoriteLanguage;
	
	String[] operatingSystems;
	
	
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	LinkedHashMap< String, String> hashMap;
	public Student()
	{
		hashMap=new LinkedHashMap<>();
		hashMap.put("BR", "Brazil");
		hashMap.put("FR", "France");
		hashMap.put("IN", "India");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LinkedHashMap<String, String> getHashMap() {
		return hashMap;
	}
	public void setHashMap(LinkedHashMap<String, String> hashMap) {
		this.hashMap = hashMap;
	}
	
	
	
	

}
