package com.renan.devvoo.service;

import java.util.Optional;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renan.devvoo.dto.AirfareDetailsWithVooDTO;
import com.renan.devvoo.entity.Airfare;
import com.renan.devvoo.entity.FlightSeat;
import com.renan.devvoo.repository.AirfareRepository;
import com.renan.devvoo.repository.CustomerRepository;
import com.renan.devvoo.repository.FlightSeatRepository;
import com.renan.devvoo.service.exceptions.BadRequestException;
import com.renan.devvoo.service.exceptions.ResourceNotFoundException;

@Service
public class AirfareService {

	@Autowired
	private AirfareRepository airfareRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private FlightSeatRepository flightSeatRepository;

	@Transactional(readOnly = false)
	public Airfare save(Airfare airfare) {

		boolean customer = customerRepository.existsById(airfare.getCustomer().getId());

		if (customer == false) {
			throw new BadRequestException("Cliente inválido");
		}

		FlightSeat seat = flightSeatRepository.getById(airfare.getFlightSea().getId());

		if (seat.isAvailable() == false) {
			throw new BadRequestException("O assento escolhido não está disponível");
		}
		
		
		String code = RandomStringUtils.randomNumeric(10);
		
		airfare.setPurchaseCode(code);

		Airfare airfareRegistered = airfareRepository.save(airfare);

		seat.setAvailable(false);
		flightSeatRepository.save(seat);

		return airfareRegistered;
	}
	
	@Transactional(readOnly = true)
	public AirfareDetailsWithVooDTO findById(Long id) {
		Optional<Airfare> obj = airfareRepository.findById(id);
		Airfare airfare = obj.orElseThrow(() -> new ResourceNotFoundException("Passagem aérea não encontrada"));
		return new AirfareDetailsWithVooDTO(airfare);
	}
}
