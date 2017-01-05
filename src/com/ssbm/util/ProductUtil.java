/**
 * 
 */
package com.ssbm.util;

import com.ssbm.service.ProductService;

/**
 * @author Santhosh
 *
 */
public class ProductUtil {
	public static ProductService getProductService() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return (ProductService) (Class.forName("com.sss.service.impl.ProductServiceImpl").newInstance());
	}
}
