package core;

import java.util.ArrayList;
import java.util.List;

public class Lambda2 {

	public static void main(String[] args) {


		Student stud=new Student();
		//stud.id=(-1);
		stud.id=10;
		stud.name="mansi";
		stud.address="Kolhar";
		
		Student stud2=new Student();
		stud2.id=20;
		stud2.name="Mahesh";
		stud2.address="Latur";
		
		List<Student> pravara=new ArrayList<Student>();
		
		pravara.add(stud);
		pravara.add(stud2);
		
		
		
		pravara.forEach((n)->{
			if(n.getId()<0)
			{
				System.out.println("wrong id !");
			}
			else
			{
				System.out.println(n.getId() +"  "+n.getName()+" "+n.getAddress());
				//System.out.println();
			}
		});
	}

}
