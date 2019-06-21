package by.omedia.lessons.lesson6;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		Map<String,String>map = new IdentityHashMap<>();
		String line1 = "1";
		String line2 = new String("1");
		System.out.println(line1==line2);
		map.put(line1, "value1");
		map.put(line2, "value2");
		System.out.println(map.size());

	}

}
