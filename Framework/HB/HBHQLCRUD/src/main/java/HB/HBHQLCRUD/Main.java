package HB.HBHQLCRUD;

import java.util.Scanner;



public class Main {
	public static void main(String args[]) {
		int ch;
		do {
		Service ob=new Service();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1. for insert");
		System.out.println("Press 2.for update");
		System.out.println("Press 3. for delete");
		System.out.println("Press 4. for select All");
		System.out.println("Press 5. for select by id");
		System.out.println("Enter your choice");
		 ch=sc.nextInt();
		switch(ch) {
		case 1:
				ob.add();
			break;
		case 2:
			ob.update();
			break;
		case 3:
			ob.delete();
			break;
		case 4:
				ob.selectAll();
				
			break;
		case 5:	ob.selectById();
			break;
		default:
			System.out.println("Invalid choice");
		}
		}
		while(ch!=5);
		
		
		
	}
	

}
