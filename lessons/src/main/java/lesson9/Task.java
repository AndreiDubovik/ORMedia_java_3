package lesson9;

import java.util.concurrent.Callable;

public class Task implements Callable<String>{
	
	private String name;
	
	public Task(int i){
		this.name = "Task#"+i;
	}

	@Override
	public String call() throws Exception {
		
		System.out.println(this.name+" is starting...");
		Thread.currentThread().sleep((long)(Math.random()*3000));
		System.out.println(this.name+" finished");
		return this.name;
	}

}
