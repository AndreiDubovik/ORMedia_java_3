package by.omedia.lessons.lesson5;

public class Wrapper <T>{
	
	private T object;
	
	public Wrapper(T ob){
		this.object = ob;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	
}
