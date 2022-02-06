package com.renan.devvoo.dto;

import java.time.Instant;

import com.renan.devvoo.entity.Airfare;

public class AirfareDetailsWithVooDTO {

	private Long id;
	private Long customerId;
	private String customerName;
	private String customerCpf;
	private Long vooId;
	private Instant vooTimeToGo;
	private Instant vooArrivalTime;
	private String vooAirportOfOrigin;
	private String vooDestinationAirport;
	private String vooSeat;
	private double airfarePrice;
	private Instant purchaseDate;
	private String purchaseCode;

	public AirfareDetailsWithVooDTO() {
	}

	public AirfareDetailsWithVooDTO(Long id, Long customerId, String customerName, String customerCpf, Long vooId,
			Instant vooTimeToGo, Instant vooArrivalTime, String vooAirportOfOrigin, String vooDestinationAirport,
			String vooSeat, double airfarePrice, Instant purchaseDate, String purchaseCode) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCpf = customerCpf;
		this.vooId = vooId;
		this.vooTimeToGo = vooTimeToGo;
		this.vooArrivalTime = vooArrivalTime;
		this.vooAirportOfOrigin = vooAirportOfOrigin;
		this.vooDestinationAirport = vooDestinationAirport;
		this.vooSeat = vooSeat;
		this.airfarePrice = airfarePrice;
		this.purchaseDate = purchaseDate;
		this.purchaseCode = purchaseCode;
	}

	public AirfareDetailsWithVooDTO(Airfare entity) {
		id = entity.getId();
		vooId = entity.getVoo().getId();
		customerId = entity.getCustomer().getId();
		customerName = entity.getCustomer().getFullName();
		customerCpf = entity.getCustomer().getCpf();
		vooTimeToGo = entity.getVoo().getTimeToGo();
		vooArrivalTime = entity.getVoo().getArrivalTime();
		vooAirportOfOrigin = entity.getVoo().getAirportOfOrigin();
		vooDestinationAirport = entity.getVoo().getDestinationAirport();
		vooSeat = entity.getFlightSea().getName();
		airfarePrice = entity.getVoo().getPrice();
		purchaseDate = entity.getPurchaseDate();
		purchaseCode = entity.getPurchaseCode();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCpf() {
		return customerCpf;
	}

	public void setCustomerCpf(String customerCpf) {
		this.customerCpf = customerCpf;
	}

	public Long getVooId() {
		return vooId;
	}

	public void setVooId(Long vooId) {
		this.vooId = vooId;
	}

	public Instant getVooTimeToGo() {
		return vooTimeToGo;
	}

	public void setVooTimeToGo(Instant vooTimeToGo) {
		this.vooTimeToGo = vooTimeToGo;
	}

	public Instant getVooArrivalTime() {
		return vooArrivalTime;
	}

	public void setVooArrivalTime(Instant vooArrivalTime) {
		this.vooArrivalTime = vooArrivalTime;
	}

	public String getVooAirportOfOrigin() {
		return vooAirportOfOrigin;
	}

	public void setVooAirportOfOrigin(String vooAirportOfOrigin) {
		this.vooAirportOfOrigin = vooAirportOfOrigin;
	}

	public String getVooDestinationAirport() {
		return vooDestinationAirport;
	}

	public void setVooDestinationAirport(String vooDestinationAirport) {
		this.vooDestinationAirport = vooDestinationAirport;
	}

	public String getVooSeat() {
		return vooSeat;
	}

	public void setVooSeat(String vooSeat) {
		this.vooSeat = vooSeat;
	}

	public double getAirfarePrice() {
		return airfarePrice;
	}

	public void setAirfarePrice(double airfarePrice) {
		this.airfarePrice = airfarePrice;
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

	public void setPurchaseCode(String purchaseCode) {
		this.purchaseCode = purchaseCode;
	}
}
