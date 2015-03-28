package com.mum.edu.jemaw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mum.edu.jemaw.model.Address;
import com.mum.edu.jemaw.model.Order;

public interface OrderDAO extends JpaRepository<Order,Long>{

}
