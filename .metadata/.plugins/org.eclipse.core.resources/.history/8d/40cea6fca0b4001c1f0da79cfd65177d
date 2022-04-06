package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.Payment;
import com.tcs.repository.PaymentRepository;



@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository <Payment> paymentRepository;
	
@Transactional
	public boolean addPayment (Payment payment) {
		return paymentRepository.save(payment) != null;	
		}
}
