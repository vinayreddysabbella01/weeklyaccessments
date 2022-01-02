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

import com.mouritech.app.models.CountriesCurrencies;
import com.mouritech.app.repositories.CountriesCurrenciesRepository;

@RestController
@RequestMapping("/countriescurrencies")
public class CountriesCurrenciesRestController {
	@Autowired
	private CountriesCurrenciesRepository CCRepo;

	@PostMapping("/")
	public CountriesCurrencies addCountiesCurrencies(@RequestBody CountriesCurrencies CC ) {
		return CCRepo.save(CC);
	}

	@GetMapping("/")
	public List<CountriesCurrencies> listCountriesCurrencies() {
		return CCRepo.findAll();
	}

	@PutMapping("/")
	public CountriesCurrencies updateCountriesCurrencies(@RequestBody CountriesCurrencies CC) {
		return CCRepo.save(CC);
	}

	@DeleteMapping("/")
	public String deleteCountriesCurrencies(@RequestBody CountriesCurrencies CC) {
		CCRepo.delete(CC);
		return "Deleted CountriesCurrencies";
	}
}
