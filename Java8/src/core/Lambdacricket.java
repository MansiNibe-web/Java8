package core;

import java.util.ArrayList;
import java.util.List;

public class Lambdacricket {

	public static void main(String[] args) {

		List<Cricketplayer> player=new ArrayList<Cricketplayer>();
		
		player.add(new Cricketplayer("Mansi","9112990778","good",90));
		player.add(new Cricketplayer("Mahendra","77777789","good",80));
		player.add(new Cricketplayer("Mahesh","7774834341","good",90));
		
		for(Cricketplayer c:player)
		{
			System.out.println(c.name);
			System.out.println(c.mob);
			System.out.println(c.wealth);
			System.out.println(c.centuries);
			System.out.println("****************");
		}
		
		player.forEach((n)->{
			if(n.centuries<40)
			{
				System.out.println("Not a good player");
			}
			
			else {
				System.out.println(n.name+" Good player !");
			}
		});
		
	}

}
