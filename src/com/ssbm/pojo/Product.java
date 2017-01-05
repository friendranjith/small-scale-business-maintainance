package com.ssbm.pojo;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private Integer userId;
	
	private String measurement;
	
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "id")
	private SellerInfo sellerInfo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id")
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

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
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
