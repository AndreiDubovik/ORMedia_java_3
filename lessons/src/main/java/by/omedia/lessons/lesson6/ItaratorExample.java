package by.omedia.lessons.lesson6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItaratorExample {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>();
		list.add("hjh");
		list.add("jhgfhf");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
