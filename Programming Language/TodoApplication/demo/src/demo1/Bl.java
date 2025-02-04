package demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Bl {
	Connect ob=new Connect();
	Scanner sc=new Scanner(System.in);
	public void add() throws SQLException, ClassNotFoundException{
	Connection con=	ob.getConnection();
		System.out.println("Enter title and status");
		String title=sc.next();
		String status=sc.next();
		String sql="insert into todo(title,title_status)values(?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, status);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Inserted Successfully");
		}
		else {
			System.out.println("Not Inserted Successfully");
		}
		
	}
	public void update() throws ClassNotFoundException, SQLException {
		updateTask ob=new updateTask();
		int ch;
		do {
		System.out.println("enter choice to update");
		System.out.println("press 1. for update all");
		System.out.println("press 2. for update title");
		System.out.println("press 3. for update Status");
		ch=sc.nextInt();
		switch(ch) {
		case 1:ob.updateAll();
			break;
		case 2:
				ob.updateTitle();
				break;
		case 3:
				ob.UpdateStatus();
				break;
		case 4:
				System.out.println("Exit from update");
				break;
		default:
			System.out.println("enter valid choice for update");
		}}while(ch!=4);
		
	}
	public void delete() throws SQLException,ClassNotFoundException {
		DeleteTask ob=new DeleteTask();
		int ch;
		do {
		System.out.println("enter choice to update");
		System.out.println("press 1. for  delte By Id");
		System.out.println("press 2. for delete by  title");
		System.out.println("press 3. for delete by Status");
		System.out.println("press 4. for delete by delete All");
		ch=sc.nextInt();
		switch(ch) {
		case 1:ob.deleteById();
			break;
		case 2:
				ob.deleteTitle();
				break;
		case 3:
				ob.deleteByStatus();
				break;
		case 4: ob.deleteAll();
			break;
		case 5:
				System.out.println("Exit from delete");
				break;
		default:
			System.out.println("enter valid choice for delete");
		}}while(ch!=4);
		
	}
	public void listAll() throws SQLException ,ClassNotFoundException{
		SelectTask ob=new SelectTask();
		int ch; 
		do {
		System.out.println("enter choice to select");
		System.out.println("press 1. for  select By Id");
		System.out.println("press 2. for select by  title");
		System.out.println("press 3. for select by Status");
		System.out.println("press 4. for select All");
		ch=sc.nextInt();
		switch(ch) {
		case 1:ob.selectById();
			break;
		case 2:
				ob.selectByTitle();
				break;
		case 3:
				ob.selectByStatus();
				break;
		case 4: ob.selectAll();
			break;
		case 5:
				System.out.println("Exit from select");
				break;
		default:
			System.out.println("enter valid choice for select");
		}}while(ch!=4);
		
	}
}
