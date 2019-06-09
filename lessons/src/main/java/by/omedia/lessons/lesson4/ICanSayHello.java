package by.omedia.lessons.lesson4;

/*
 * такая аннотация служит для указания на то, что в интерфейсе только один абстрактный
 */
@FunctionalInterface
public interface ICanSayHello {
	static final String FIELD = "something there...";
	void hello();
	/*
	 * начиная с версии 1.8 стала возможной умолчательная реализация 
	 * методов в интерфейсах
	 */
	default void doSomething(){
		System.out.println("Hello!");
	}
}
