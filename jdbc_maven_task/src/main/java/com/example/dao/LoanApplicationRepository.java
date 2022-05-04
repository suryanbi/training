
package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.Customer;
import com.example.LoanApplication;
import com.example.ifaces.CrudRepository;

public class LoanApplicationRepository implements CrudRepository<LoanApplication> {
	
	private Connection con;
	
	public LoanApplicationRepository(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int add(LoanApplication loan) {
		
		int rowAdded = 0;
		
		String sql = "INSERT INTO SURYA_LOANAPPLICATION VALUES (?,?,?)";
		String sql1 = "INSERT INTO SURYA_CUSTOMER VALUES  (?,?,?,?)";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			try(PreparedStatement pstmt2 = con.prepareStatement(sql1)){
			
			
			pstmt.setInt(1, loan.getApplicationNumber());
			pstmt.setInt(2, loan.getCustomer().getCustomerId());
			pstmt.setInt(3, loan.getLoanAmount());
			
			
			
			pstmt2.setInt(1, loan.getCustomer().getCustomerId());
			pstmt2.setString(2, loan.getCustomer().getCustomerName());
			pstmt2.setLong(3, loan.getCustomer().getPhoneNumber());
			pstmt2.setInt(4, loan.getCustomer().getCreditScore());
			
			pstmt2.executeUpdate();
			rowAdded = pstmt.executeUpdate();
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
			
		
		
		
		return rowAdded;
	}

	@Override
	public List<LoanApplication> findAll() {
		List<LoanApplication> loanApplicationList = new ArrayList<LoanApplication>();
		
		String sql = "SELECT * FROM SURYA_CUSTOMER LEFT OUTER JOIN SURYA_LOANAPPLICATION ON CUSTOMER_ID = CUSTOMER";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int customerId = rs.getInt("customer_id");
				String customerName = rs.getString("customer_name");
				long phoneNumber = rs.getLong("phone_number");
				int creditScore = rs.getInt("credit_score");
				
				int applicationNumber = rs.getInt("application_number");
				int loanAmount = rs.getInt("loan_amount");
				
				Customer customer = new Customer(customerId,customerName, phoneNumber, creditScore );
				LoanApplication loanApplication = new LoanApplication(applicationNumber, customer, loanAmount);
				
				loanApplicationList.add(loanApplication);
				
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return loanApplicationList;
	}
	

	@Override
	public int remove(int id) {
		
		int rowDeleted = 0;
		
		String sql ="delete from surya_customer where customer_id=?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			rowDeleted = pstmt.executeUpdate();

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return rowDeleted;
		
		
			
	
	}

	@Override
	public LoanApplication findById(int id) {
		
		
		return null;
	}

	@Override
	public int update(int Id, LoanApplication member) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	

	
	

	

}
