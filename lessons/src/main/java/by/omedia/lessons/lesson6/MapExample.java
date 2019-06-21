package by.omedia.lessons.lesson6;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		ObjectA oa = new ObjectA();
		Map<ObjectA,String>map = new HashMap<>();
		map.put(oa, "value");
		System.out.println(map.get(oa));

	}

}
