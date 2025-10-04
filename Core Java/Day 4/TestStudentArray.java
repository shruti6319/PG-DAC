import java.util.Scanner;

public class TestStudentArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. add new student\n2. display all\n3. search by id");
		System.out.println("4. search by name\n5. update marks\n6.exit\nchoice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			boolean status =StudentService.addNewStudent();
			if(status) {
				System.out.println("Student added successfully");
			}else {
				System.out.println("Error : Not added");
			}
		case 2:
			StudentService.displayAll();
			
		case 6:
			sc.close();
			System.out.println("Thankyou for visiting .... ");
		default:
			System.out.println("wrong choice");
			
		}
		
		
		}while(choice!=6);
	}

}
