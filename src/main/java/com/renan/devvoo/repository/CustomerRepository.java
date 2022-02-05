package com.renan.devvoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renan.devvoo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	boolean existsByCpf(String cpf);
	
	boolean existsById(Long id);
}
