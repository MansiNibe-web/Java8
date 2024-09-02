package collection2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInjava2 {

	public static void main(String[] args) {
		
		List<Fruits> f=new ArrayList<Fruits>();
		
		f.add(new Fruits("mango", "laalbag","Sweet"));
		f.add(new Fruits("banana","hybrid","Sweet"));
		f.add(new Fruits("peru", "red","sweet"));
		
		
		Iterator<Fruits> itr=f.iterator();
		while(itr.hasNext())
		{
			Fruits ft=itr.next();
			System.out.println(ft.fruitname);
			System.out.println(ft.taste);
			System.out.println(ft.type);
			System.out.println("*****************************");
		}
		
	}

}
