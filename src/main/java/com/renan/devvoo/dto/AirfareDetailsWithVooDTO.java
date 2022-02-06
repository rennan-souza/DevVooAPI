package com.renan.devvoo.dto;

import java.time.Instant;

import com.renan.devvoo.entity.Airfare;

public class AirfareDetailsWithVooDTO {

	private Long id;
	private Long voo_id;
	private Instant timeToGo;
	private Instant arrivalTime;
	private String airportOfOrigin;
	private String destinationAirport;
	private String seat;
	private double price;

	public AirfareDetailsWithVooDTO() {
	}

	public AirfareDetailsWithVooDTO(Long id, Long voo_id, Instant timeToGo, Instant arrivalTime, 
			String airportOfOrigin, String destinationAirport, String seat, double price) {
		super();
		this.id = id;
		this.voo_id = voo_id;
		this.timeToGo = timeToGo;
		this.arrivalTime = arrivalTime;
		this.airportOfOrigin = airportOfOrigin;
		this.destinationAirport = destinationAirport;
		this.seat = seat;
		this.price = price;
	}

	public AirfareDetailsWithVooDTO(Airfare entity) {
		id = entity.getId();
		voo_id = entity.getVoo().getId();
		timeToGo = entity.getVoo().getTimeToGo();
		arrivalTime = entity.getVoo().getArrivalTime();
		airportOfOrigin = entity.getVoo().getAirportOfOrigin();
		destinationAirport = entity.getVoo().getDestinationAirport();
		seat = entity.getFlightSea().getName();
		price = entity.getVoo().getPrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVoo_id() {
		return voo_id;
	}

	public void setVoo_id(Long voo_id) {
		this.voo_id = voo_id;
	}

	public Instant getTimeToGo() {
		return timeToGo;
	}

	public void setTimeToGo(Instant timeToGo) {
		this.timeToGo = timeToGo;
	}

	public Instant getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Instant arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getAirportOfOrigin() {
		return airportOfOrigin;
	}

	public void setAirportOfOrigin(String airportOfOrigin) {
		this.airportOfOrigin = airportOfOrigin;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
