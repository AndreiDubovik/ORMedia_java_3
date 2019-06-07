package by.omedia.lessons.lesson3;

public class ObjectExample {

	public static void main(String[] args) {
		
		Object ob = new Object("name");
		Object ob2 = new Object("name");
		System.out.println(ob==ob2);
		System.out.println(ob.equals(ob2));
		ob.setName("another name");
		System.out.println(ob.equals(ob2));
	}

}
