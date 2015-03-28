package com.mum.edu.jemaw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mum.edu.jemaw.model.Product;
import com.mum.edu.jemaw.model.ShoppingCart;



public interface ShoppingCartDAO extends JpaRepository<ShoppingCart,Long> {

}
