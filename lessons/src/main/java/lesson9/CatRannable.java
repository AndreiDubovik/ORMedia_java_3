package lesson9;

public class CatRannable implements Runnable{

	private Cat cat;
	
	public CatRannable(Cat cat){
		this.cat = cat;
	}
	
	@Override
	public void run() {

		while(true){
			cat.meow();
			try {
				Thread.currentThread().sleep((long) (10000*Math.random()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
