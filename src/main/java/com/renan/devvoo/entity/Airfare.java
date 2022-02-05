package com.renan.devvoo.entity;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Long vooId;

	@NotNull(message = "Informe o assento")
	private Long flightSeatId;

	@NotNull(message = "Informe o cliente")
	private Long customerId;

	private Instant purchaseDate;

	public Airfare() {
	}
	
	public Airfare(Long id, Long vooId, Long flightSeatId, Long customerId, Instant purchaseDate) {
		super();
		this.id = id;
		this.vooId = vooId;
		this.flightSeatId = flightSeatId;
		this.customerId = customerId;
		this.purchaseDate = purchaseDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVooId() {
		return vooId;
	}

	public void setVooId(Long vooId) {
		this.vooId = vooId;
	}

	public Long getFlightSeatId() {
		return flightSeatId;
	}

	public void setFlightSeatId(Long flightSeatId) {
		this.flightSeatId = flightSeatId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Instant getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Instant purchaseDate) {
		this.purchaseDate = purchaseDate;
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
