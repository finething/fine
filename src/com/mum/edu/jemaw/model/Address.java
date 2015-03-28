package com.mum.edu.jemaw.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;




@Entity
public class Address   implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty(message="Enter street")
	private String street;
	@NotEmpty(message="Enter city")
	@Pattern(regexp="\\w{3,25}", message="{Location.validation}")
	private String city;
	@NotEmpty(message="Enter state")
	@Pattern(regexp="\\w{3,25}", message="{Location.validation}")
	private String state;
	@NotEmpty(message="Enter zip")
	@Digits(integer=4,message="Enter valid zip code", fraction = 0)
	private String zip;
	@NotEmpty(message="Enter country name")
	private String country;
	


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
