package by.omedia.lessons.lesson4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		String line = sc.nextLine();
		try{
			int i = Integer.parseInt(line);
			System.out.println(i);
		}catch(NumberFormatException e){
			System.out.println("Вы ввели какую-то дичь");
		}

	}

}
