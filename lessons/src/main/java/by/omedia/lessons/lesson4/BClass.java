package by.omedia.lessons.lesson4;

public class BClass extends AClass implements ICanSaySomething{

	static{
		System.out.println("point B");
	}
	
	{
		System.out.println("point b1");
	}
	
	public BClass(String name) {
		super(name);
	}

	@Override
	public void hello() {
		/*
		 * переопределение метода интерфейса ICanSayHello
		 */
		System.out.println("hello");
		
	}

}
