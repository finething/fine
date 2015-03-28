package com.mum.edu.jemaw.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="person_id")
public class Admin extends Person implements Serializable{
	
private Date hireDate;

public Date getHireDate() {
	return hireDate;
}

public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
} 


}
