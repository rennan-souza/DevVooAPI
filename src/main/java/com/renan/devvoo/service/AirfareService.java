package com.renan.devvoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renan.devvoo.entity.Airfare;
import com.renan.devvoo.entity.FlightSeat;
import com.renan.devvoo.repository.AirfareRepository;
import com.renan.devvoo.repository.CustomerRepository;
import com.renan.devvoo.repository.FlightSeatRepository;
import com.renan.devvoo.service.exceptions.BadRequestException;

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
		
		boolean customer = customerRepository.existsById(airfare.getCustomerId());
		
		if (customer == false) {
			throw new BadRequestException("Cliente inválido");
		}
		
		FlightSeat seat = flightSeatRepository.getById(airfare.getFlightSeatId());
		
		if (seat.isAvailable() == false) {
			throw new BadRequestException("O assento escolhido não está disponível");
		}
		
		Airfare airfareRegistered = airfareRepository.save(airfare);
		
		seat.setAvailable(false);
		flightSeatRepository.save(seat);
		
		return airfareRegistered;
		
	}
}
