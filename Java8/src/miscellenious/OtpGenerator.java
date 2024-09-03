package miscellenious;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OtpGenerator {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		Random otp=new Random(1000);
		int otp2=otp.nextInt();
		System.out.println(otp2);
		
		System.out.println("Enter the OTP : ");
		int otp1=sc.nextInt();
		
		ArrayList<Student> coep=new ArrayList<Student>();
		
		if(otp1==otp2)
		{
			System.out.println("enter id name mob");
			int id=sc.nextInt();
			String name=sc.next();
			String mob=sc.next();
			coep.add(new Student(id,name,mob));
		}
		else
		{
			System.out.println("Wrong OTP ! enter again ");
		}
		
		for(Student e:coep)
		{
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.mob);
			System.out.println("**************");
		}
		

	
	}

}


class Student
{
	int id;
	String name;
	String mob;
	public Student(int id, String name, String mob)
	{
		this.id=id;
		this.name=name;
		this.mob=mob;
	}
}