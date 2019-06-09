package by.omedia.lessons.lesson4;

public class Starter3 {

	public static void main(String[] args) {
		Object ob = new Object();
		Object ob2 = new Object(){//анонимный класс с переопределением метода
			public String toString(){
				return "hello";
			}
		};
		Object ob3 = new Object(){};//анонимный класс
		System.out.println(ob);
		System.out.println(ob2);
		System.out.println(ob.getClass());
		System.out.println(ob3.getClass());

	}

}
