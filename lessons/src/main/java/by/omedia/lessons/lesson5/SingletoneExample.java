package by.omedia.lessons.lesson5;

public class SingletoneExample {
	
	private static SingletoneExample INSTANCE = new SingletoneExample();
	
	private SingletoneExample(){
		
	}
	
	public static SingletoneExample getInstance(){
		return INSTANCE;
	}
}
