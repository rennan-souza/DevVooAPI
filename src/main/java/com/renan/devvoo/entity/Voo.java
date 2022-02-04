package com.renan.devvoo.entity;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_voo")
public class Voo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Instant exitTime;

	private Instant arrivalTime;

	private String airportOfOrigin;

	private String destinationAirport;

	private int numberOfSeats;

	private double price;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "voo_id", referencedColumnName = "id")
	private List<FlightSeat> seats = new ArrayList<>();

	public Voo() {
	}

	public Voo(Long id, Instant exitTime, Instant arrivalTime, String airportOfOrigin, String destinationAirport,
			int numberOfSeats, double price, List<FlightSeat> seats) {
		super();
		this.id = id;
		this.exitTime = exitTime;
		this.arrivalTime = arrivalTime;
		this.airportOfOrigin = airportOfOrigin;
		this.destinationAirport = destinationAirport;
		this.numberOfSeats = numberOfSeats;
		this.price = price;
		this.seats = seats;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getExitTime() {
		return exitTime;
	}

	public void setExitTime(Instant exitTime) {
		this.exitTime = exitTime;
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

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<FlightSeat> getSeats() {
		return seats;
	}

	public void setSeats(List<FlightSeat> seats) {
		this.seats = seats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voo other = (Voo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
