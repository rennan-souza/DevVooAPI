package com.renan.devvoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renan.devvoo.entity.Airfare;

public interface AirfareRepository extends JpaRepository<Airfare, Long> {

}
