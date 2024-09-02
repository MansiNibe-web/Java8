package core;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {

		List<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(109);
		numbers.add(23);
		numbers.add(45);
		
		
		for(int i:numbers)
		{
			System.out.println(i);
		}
		
		
		System.out.println("********************");
		
		numbers.forEach((n)->{
			System.out.println(n+1);
		});
		
		System.out.println("*********************");
		
		numbers.forEach((n)->{
			if(n==109)
			{
				System.out.println(++n);
			}
			else
			{
				System.out.println(false);
			}
		});
	}

}
