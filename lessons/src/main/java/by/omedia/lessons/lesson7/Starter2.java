package by.omedia.lessons.lesson7;

public class Starter2 {

	public static void main(String[] args) {
		
		String line = "1823";
		int i;
		try{
			i = Integer.parseInt(line);
		}catch(NumberFormatException e){
			i = 0;
		}
		System.out.println(i);

	}
	
	

}
