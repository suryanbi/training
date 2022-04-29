package com.example.demo.services;

import java.sql.*;
import java.util.*;
import com.example.entity.*;

public class ProductService {
	
	private Connection con;

	public ProductService(Connection con) {
		super();
		this.con = con;
	}
	
	public int updatePriceByName(String productName, double newPrice) {
		
		int rowsUpdated = 0;
		
		String sql = "update surya_product set price=? where product_name=?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setDouble(1, newPrice);
			pstmt.setString(2, productName);
			rowsUpdated = pstmt.executeUpdate();

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return rowsUpdated;
	}
	
	
	public int deleteByInt(int id) {
		
		int rowDeleted = 0;
		
		String sql ="delete from surya_product where product_id=?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			rowDeleted = pstmt.executeUpdate();

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return rowDeleted;
		
	}
	
	public Optional<Product> findById(int id) {
		
		Optional<Product> obj = Optional.empty();
		
		String sql = "select * from surya_product where product_id=?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int productId = rs.getInt("product_id");
				String productName = rs.getString("product_name");
				double price = rs.getDouble("price");
				
				Product prod = new Product(productId, productName, price);
				
				obj = Optional.of(prod);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return obj;
		
	}
	
	public int addProduct(Product product) {
		
		int rowAdded = 0;
		
		String sql = "insert into surya_product values (?,?,?)";

		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3, product.getPrice());
			
			rowAdded = pstmt.executeUpdate();
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
		
	}
	
	public List<Product> findAll(){
		
		List<Product> productList = new ArrayList<Product>();
		String sql = "select * from surya_product";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int productId = rs.getInt("product_id");
				String productName = rs.getString("product_name");
				double price = rs.getDouble("price");
				
				Product prod = new Product(productId, productName, price);
				
				productList.add(prod);
				
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}
	
//	public void usingTxn(Product prd1, Product prd2) {
//		
//		String sql = "insert into surya_product values (?,?,?)";
//		
//		try(PreparedStatement pstmt = con.prepareStatement(sql);
//				){
//			
//			con.setAutoCommit(false);
//			
//			pstmt.setInt(1, prd1.getProductId());
//			pstmt.setString(2, prd1.getProductName());
//			pstmt.setDouble(3, prd1.getPrice());
//			
//			int rowAdded1 = pstmt.executeUpdate();
//			
//			pstmt.setInt(1, prd2.getProductId());
//			pstmt.setString(2, prd2.getProductName());
//			pstmt.setDouble(3, prd2.getPrice());
//			
//			int rowAdded2 = pstmt.executeUpdate();
//			
//			if(prd2.getPrice()>prd1.getPrice()) {
//				con.commit();
//			}else {
//				con.rollback();
//			}
//			
//			System.out.println("Row Added:"+ rowAdded1+","+rowAdded2);
//			
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	
	
	public void usingTxnWithCatchBlock(Product prd1, Invoice inv) {
		
		String productAddSql = "insert into surya_product values (?,?,?)";
		String invoiceAddSql = "insert into surya_invoice values (?,?,?,?)";
		
		try(PreparedStatement productStmt = con.prepareStatement(productAddSql);
			PreparedStatement invoiceStmt = con.prepareStatement(invoiceAddSql)){
			
			con.setAutoCommit(false);
			
			productStmt.setInt(1, prd1.getProductId());
			productStmt.setString(2, prd1.getProductName());
			productStmt.setDouble(3, prd1.getPrice());
			
			int productAddCount = productStmt.executeUpdate();
			
			invoiceStmt.setInt(1, inv.getInvoiceNumber());
			invoiceStmt.setString(2, inv.getCustomerName());
			invoiceStmt.setDouble(3, inv.getQuality());
			invoiceStmt.setInt(4, inv.getProductRef());
			
			invoiceStmt.executeUpdate();
			
			
				con.commit();
			
				
			}catch (SQLException e) {
				e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	

		
	}
	
	
	
	
	
	
	}}
