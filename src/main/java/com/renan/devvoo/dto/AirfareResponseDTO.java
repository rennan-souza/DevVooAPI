package com.renan.devvoo.dto;

import com.renan.devvoo.entity.Airfare;

public class AirfareResponseDTO {

	private String purchaseCode;

	public AirfareResponseDTO() {
	}

	public AirfareResponseDTO(String purchaseCode) {
		super();
		this.purchaseCode = purchaseCode;
	}

	public AirfareResponseDTO(Airfare entity) {
		purchaseCode = entity.getPurchaseCode();
	}

	public String getPurchaseCode() {
		return purchaseCode;
	}

	public void setPurchaseCode(String purchaseCode) {
		this.purchaseCode = purchaseCode;
	}
}