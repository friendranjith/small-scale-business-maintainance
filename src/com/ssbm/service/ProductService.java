/**
 * 
 */
package com.ssbm.service;

import java.util.List;

import com.ssbm.pojo.Product;

/**
 * @author Santhosh
 *
 *	Interface related to Products
 */
public interface ProductService {
	
	/**
	 * Fetch all products of user
	 * @param request
	 * @return
	 */
	public abstract List<Product> getAllProducts();
	
	/**
	 * create or update product
	 */
	public abstract void createOrUpdateProduct(Product product);
	
}