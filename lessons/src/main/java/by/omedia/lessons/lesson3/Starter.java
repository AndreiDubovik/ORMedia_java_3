package by.omedia.lessons.lesson3;

public class Starter {

	public static void main(String[] args) {
		
		Object ob = new AnotherObject("Vova");
		//java.lang.Object ob = new java.lang.Object();
		((AnotherObject)ob).hello();
		System.out.println(ob.getName());
		System.out.println(ob);

	}

}
