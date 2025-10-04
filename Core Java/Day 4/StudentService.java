import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class StudentService {
	static Student[] studarr;
	static int cnt;
	static {
		   studarr=new Student[100];
		   studarr[0]=new Student(12,"Rajan",98,97,new Date(2000-11-11));
		   studarr[1]=new Student(13,"Atharva",98,97,new Date(1997-11-11));
		   studarr[2]=new Student(12,"Ashu",98,97,new Date(1997-11-11));
		   cnt=3;
	}
	
	public static boolean addNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int sid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		String nm =sc.nextLine();
		System.out.println("Enter marks1");
		float m1=sc.nextFloat();
		System.out.println("Enter marks2");
		float m2=sc.nextFloat();
		System.out.println("Enter birthdate (dd/mm/yyyy)");
		String dt=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date bdt=null;
		try {
			bdt=sdf.parse(dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Student s=new Student(sid,nm,m1,m2,bdt);
		if(cnt==studarr.length) {
			return false;
		}
		else {
			studarr[cnt]=s;
			cnt++;
			return true;
		}
			
	}
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(studarr[i]);
		}
	
	}

}
