package by.omedia.lessons.lesson3;

public class AnotherObject extends by.omedia.lessons.lesson3.Object{

	private String name;
	
	public AnotherObject(String name) {
		super(name);
	}
	
	
	public void hello(){
		System.out.println("hello!");
	}


	@Override
	public String toString() {
		return "AnotherObject [name=" + name + "]";
	}

}
