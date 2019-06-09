package by.omedia.lessons.lesson4;


@FunctionalInterface
public interface ICanSayHello {
	static final String FIELD = "something there...";
	void hello();
	default void doSomething(){
		System.out.println("Hello!");
	}
}
