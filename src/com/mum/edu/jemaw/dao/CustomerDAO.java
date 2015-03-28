package com.mum.edu.jemaw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mum.edu.jemaw.model.Address;
import com.mum.edu.jemaw.model.Customer;

public interface CustomerDAO extends JpaRepository<Customer,Long>{

}
