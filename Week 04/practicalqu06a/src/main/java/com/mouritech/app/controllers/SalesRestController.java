package com.mouritech.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.app.models.Sales;
import com.mouritech.app.repositories.SalesRepository;

@RestController
@RequestMapping("/Sales")
public class SalesRestController {
	@Autowired
	private SalesRepository salesRepo;

	@GetMapping("/")
	public List<Sales> listSales() {
		return salesRepo.findAll();
	}

	@PostMapping("/")
	public Sales addSales(@RequestBody Sales sales) {
		return salesRepo.save(sales);
	}

	@PutMapping("/")
	public Sales updateSales(@RequestBody Sales sales) {
		return salesRepo.save(sales);
	}

	@DeleteMapping("/")
	public String deleteString(@RequestBody Sales sales) {
		salesRepo.delete(sales);
		return "Delete Sale Record";
	}
}
