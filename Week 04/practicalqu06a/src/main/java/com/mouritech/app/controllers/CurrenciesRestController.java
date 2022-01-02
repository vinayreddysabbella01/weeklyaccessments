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

import com.mouritech.app.models.Currencies;
import com.mouritech.app.repositories.CurrenciesRepository;


@RestController
@RequestMapping("/Currencies")
public class CurrenciesRestController {
	@Autowired
	private CurrenciesRepository curncyRepo;

	@PostMapping("/")
	public Currencies addCurrencies(@RequestBody Currencies curncy ) {
		return curncyRepo.save(curncy);
	}

	@GetMapping("/")
	public List<Currencies> listCurrencies() {
		return curncyRepo.findAll();
	}

	@PutMapping("/")
	public Currencies updateCurrencies(@RequestBody Currencies curncy) {
		return curncyRepo.save(curncy);
	}

	@DeleteMapping("/")
	public String deleteCurrencies(@RequestBody Currencies curncy) {
		curncyRepo.delete(curncy);
		return "Deleted Currency";
	}
}
