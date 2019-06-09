package by.omedia.lessons.lesson4;

public class CClass extends BClass{

	static{
		System.out.println("I am in point C");
	}
	
	{
		System.out.println("I am in point c1");
	}
	
	private Integer value;
	
	public CClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
