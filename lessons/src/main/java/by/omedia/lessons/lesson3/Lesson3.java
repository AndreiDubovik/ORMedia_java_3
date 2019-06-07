package by.omedia.lessons.lesson3;

import by.omedia.lessons.lessons2.Lesson2;

public class Lesson3 extends by.omedia.lessons.lessons2.Lesson2{

	public static void main(String[] args) {
	
		int field[][] = new int[8][8];
		for(int i = 1;i<4;i++){
			if(i==2)continue;
			while(true){
				int y = Lesson2.random(0, field.length-2);
				int x = Lesson2.random(0, field[0].length-2);
				if(isFree(field,x,y)){
					place(field,x,y,i);
					break;
				}
			}
		}
		Lesson2.show(field);
		
	}
	
	/**
	 *  Метод возвращает истину/ложь в зависимости от того не занята ли ячейка массива
	 * @param field
	 * @param x
	 * @param y
	 * @return
	 */
	static boolean isFree(int[][] field,int x, int y){
		return field[y][x]==0&&field[y+1][x]==0&&field[y][x+1]==0&&field[y+1][x+1]==0;
	}
	
	/**
	 *  Метод размещает необходимое нам значение в двумерном массиве 
	 *  
	 * @param field
	 * @param x
	 * @param y
	 * @param value
	 */
	static void place(int[][] field,int x, int y, int value){
		field[y][x]=value;
		field[y+1][x]=value;
		field[y][x+1]=value;
		field[y+1][x+1]=value;
	}
}
