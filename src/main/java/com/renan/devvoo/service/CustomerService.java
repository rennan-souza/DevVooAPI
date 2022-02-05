package com.renan.devvoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renan.devvoo.entity.Customer;
import com.renan.devvoo.repository.CustomerRepository;
import com.renan.devvoo.service.exceptions.BadRequestException;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Transactional(readOnly = false)
	public Customer save(Customer customer) {
		
		boolean existsCpf = customerRepository.existsByCpf(customer.getCpf());

		if (existsCpf) {
			throw new BadRequestException("CPF já possuí cadastro");
		}
		
		return customerRepository.save(customer);
	}
}
