package by.omedia.lessons.lesson3;

public class Object{
	
	private String name;
	private int someValue;
	{
		this.someValue = 7;
		System.out.println("point 2");
	}
	static{
		System.out.println("point 1");
	}
	
	public Object(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSomeValue() {
		return someValue;
	}

	public void setSomeValue(int someValue) {
		this.someValue = someValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + someValue;
		return result;
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Object other = (Object) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (someValue != other.someValue)
			return false;
		return true;
	}
	
	/*
	 * Попробуйте зааннотировать аннотацией @Override метод hrllo в AnotherObject и раскоментить
	 * метод ниже.
	 * Потом снова его закомментить
	 */
	
	/*
	public void hello(){
		System.out.println("Hello! My name is "+this.name);
	}
	*/
	
}
