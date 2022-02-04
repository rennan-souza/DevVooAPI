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
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "tb_voo")
public class Voo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Informe a data e hora de partida do voo")
	private Instant timeToGo;

	@NotNull(message = "Informe a data e hora de chegada do voo")
	private Instant arrivalTime;

	@NotBlank(message = "Informe o aeroporto de origem")
	private String airportOfOrigin;

	@NotBlank(message = "Informe o aeroporto de destino")
	private String destinationAirport;

	@Min(value = 2, message = "O voo deve ter no mínimo 2 assentos")
	private int numberOfSeats;

	@Positive(message = "Preço deve ser um valor positivo")
	private double price;
	
	@NotEmpty(message = "Informe os assentos do voo")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "voo_id", referencedColumnName = "id")
	private List<FlightSeat> seats = new ArrayList<>();

	public Voo() {
	}

	public Voo(Long id, Instant timeToGo, Instant arrivalTime, String airportOfOrigin, String destinationAirport,
			int numberOfSeats, double price, List<FlightSeat> seats) {
		super();
		this.id = id;
		this.timeToGo = timeToGo;
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
