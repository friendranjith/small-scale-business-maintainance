package com.ssbm.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ssbm.pojo.Product;
import com.ssbm.service.ProductService;
import com.ssbm.util.ProductUtil;

/**
 * @author Santhosh
 *
 */
@Path("/api/product")
public class ProductApi {
	
	@Path("list")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Product> getProductsList() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		try{
			ProductService service = ProductUtil.getProductService();
			return service.getAllProducts();
		}catch(Exception e){
			throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build());
		}
	}
	
	@PUT
	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void createProduct(Product product){
		try{
			ProductService service = ProductUtil.getProductService();
			service.createOrUpdateProduct(product);
		}catch(Exception e){
			throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build());
		}
	}
}
