/**
 * 
 */
package com.ssbm.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
