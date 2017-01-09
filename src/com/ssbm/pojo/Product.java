package com.ssbm.pojo;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue
	@NotNull
	private Integer id;
	
	private String name;
	
	private Integer userId;
	
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "product")
	private SellerInfo sellerInfo;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="product")
	private List<ProductQuantities> productQuantities;
	
	private Timestamp createdTime;
	
	private Timestamp updatedTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Integer getId() {
		return id;
	}

	public SellerInfo getSellerInfo() {
		return sellerInfo;
	}

	public void setSellerInfo(SellerInfo sellerInfo) {
		this.sellerInfo = sellerInfo;
	}

	public List<ProductQuantities> getProductQuantities() {
		return productQuantities;
	}

	public void setProductQuantities(List<ProductQuantities> productQuantities) {
		this.productQuantities = productQuantities;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
