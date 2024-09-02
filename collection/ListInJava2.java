package collection;

import java.util.ArrayList;
import java.util.List;

public class ListInJava2 {

	public static void main(String[] args) {

		
		List<Student> s=new ArrayList<Student>();
		s.add(new Student(20,"mansi"));
		s.add(new Student(30, "maheshya"));
		
//		for(int i=0; i<s.size();i++)
//		{
//			Student s1=s.get(i);
//			System.out.println(s1.id);
//			System.out.println(s1.name);
//			System.out.println("********");
//		
//		}
		
		for(Student st:s)
		{
			System.out.println(st.id);
			System.out.println(st.name);
			System.out.println("*****************************");
		}
	}

}
