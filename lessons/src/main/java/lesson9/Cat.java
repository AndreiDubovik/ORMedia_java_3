package lesson9;

import java.util.concurrent.atomic.AtomicInteger;

public class Cat{
	
	private static AtomicInteger CAT_COUNT = new AtomicInteger();
	private static AtomicInteger MEOW_COUNT = new AtomicInteger();
	
	private String name;
	{
		
		name = "Cat#"+CAT_COUNT.incrementAndGet();
		
	}
	
	public void meow(){
		
		System.out.println(this.name+": meow "+MEOW_COUNT.incrementAndGet());
		
	}

}
