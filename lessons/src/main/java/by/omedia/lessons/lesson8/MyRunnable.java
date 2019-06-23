package by.omedia.lessons.lesson8;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		int i=5;
		while(i>0){
			System.out.println("i = "+(i--));
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
