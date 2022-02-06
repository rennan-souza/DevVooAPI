package com.renan.devvoo.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.renan.devvoo.dto.AirfareDetailsWithVooDTO;
import com.renan.devvoo.dto.AirfareResponseDTO;
import com.renan.devvoo.entity.Airfare;
import com.renan.devvoo.service.AirfareService;

@RestController
@RequestMapping(value = "airline-tickets")
public class AirfareController {

	@Autowired
	private AirfareService airfareService;
	
	@PostMapping
	public ResponseEntity<AirfareResponseDTO> save(@Valid @RequestBody Airfare airfare) {

		Airfare airfareRegistered = airfareService.save(airfare);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(airfareRegistered.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new AirfareResponseDTO(airfareRegistered));
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<AirfareDetailsWithVooDTO> findById(@PathVariable Long id) {
		AirfareDetailsWithVooDTO airfare = airfareService.findById(id);
		return ResponseEntity.ok().body(airfare);
	}
}
