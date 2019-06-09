package by.omedia.lessons.lesson4;

public class Starter {

	public static void main(String[] args) {
		
		AClass a = new BClass("a");
		AClass a2 = new BClass("a2");
		BClass c = new CClass("c");
		/*
		 * мы можем объявить ссылку по типу интерфейса
		 * важно здесь чтобы класс созданного объекта реализовывал этот интерфейс
		 */
		ICanSayHello hello = new CClass("hello");
		c.doSomething();
	}

}
