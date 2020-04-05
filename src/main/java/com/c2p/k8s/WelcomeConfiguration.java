package com.c2p.k8s;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("welcomeConfiguration")
@ConfigurationProperties
public class WelcomeConfiguration {
	
	@Value(value = "${firstname: FN}")
	private String firstname;

	@Value(value = "${lastname: LN}")
	private String lastname;

	@Value(value = "${middlename: MN}")
	private String middlename;

	@Value("${city: C}")
	private String city;

	@Value("${state: S}")
	private String state;

	@Value("${place: P}")
	private String place;

	@Value("${country: C}")
	private String country;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
