package by.omedia.lessons.lesson4;

public class Starter2 {

	public static IViewer VIEWER;
	static{
		VIEWER = new MessageViewer();
	}
	
	public static void main(String[] args) {
		Object c = new StaticClass();
		VIEWER.show(c);

	}
	
	public static class StaticClass{
		
		/*
		 * Пример статического класса
		 */
		public String toString(){
			return "HELLO: "+this.hashCode();
		}
	}

}
