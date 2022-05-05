package com.example.productresources;

import java.util.List;

import com.example.demo.services.ProductService;
import com.example.entity.Product;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/products")
public class ProductResource {
	
	private static ProductService service = new ProductService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> findAll(){
		return service.findAll();
	}
	
	@GET
	@Path("/srch/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("productId") int id){
		
		try {
			Product entity = service.findById(id)
					.orElseThrow(() -> new RuntimeException("Id Not Found"));
			
			return Response.ok(entity).build();
			
		}catch(RuntimeException e) {
			
			return Response.ok("Id Not Found").status(400).build();
			
		}
		
	}
		
			 
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response add(Product product) {
		
		int result = service.addProduct(product);
		if(result!=0) {
			return Response.ok(product).status(201).build();
		}else {
			return Response.ok("Not Created").status(400).build();
		}
	
	}
	
	@DELETE
	@Path("/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response remove(@PathParam("productId") int id) {
		
		int result = service.deleteByInt(id);
		
		if(result!=0) {
			return Response.ok("One Record Deleted").status(204).build();
		}else {
			return Response.status(404, "Not Deleted").build();
		}
	}
	
	@PUT
	@Path("/{productName}/{price}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response updatePriceByName(@PathParam("productName") String productName, @PathParam("price")double price) {
		
		int result = service.updatePriceByName(productName, price);
		
		if(result!=0) {
			return Response.ok("one resource updated").status(201).build();
		}else {
			return Response.ok("not updated").status(400,"invalid").build();
		}
	}
	
	

}

