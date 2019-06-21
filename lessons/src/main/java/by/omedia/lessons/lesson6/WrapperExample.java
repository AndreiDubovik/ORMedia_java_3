package by.omedia.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class WrapperExample {

	public static void main(String[] args) {
		
		List<Object>list = new ArrayList<>();
		int i = 1;
		list.add(i);
		for(Object ii:list)System.out.println(ii);

		
	}

}
