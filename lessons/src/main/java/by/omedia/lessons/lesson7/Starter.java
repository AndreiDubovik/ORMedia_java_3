package by.omedia.lessons.lesson7;

public class Starter {

	public static void main(String[] args){
			try {
				exceptionAnotherExample(3);
			} catch (AnotherException ee) {
				System.out.println("point 1");
			}catch(MyException|RuntimeException eee){
				System.out.println("point 2");
			}finally{
				System.out.println("I am in finally block");
			}
	}
	
	public static void exceptionExample(int i) {
		if(i==0)
			try {
				throw new MyException();
			} catch (MyException e) {
				e.printStackTrace();
			}
		System.out.println(i);
	}
	
	public static void exceptionAnotherExample(int i) throws MyException{
		if(i==0)throw new MyException();
		if(i==1)throw new AnotherException();
		if(i<0)throw new RuntimeException();
	}
}
