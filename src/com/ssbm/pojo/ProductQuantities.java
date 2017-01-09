/**
 * 
 */
package com.ssbm.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

/**
 * @author Santhosh
 *
 * Embedded class of Product with one to many relationship
 * 
 */
@Entity
@Table(name="productquantities")
public class ProductQuantities {
	@Id
	@GeneratedValue
	@NotNull
	private Integer id;
	
	/**
	 * Product id
	 * Foreign key
	 */
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="productid")
	private Product product;
	/**
	 * product weight
	 */
	private Float quantity;
	
	/**
	 * Product measurement
	 */
	private String measurement;
	
	/**
	 * in cents
	 */
	private Long cost;
	
	/**
	 * discount in percentage 
	 */
	private float discount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}
}
