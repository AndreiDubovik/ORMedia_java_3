package lesson9;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Starter {

	public static void main(String[] args) {
		
		
		for(int i = 0;i<20;i++){
			//Executors.newCachedThreadPool().submit(new CatRannable(new Cat()));
			ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
			Future f = executor.submit(new Task(i));
			while(!f.isDone()){
				
			}
			executor.shutdown();
			
		}
			
	}

}
