package by.omedia.lessons.lesson6;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		Map<ClassA,String>map = new TreeMap<>((o1,o2)->o1.compareTo(o2));
		for(int i = 0;i<100;i++){
			int key = (int)(Math.random()*10);
			ClassA a = new ClassA(key);
			map.put(a, Integer.toString(i));
		}
		System.out.println(map.size());
		Iterator<ClassA> it = map.keySet().iterator();
		while(it.hasNext()){
			ClassA ac = it.next();
			System.out.println(ac.toString()+" : "+map.get(ac));
		}
	}

}
