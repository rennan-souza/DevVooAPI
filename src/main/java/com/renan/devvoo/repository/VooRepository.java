package com.renan.devvoo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.renan.devvoo.entity.Voo;

public interface VooRepository extends JpaRepository<Voo, Long> {
	
	@Query("SELECT DISTINCT obj FROM Voo obj JOIN FETCH obj.seats WHERE available = true")
	List<Voo> findByFlightSeatAvailable();
}
