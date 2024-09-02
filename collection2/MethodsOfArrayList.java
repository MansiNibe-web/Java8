package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsOfArrayList {

	public static void main(String[] args) {

		
		List<Integer> l1=new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(896);
		l1.add(10);
		l1.add(96);
		l1.add(0);
		l1.add(16);
		
		for(int i:l1)
		{
			System.out.println(i);
		}
		
		//to sort the elements in list collection provides the sort method : 
		
		Collections.sort(l1);
		
		System.out.println("AFTER SORTING THE ELEMENTS IN ASSENDING ORDER : ");
		
		for(int i:l1)
		{
			System.out.println(i);
		}
		
		System.out.println("AFTER SORTING THE ELEMENTS IN DESENDING ORDER :");
		
		for(int i=l1.size()-1; i>0; i--)
		{
			System.out.println(l1.get(i));
		}
		
	}

}
