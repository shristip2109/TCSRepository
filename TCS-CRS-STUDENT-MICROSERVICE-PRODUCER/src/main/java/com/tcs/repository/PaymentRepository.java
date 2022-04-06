package com.tcs.repository;

import org.springframework.data.repository.CrudRepository;


import com.tcs.entity.Payment;


public interface PaymentRepository<C> extends CrudRepository< Payment, Integer> {
	
}
