package com.renan.devvoo.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.renan.devvoo.entity.Airfare;
import com.renan.devvoo.service.AirfareService;

@RestController
@RequestMapping(value = "airline-tickets")
public class AirfareController {

	@Autowired
	private AirfareService airfareService;
	
	@PostMapping
	public ResponseEntity<Airfare> save(@Valid @RequestBody Airfare airfare) {

		Airfare airfareRegistered = airfareService.save(airfare);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(airfareRegistered.getId()).toUri();
		
		return ResponseEntity.created(uri).body(airfareRegistered);
	}
}
