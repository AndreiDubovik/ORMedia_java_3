package by.omedia.lessons.lessons2;

public class Lesson2 {

	public static void main(String[] args) {
		int[]array = new int[3];
		initialize(array,1,5);
		show(array);
		System.out.println();
		referenceExample(array);
		show(array);
		System.out.println();
		anotherReferenceExample(array);
		show(array);
	}
	
	public static void initialize(int [] array, int min, int max){
		for(int i=0;i<array.length;i++)array[i]=random(min,max);
	}
	
	public static void initialize(int [][] array, int min, int max){
		for(int row=0;row<array.length;row++){
			for(int column=0;column<array[row].length;column++){
				array[row][column] = random(min,max);
			}
		}
	}

	public static int random(int min,int max){
		return (int)(Math.random()*(max-min+1)+min);
	}
	
	public static void show(int[][]array){
		for(int row=0;row<array.length;row++){
			for(int column=0;column<array[row].length;column++){
				System.out.print(array[row][column]+" ");
			}
			System.out.println();
		}
	}
	
	public static void show(int[]array){
		int i = 0;
		while(array.length!=i){
			System.out.print(array[i]+" ");
			i++;
		};
	}
	
	public static void show(char[]array){
		int i = 0;
		while(array.length!=i){
			System.out.print(array[i]+" ");
			i++;
		};
	}
	
	public static void referenceExample(int i){
		i=0;
		System.out.println(i);
	}
	
	public static void referenceExample(int[]array){
		for(int i=0;i<array.length;i++)array[i]=0;
	}
	
	public static void anotherReferenceExample(int[]array){
		array = new int[0];
	}

}

