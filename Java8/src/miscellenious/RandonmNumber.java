package miscellenious;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandonmNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		Random otp=new Random();
		int otp2=otp.nextInt(1000);
		
		System.out.println(otp2);
		
		
		ArrayList<Employee> em=new ArrayList<Employee>();
		
		System.out.println("Enter the otp");
		int otp3=sc.nextInt();
		
		
		if(otp2==otp3)
		{
			
			System.out.println("Enter the ID and Name : ");
			int id=sc.nextInt();
			String name=sc.next();
			em.add(new Employee(id,name));
		}
		else
		{
			System.out.println("Wrong OTP ! enter again ");
		}
		
		for(Employee e:em)
		{
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println("**************");
		}
		
	}

}
class Employee
{
	int id;
	String name;
	
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
}