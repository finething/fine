package com.mum.edu.jemaw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mum.edu.jemaw.model.Address;
import com.mum.edu.jemaw.model.PaymentDetails;

public interface PaymentInfoDAO extends JpaRepository<PaymentDetails,Long> {

}
