package com.NativeQuery.Crud;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Service s=new Service();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1. for insert");
		System.out.println("Press 2.for update");
		System.out.println("Press 3. for delete");
		System.out.println("Press 4. for select");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			s.insert();
			break;
		case 2:
			s.update();
			break;
		case 3:
			s.delete();
			break;
		case 4: 
			s.select();
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		
	}

}
