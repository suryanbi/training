package com.example.jax_rs_client;

import com.example.entity.Product;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//(=========GET All=======)
		
//		Client client = ClientBuilder.newClient();
//		
//		WebTarget target = client.target("http://localhost:6011/products");
//		
//		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
//		
//		Response resp = builder.get();
//		
//		System.out.println(resp);
		
//		String object = resp.readEntity(String.class);
//		
//		System.out.println(object);
		
		
		//(=====GET using ID ========)
		
//		Client client = ClientBuilder.newClient();
//		
//		WebTarget target = client.target("http://localhost:6011/products/srch/131");
//		
//		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
//		
//		Response resp = builder.get();
//		
//		System.out.println(resp);
//		Product object2 = resp.readEntity(Product.class);
//		System.out.println(object2);
		
	
		//(=======POST(add)=========)
//		Product toAdd = new Product(114, "UPS", 25000);
//		
//		Response response = builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
//		
//		System.out.println(response.getStatus());
//		
//		System.out.println(response.readEntity(String.class));
		
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:6011/products");
		
		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
		
		Response resp = builder.get();
		
		int ch = 4;
		
		if(ch==4) {
			Product[] list = resp.readEntity(Product[].class);
			
			for(Product eachProduct:list) {
				System.out.println(eachProduct);
			}
			
		}
		
		if(ch==1) {
			String object = resp.readEntity(String.class);
			
			System.out.println(object);
		}
		
		if(ch==2) {
			WebTarget findByIdTarget = target.path("/srch/131");
			
			Invocation.Builder builder2 =
					findByIdTarget.request(MediaType.APPLICATION_JSON);
			
			Response findByResp = builder2.get();
			
			Product object2 = findByResp.readEntity(Product.class);
			
			System.out.println(object2);
		}
		
		if(ch==3) {
			
			Product toAdd = new Product(115, "FAN", 20000);
			
			Response response = builder.post(Entity.entity(toAdd,  MediaType.APPLICATION_JSON));
			
			System.out.println(response.getStatus());
			System.out.println(response.readEntity(String.class));
			
		}
		
	}

}
