/**
 * 
 */
package com.ssbm.service.impl;

import java.sql.Timestamp;
import java.util.List;

import com.ssbm.dao.ProductDao;
import com.ssbm.pojo.Product;
import com.ssbm.service.ProductService;

/**
 * @author Santhosh
 *
 */
public class ProductServiceImpl implements ProductService{

	/* (non-Javadoc)
	 * @see com.ssbm.service.ProductService#getAllProducts(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public List<Product> getAllProducts() {
		ProductDao dao = new ProductDao();
		return dao.getAllProducts();
	}

	/* (non-Javadoc)
	 * @see com.sss.service.ProductService#createOrUpdateProduct(com.sss.pojo.Product)
	 */
	@Override
	public void createOrUpdateProduct(Product product) {
		ProductDao dao = new ProductDao();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		if(product.getId() == null)
			product.setCreatedTime(timestamp);
		else
			product.setUpdatedTime(timestamp);
		dao.createOrUpdateProduct(product);
		
	}
	
}
