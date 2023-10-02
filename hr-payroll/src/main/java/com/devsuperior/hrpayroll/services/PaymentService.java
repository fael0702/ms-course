package com.devsuperior.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("irineu", 500.0, days);
	}
}
