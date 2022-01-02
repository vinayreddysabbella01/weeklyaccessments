package com.mouritech.app.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "countries_currencies")
public class CountriesCurrencies implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5766653882054816071L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ccId;
	@OneToOne(cascade = CascadeType.ALL)
	private Currencies currencies;
	@OneToOne(cascade = CascadeType.ALL)
	private Countries countries;

	public Currencies getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Currencies currencies) {
		this.currencies = currencies;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	public Long getCcId() {
		return ccId;
	}

	public void setCcId(Long ccId) {
		this.ccId = ccId;
	}

}
