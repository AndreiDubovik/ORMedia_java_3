package by.omedia.lessons.lesson3;

public class AnotherStringExample {

	public static void main(String[] args) {
		
		String line = "line";
		char chars[] = {'l','i','n','e'};
		char[]char2 = chars;
		String line2 = "line";
		//System.out.println(line==line2);
		System.out.println(line==line2);
		line2 = line2.substring(0,3).concat("!");
		System.out.println(line2);
		System.out.println(line==line2);
		char2[3] = '!';
		System.out.println(char2);
		System.out.println(char2==chars);
		/*
		 * Иллюстрация имутабельности стрингов
		 * Стринги всегда будут уникальны
		 */
	}

}
