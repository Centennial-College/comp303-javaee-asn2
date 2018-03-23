package com.shoppingcart.beans;

import java.io.Serializable;

/**
 * 
 * @class Product
 * @author
 * @description Data Access Object which represents a product in a shopping
 *              cart. This class is coded according to the JavaBeans API
 *              specifications.
 * @date 2018-03-22
 *
 */
public class Product implements Serializable {

	/**
	 * generated: default serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Properties of a Product include: SKU, Description, Number in stock, Unit
	 * Price, Rating
	 */
	private String sku;
	private String description;
	private int stockQuantity;
	private double unitPrice;
	private double rating;

	// provides a default, no-argument constructor
	public Product() {
	}

	// auto-generated getter/setters
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
