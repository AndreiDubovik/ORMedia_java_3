package by.omedia.lessons.lesson8;

public class Starter2 {

	public static void main(String[] args) {
		
		new Thread(new MyRunnable()).start();
		new Thread(new Runnable(){

			@Override
			public void run() {
				
				while(true){
					System.out.println("HELLO!!!");
					try {
						Thread.currentThread().sleep(3333);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}).start();;
		System.out.println("I am here");
		

	}

}
