package com.renan.devvoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
}
