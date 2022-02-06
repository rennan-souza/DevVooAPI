package com.renan.devvoo.entity;

import java.time.Instant;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_airfare")
public class Airfare {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Informe o voo")
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "voo_id", referencedColumnName = "id")
	private Voo voo;

	@NotNull(message = "Informe o assento")
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "flight_seat_id", referencedColumnName = "id")
	private FlightSeat flightSea;

	@NotNull(message = "Informe o cliente")
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private Customer customer;

	private Instant purchaseDate;

	private String purchaseCode;

	public Airfare() {
	}

	public Airfare(Long id, Voo voo, FlightSeat flightSea, Customer customer, Instant purchaseDate, 
			String purchaseCode) {
		super();
		this.id = id;
		this.voo = voo;
		this.flightSea = flightSea;
		this.customer = customer;
		this.purchaseDate = purchaseDate;
		this.purchaseCode = purchaseCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	public FlightSeat getFlightSea() {
		return flightSea;
	}

	public void setFlightSea(FlightSeat flightSea) {
		this.flightSea = flightSea;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Instant getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Instant purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	public String getPurchaseCode() {
		return purchaseCode;
	}

	public void setPurchaseCode(String code) {
		this.purchaseCode = code;
	}

	@PrePersist
	public void prePersist() {
		purchaseDate = Instant.now();
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
		Airfare other = (Airfare) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
