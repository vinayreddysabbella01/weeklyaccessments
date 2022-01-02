package com.mouritech.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
public class Sales implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2003504513979948386L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long saleId;
	private long salesChannel, orderNumber, productId, customerId, currencyId, netAmount, tax, shippingCost,
			grossAmount;
	@OneToOne(cascade = CascadeType.ALL)
	private Stores stores;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sales")
	private List<Currencies> currencies;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sales")
	private List<Products> products;
	@ManyToOne
	private Customers customers;

	public Long getSaleId() {
		return saleId;
	}

	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}

	public long getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(long salesChannel) {
		this.salesChannel = salesChannel;
	}

	public long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(long currencyId) {
		this.currencyId = currencyId;
	}

	public long getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(long netAmount) {
		this.netAmount = netAmount;
	}

	public long getTax() {
		return tax;
	}

	public void setTax(long tax) {
		this.tax = tax;
	}

	public long getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(long shippingCost) {
		this.shippingCost = shippingCost;
	}

	public long getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(long grossAmount) {
		this.grossAmount = grossAmount;
	}

	public Stores getStores() {
		return stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	public List<Currencies> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<Currencies> currencies) {
		this.currencies = currencies;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

}
