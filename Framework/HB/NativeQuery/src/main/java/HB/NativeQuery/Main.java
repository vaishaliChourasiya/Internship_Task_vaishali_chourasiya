package HB.NativeQuery;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Service ob=new Service();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1. for add");
		System.out.println("Press 2. for update");
		System.out.println("Press 3.for delete");
		System.out.println("Press 4. for select All");
		System.out.println("Press 5. for select By Id");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
				ob.add();
			break;
		case 2:ob.update();
		
			break;
		case 3:	ob.delete();
			break;
		case 4:	ob.selectAll();
			break;
		case 5:	ob.selectById();
			break;
		default:
			System.out.println("Invalid choice");
			
			
		}
	}
}
