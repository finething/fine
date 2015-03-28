package com.mum.edu.jemaw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mum.edu.jemaw.model.Address;

public interface AddressDAO extends JpaRepository<Address,Long> {

}
