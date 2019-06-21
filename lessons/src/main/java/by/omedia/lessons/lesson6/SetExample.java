package by.omedia.lessons.lesson6;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String>set = new HashSet<>();
		String line1 = "1";
		String line2 = new String("1");
		System.out.println(line1==line2);
		set.add(line1);
		set.add(line2);
		System.out.println(set.size());

	}

}
