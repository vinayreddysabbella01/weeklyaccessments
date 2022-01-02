package com.mouritech.app.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "countries")
public class Countries implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5754689545712054378L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long countryId;
	private String name;
	private long regionId;
	@OneToOne
	private CountriesCurrencies countriesCurrencies;
	@ManyToOne
	private Regions regions;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "countries")
	private Set<Customers> customers;

	
}
