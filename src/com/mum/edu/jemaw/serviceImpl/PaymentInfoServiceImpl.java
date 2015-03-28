package com.mum.edu.jemaw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.dao.PaymentInfoDAO;
import com.mum.edu.jemaw.model.PaymentDetails;
import com.mum.edu.jemaw.service.PaymentInfoService;


@Service
@Transactional
public class PaymentInfoServiceImpl  implements PaymentInfoService {

}
