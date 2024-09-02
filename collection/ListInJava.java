package collection;
import java.util.ArrayList;
//import collection.Employee;
import java.util.List;
public class ListInJava {
	
	public static void main(String args[])
	{
		List<Employee> hcl=new ArrayList<Employee>();
		
		Employee e= new Employee(20,"Mansi");
		hcl.add(e);
		
		
		hcl.add(new Employee(30,"Mahesh"));
		//System.out.println(hcl);
		
		
		for(int i=0; i<hcl.size();i++)
		{
			//System.out.println(hcl.get(i));
			
			Employee e1=hcl.get(i);
			System.out.println(e1.id);
			System.out.println(e1.name);
			System.out.println("****************");
		}
		
	}

}
