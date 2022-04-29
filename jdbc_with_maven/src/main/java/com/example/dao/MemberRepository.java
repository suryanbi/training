package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;
import java.sql.*;
import java.time.LocalDate;

public  class MemberRepository implements CrudRepository<Member> {
	
	private Connection con;
	
	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	public int add(Member obj) {

		int rowAdded = 0;
		
		String sql = "insert into suryamember values (?,?,?,?,?,?,?,?)";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, obj.getMemberId());
			pstmt.setString(2, obj.getMemberName());
			pstmt.setString(3, obj.getMemberAddress());
			pstmt.setDate(4,Date.valueOf(obj.getAccountOpenDate()));
			pstmt.setString(5,obj.getMemberShipType());
			pstmt.setDouble(6, obj.getFeesPaid());
			pstmt.setInt(7, obj.getMaxBooksAllowed());
			pstmt.setDouble(8, obj.getPenaltyAmount());
			
			rowAdded = pstmt.executeUpdate();

			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return rowAdded;
	}

	public List<Member> findAll() {
		
		List<Member> memberList = new ArrayList<Member>();
		String sql = "select * from suryamember";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int memberId = rs.getInt("member_id");
				String memberName = rs.getString("member_name");
				String memberAddress = rs.getString("member_address");
				LocalDate accOpenDate = rs.getDate("acc_open_date").toLocalDate();
				String membershipType = rs.getString("membership_type");
				double feesPaid = rs.getDouble("fees_paid");
				int maxBooksAllowed = rs.getInt("max_books_allowed");
				double penaltyAmount = rs.getDouble("penalty_amount");
				
				Member member = new Member(memberId, memberName, memberAddress, accOpenDate, membershipType,
						feesPaid, maxBooksAllowed, penaltyAmount);
				
				memberList.add(member);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return memberList;
	}

	public int remove(int id) {
		
		int rowDeleted = 0;
		
		String sql = "delete from suryamember where member_id =?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			rowDeleted = pstmt.executeUpdate();

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return rowDeleted;
		
		
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int Id, String memberName) {
		
		int rowUpdated = 0;
		
		String sql = "update suryamember set member_name = ? where member_id=?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, memberName);
			pstmt.setInt(2, Id);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		 
		return rowUpdated;
	}

	@Override
	public int update(int Id, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

}
