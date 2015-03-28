package com.mum.edu.jemaw.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mum.edu.jemaw.model.PaymentDetails;
import com.mum.edu.jemaw.model.Product;

public interface ProductDAO extends JpaRepository<Product,Long>{

	List<Product> findByName(String name);
}
