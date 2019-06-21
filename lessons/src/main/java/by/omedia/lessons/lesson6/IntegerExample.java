package by.omedia.lessons.lesson6;

public class IntegerExample {

	public static void main(String...args){
		Integer i1 = 128;
		Integer i2 = 128;
		Integer a1 = 127;
		Integer a2 = 127;
		Integer new1 = 127;
		Integer new2 = new Integer(127);
		System.out.println(i1==i2);
		System.out.println(a1==a2);
		System.out.println(new1==new2);
	}
	
	public static void varArgsExample(Object...ars){
		for(Object ob:ars)System.out.println(ob);
	}
}
