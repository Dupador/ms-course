package com.example.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.example.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int day) {
		return new Payment("Bob",200.0,day);
	}
	
}
