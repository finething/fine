package com.mum.edu.jemaw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.edu.jemaw.dao.CustomerDAO;
import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.model.Customer;
import com.mum.edu.jemaw.service.CustomerService;
 
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	//@Autowired
	private CustomerDAO customerDAO;
	
	public void saveCustomer(Customer customer){
		customerDAO.save(customer);
	}
	
	
}
