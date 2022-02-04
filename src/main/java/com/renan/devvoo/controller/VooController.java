package com.renan.devvoo.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.renan.devvoo.entity.Voo;
import com.renan.devvoo.service.VooService;

@RestController
@RequestMapping(value = "/voos")
public class VooController {
	
	@Autowired
	private VooService vooService;
	
	@GetMapping
	public List<Voo> listar() {
		return vooService.findAll();
	}

	@PostMapping
	public ResponseEntity<Voo> save(@Valid @RequestBody Voo voo) {

		Voo vooRegistered = vooService.save(voo);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(vooRegistered.getId()).toUri();
		
		return ResponseEntity.created(uri).body(vooRegistered);
	}
}
