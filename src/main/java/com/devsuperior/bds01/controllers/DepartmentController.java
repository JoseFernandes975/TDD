package com.devsuperior.bds01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.services.DepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService services;
	
	@GetMapping
	public ResponseEntity<List<DepartmentDTO>> findAll(){
		List<DepartmentDTO> list = services.findAll();
		return ResponseEntity.ok(list);
	}

}