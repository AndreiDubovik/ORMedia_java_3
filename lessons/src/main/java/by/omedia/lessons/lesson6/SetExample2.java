package by.omedia.lessons.lesson6;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		
		
		Set<ObjectA>set = new HashSet<>();
		for(int i=0;i<10;i++){
			set.add(new ObjectA());
		}
		System.out.println(set.size());

	}

}
