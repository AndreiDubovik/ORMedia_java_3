package by.omedia.lessons.lesson5;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("d");
		System.out.println(list.contains("d"));
		list.add("d");
		System.out.println(list.size());

	}
	
	private static class A{
		public boolean equals(){
			return true;
		}
		
		public int hashCode(){
			return 1;
		}
	}

}
