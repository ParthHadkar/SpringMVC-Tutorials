package com.springmvc.model;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String countryCode;
	private String countryCodeP;
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	private String favoriteLanguageJ;
	private String favoriteLanguageP;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	private String[] operatingSystems;

	
	public Student() {
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "Usa");
		favoriteLanguageOptions = new LinkedHashMap<String, String>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("Python", "Python");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("Dart", "Dart");
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

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public String getCountryCodeP() {
		return countryCodeP;
	}

	public void setCountryCodeP(String countryCodeP) {
		this.countryCodeP = countryCodeP;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getFavoriteLanguageJ() {
		return favoriteLanguageJ;
	}

	public void setFavoriteLanguageJ(String favoriteLanguageJ) {
		this.favoriteLanguageJ = favoriteLanguageJ;
	}

	public String getFavoriteLanguageP() {
		return favoriteLanguageP;
	}

	public void setFavoriteLanguageP(String favoriteLanguageP) {
		this.favoriteLanguageP = favoriteLanguageP;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}
