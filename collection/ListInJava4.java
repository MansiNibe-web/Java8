package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInJava4 {

	public static void main(String[] args) {

		List<Student> s=new ArrayList<Student>();
		s.add(new Student(20,"raju"));
		s.add(new Student(40,"ram"));
		
		
//		for(Student st:s)
//		{
//			System.out.println(st.id);
//			System.out.println(st.name);
//			System.out.println("*************************");
//		}
//		
		
		Iterator<Student> itr=s.iterator();
		
		while(itr.hasNext())
		{
			Student st=itr.next();
			
			System.out.println(st.id);
			System.out.println(st.name);
			System.out.println("**************************************");
		}
		
		
		
	}

}
