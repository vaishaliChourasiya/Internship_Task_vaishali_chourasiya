package demo1;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws ClassNotFoundException, SQLException  {
		updateTask uob=new updateTask();
		Scanner sc=new Scanner(System.in);
		Bl ob=new Bl();
		int ch=0;
		do {
		System.out.println("Welcome in todo Application");
		System.out.println("Press 1. Add new task");
		System.out.println("Press 2. Editing existing task");
		System.out.println("Press 3. Remove Existing task");
		System.out.println("Press 4. ListAll ");
		System.out.println("Press 5. Exit");
		ch=sc.nextInt();	
		switch(ch) {
		case 1:	ob.add();
			break;
		case 2:	ob.update();
			break;
		case 3:ob.delete();
			break;
		case 4:ob.listAll();
			break;
		case 5:
				System.out.println("Exit");
			break;
		default:
			System.out.println("Enter valid choice");
		}
		}while(ch!=5);
	}
}

