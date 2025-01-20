package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class NewsFeedApplication {
	

		
		public static void main(String args[]) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/NewsFeedApplication";
			String username="root";
			String password="root";
			Connection con=DriverManager.getConnection(url,username,password);
			Scanner sc=new Scanner(System.in);
			int ch=0;
			do {
			System.out.println("welcome in News Feed Application");
			System.out.println("Press 1. for Add News Details");
			System.out.println("Press 2. for List news");
			System.out.println("Press 3. for Exit");
			NewsBl ob=new NewsBl();
			 ch=sc.nextInt();
			switch(ch) {
			
			case 1:	ob.add();
				break;
			case 2:	ob.listall();
				break;
			case 3:	System.out.println("exit");
				break;
			default:
				System.out.println("enter valid choice");
			}}
		while(ch!=3);
	}

}
