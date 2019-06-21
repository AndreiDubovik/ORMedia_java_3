package by.omedia.lessons.lesson6;

public class ClassA implements Comparable<ClassA>{
	
	private int value;
	
	public ClassA(int value){
		this.value = value;
	}
	
	

	@Override
	public int hashCode() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassA other = (ClassA) obj;
		if (value != other.value)
			return false;
		return true;
	}



	@Override
	public int compareTo(ClassA o) {
		return this.value-o.value;
	}



	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	@Override
	public String toString() {
		return "ClassA [value=" + value + "]";
	}




	
	

}
