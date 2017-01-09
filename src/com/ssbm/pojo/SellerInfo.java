/**
 * 
 */
package com.ssbm.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Santhosh
 *
 */
@Entity
@Table(name="sellerinfo")
public class SellerInfo {
	@Id
	@GeneratedValue
	private Integer id;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="productid")
	private Product product;
	
	private String sellerName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
}
