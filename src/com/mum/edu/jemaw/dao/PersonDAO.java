package com.mum.edu.jemaw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mum.edu.jemaw.model.Customer;
import com.mum.edu.jemaw.model.PaymentDetails;
import com.mum.edu.jemaw.model.Person;

public interface PersonDAO extends JpaRepository<Person,Long> {

}
