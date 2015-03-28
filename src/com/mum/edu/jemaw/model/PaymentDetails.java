package com.mum.edu.jemaw.model;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Nonnull;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class PaymentDetails implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty(message="Enter Owner Name")
	private String ownerName;
	@NotEmpty(message="Enter Card Number")
	private String cardNumber;
	@Past(message="Expiry date can not be in future")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date exipryDate;
	@Digits(fraction = 0, integer = 6, message="{Digits.validation}")
	private int cvv;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExipryDate() {
		return exipryDate;
	}
	public void setExipryDate(Date exipryDate) {
		this.exipryDate = exipryDate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
	
	

}