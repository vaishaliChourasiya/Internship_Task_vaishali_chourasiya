package demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateTask {
	Connect ob=new Connect();
	Scanner sc=new Scanner(System.in);
	public void updateAll() throws SQLException,ClassNotFoundException {
		Connection con=	ob.getConnection();
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("Enter title and status to update");
		String title=sc.next();
		String status=sc.next();
		String sql="update todo set title=? , title_status=? where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(3, id);
		ps.setString(1, title);
		ps.setString(2, status);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("updated Successfully");
		}
		else {
			System.out.println("Not updated Successfully");
		}
	}
	public void updateTitle() throws SQLException,ClassNotFoundException {
		Connection con=	ob.getConnection();
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("Enter title to update");
		String title=sc.next();
		
		String sql="update todo set title=? where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(2, id);
		ps.setString(1, title);
		
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("updated Successfully");
		}
		else {
			System.out.println("Not updated Successfully");
		}
	}
	public void UpdateStatus() throws SQLException,ClassNotFoundException {
		Connection con=	ob.getConnection();
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("Enter status to update");
		
		String status=sc.next();
		String sql="update todo set title_status=? where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(2, id);
		
		ps.setString(1, status);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("updated Successfully");
		}
		else {
			System.out.println("Not updated Successfully");
		}
	}
}
