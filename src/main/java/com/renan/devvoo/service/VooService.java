package com.renan.devvoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renan.devvoo.entity.Voo;
import com.renan.devvoo.repository.VooRepository;

@Service
public class VooService {

	@Autowired
	private VooRepository vooRepository;

	@Transactional(readOnly = true)
	public List<Voo> findAll() {
		return vooRepository.findByFlightSeatAvailable();
	}

	public Voo save(Voo voo) {
		return vooRepository.save(voo);
	}
}
