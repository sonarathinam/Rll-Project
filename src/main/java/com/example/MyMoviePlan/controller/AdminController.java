package com.example.MyMoviePlan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyMoviePlan.model.Cart;
import com.example.MyMoviePlan.model.Admin;
import com.example.MyMoviePlan.repository.AdminRepository;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
	
	@Autowired
	AdminRepository adminRepository;
	
	
	@PostMapping("/admin/add")
	public Admin addUser(@RequestBody(required = false) Admin user) {
		return adminRepository.save(user);
	}
	
	@GetMapping("/admin/getParticularadmin/{id}")
	public Optional<Admin> getadminById(@PathVariable Long Id) {
		return adminRepository.findById(Id);
	}

	@GetMapping("/admin/all")
	public List<Admin> getAlladmin() {
		return adminRepository.findAll();
	}
}