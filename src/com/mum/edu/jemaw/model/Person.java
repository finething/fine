package com.mum.edu.jemaw.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
	@Id
	@Column(name = "person_id")
	@GeneratedValue
	private Long id;
	@NotEmpty(message="Enter the first name")
	private String firstName;
	@NotEmpty(message="Enter the last name")
	private String lastName;
	@Pattern(regexp="\\d{3}-\\d{7}", message="{PhoneNumber.validation}")
	private String phoneNumber;
	@NotEmpty(message="Enter email address")
	@Email(message="{Email.validation}")
	private String email;
	@Past(message="Date of birth can not be in future")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dob;
	@OneToOne(cascade = CascadeType.ALL)
	@Valid
	private Address address;
	@NotEmpty(message="Enter Usernamce")
	@Size(min=6,max=10,message="Username must be between 6 and 10")
	private String username;
	@NotEmpty(message="Enter Password")
	@Size(min=6,max=10,message="Password must be between 8 and 10")
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
}