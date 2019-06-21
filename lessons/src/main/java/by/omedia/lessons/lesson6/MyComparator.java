package by.omedia.lessons.lesson6;

import java.util.Comparator;

public class MyComparator implements Comparator<ClassA>{

	@Override
	public int compare(ClassA o1, ClassA o2) {
		return o1.compareTo(o2);
	}

}
