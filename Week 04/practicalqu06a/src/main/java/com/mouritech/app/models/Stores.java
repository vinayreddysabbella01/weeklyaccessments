package com.mouritech.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stores")
public class Stores implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6048672420442395560L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long storeId;
	private String firstName, lastName, email;
	private long phone;
	private int countryId;
	@OneToOne(cascade = CascadeType.ALL)
	private Sales sales;
	@ManyToMany
	@JoinTable(name = "products_stores", joinColumns = { @JoinColumn(name = "stores_storid") }, inverseJoinColumns = {
			@JoinColumn(name = "products_productid") })
	private List<Products> products;

	public Long getCustomerId() {
		return storeId;
	}

	public void setCustomerId(Long storeId) {
		this.storeId = storeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

}
