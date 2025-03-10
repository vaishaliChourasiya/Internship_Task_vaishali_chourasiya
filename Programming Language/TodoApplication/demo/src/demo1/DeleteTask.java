package demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTask {
	Connect ob=new Connect();
	Scanner sc=new Scanner(System.in);
	public void deleteById() throws SQLException ,ClassNotFoundException{
	Connection con=ob.getConnection();
	System.out.println("enter Id to delete a record");
	int id=sc.nextInt();
	String sql="delete from todo where id=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, id);
	int i=ps.executeUpdate();
	if(i>0) {
		System.out.println("delete a record successfully");
		
	}
	else {
		System.out.println("failed to deleted");
	}
	}
	public void deleteByStatus() throws SQLException ,ClassNotFoundException{
		Connection con=ob.getConnection();
		System.out.println("enter status to delete a record");
		String status=sc.next();
		String sql="delete from todo where title_status=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, status);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("delete a record successfully");
			
		}
		else {
			System.out.println("failed to deleted");
		}
	}
		public void deleteTitle( ) throws SQLException,ClassNotFoundException{
			Connection con=ob.getConnection();
			System.out.println("enter title to delete a record");
			String id=sc.next();
			String sql="delete from todo where title=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, id);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("delete a record successfully");
				
			}
			else {
				System.out.println("failed to deleted");
			}}
		public void deleteAll() throws SQLException,ClassNotFoundException {
			
			Connection con=ob.getConnection();
			System.out.println(" delete all record");
			
			String sql="delete from todo";
			PreparedStatement ps=con.prepareStatement(sql);
			
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("delete a record successfully");
				
			}
			else {
				System.out.println("failed to deleted");
			}
		}
	
	}

