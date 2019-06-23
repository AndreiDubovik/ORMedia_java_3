package by.omedia.lessons.lesson8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Starter {

	public static void main(String[] args) {
	
		streamExample3();

	}
	
	public static void streamExample1(){
		int[]array = {1,5,88,89,9};
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		System.out.println(min);
		System.out.println(max);
	}

	public static void streamExample2(){
		int [] array = {-4585,11,54,1,98,14,15,-99,125,452,-200};
		int result = Arrays.stream(array).filter(x->x<0).map(x->x*(-1)).max().getAsInt();
		System.out.println(result);
	}
	
	public static void streamExample3(){
		Stream<String> stream = Stream.of("kk","yyy","Line","fgfgfgf","jjjjjoyu","Fyytty","uuuuuuuuuuuuuu");
		stream.filter(line->line.length()>3).limit(1).collect(Collectors.toList()).forEach(System.out::println);
		
	}
	
}
