package collection2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInJava3 {

	public static void main(String[] args) {

		List<Pen> p=new ArrayList<Pen>();
		
		p.add(new Pen("natraj","blue"));
		p.add(new Pen("bally","black"));
		
		Iterator<Pen> itr=p.iterator();
		while(itr.hasNext())
		{
			Pen p1=itr.next();
			System.out.println(p1.campany);
			System.out.println(p1.colour);
			System.out.println("*************************************");
		}
	}

}
