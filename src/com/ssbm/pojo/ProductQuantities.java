/**
 * 
 */
package com.ssbm.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	@OneToMany(fetch = FetchType.EAGER, mappedBy="id")
	private Integer id;
	
	/**
	 * product weight
	 */
	private Float quantity;
	
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
}
