package by.omedia.lessons.lesson4;

public abstract class AClass implements ICanSayHello{
	/*
	 * класс абстрактный и поэтому нам необязательно переопределять
	 * методы интерфейса - они будут переопределены в классах-наследниках
	 */
	
	private static final int VALUE;
	
	static{
		VALUE = 0;
		System.out.println("point A");
		/*
		 * с помощью статических блоков инициализации можно
		 * инициализировать статические поля
		 */
	}
	
	{
		System.out.println("point a1");
		/*
		 * обычные блоки инициализации также используются для инициализации
		 * полей, но уже - полей объекта (то есть не статических)
		 */
	}
	
	private String name;
	
	public AClass(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.name!=null?this.name.hashCode():0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AClass other = (AClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AClass [name=" + name + "]"+FIELD;
	}
	

}
