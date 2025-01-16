package demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectTask {
	Connect ob=new Connect();
	Scanner sc=new Scanner(System.in);
public void selectAll() throws SQLException,ClassNotFoundException {
	Connection con=ob.getConnection();
	String sql="select * from todo";
	PreparedStatement ps=con.prepareStatement(sql);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		System.out.println("ID \t\t\t\t\t Title\t\t\t\t Title_status");
		System.out.println(rs.getInt(1)+"\t\t\t\t"+rs.getString(2)+"\t\t\t\t"+ rs.getString(3));
	}
}

public void selectById()throws SQLException,ClassNotFoundException {
	Connection con=ob.getConnection();
	System.out.println("Enter id ");
	int id=sc.nextInt();
	
	String sql="select * from todo where id=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, id);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		System.out.println("ID \t\t\t\t\t Title\t\t\t\t Title_status");
		System.out.println(rs.getInt(1)+"\t\t\t\t"+rs.getString(2)+"\t\t\t\t"+ rs.getString(3));
}}
public void selectByStatus() throws SQLException,ClassNotFoundException {
	Connection con=ob.getConnection();
	System.out.println("Enter status ");
	String status=sc.next();
	
	String sql="select * from todo where title_status=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, status);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		System.out.println("ID \t\t\t\t\t Title\t\t\t\t Title_status");
		System.out.println(rs.getInt(1)+"\t\t\t\t"+rs.getString(2)+"\t\t\t\t"+ rs.getString(3));
}}
public void selectByTitle() throws SQLException ,ClassNotFoundException{
	Connection con=ob.getConnection();
	System.out.println("Enter title ");
	String title=sc.next();
	
	String sql="select * from todo where title=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, title);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		System.out.println("ID \t\t\t\t\t Title\t\t\t\t Title_status");
		System.out.println(rs.getInt(1)+"\t\t\t\t"+rs.getString(2)+"\t\t\t\t"+ rs.getString(3));
}
}
}
