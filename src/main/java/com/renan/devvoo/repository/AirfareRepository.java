package com.renan.devvoo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.renan.devvoo.dto.AirfareDetailsWithVooDTO;
import com.renan.devvoo.entity.Airfare;

public interface AirfareRepository extends JpaRepository<Airfare, Long> {

	@Query("SELECT obj FROM Airfare obj WHERE obj.customer.id = :id ORDER BY obj.id DESC")
	List<AirfareDetailsWithVooDTO> findAirfareByCustomer(Long id);
	
	@Query("SELECT obj FROM Airfare obj WHERE obj.voo.id = :id ORDER BY obj.id DESC")
	List<AirfareDetailsWithVooDTO> findAirfareByVoo(Long id);
}
