package chapter02;

import java.util.ArrayList;
import java.util.Random;

public class Ex10 {

	static class RandomNumbers {

		static final Random generator= new Random(); //static class methods can use static class variables, but cannot access instance variables  

		public static int randomElement(int[] array) {
			
			if(array.length == 0)
				return 0;
			
			else {

			int bound = array.length;

			int random = generator.nextInt(bound);

			return array[random];
			}
		}

		public static Integer randomElement(ArrayList<Integer> arrayList) {
			
			if(arrayList.isEmpty())
				return 0;
			
			else {

			int bound = arrayList.size();

			int random = generator.nextInt(bound);	

			return arrayList.get(random);
			
			}
		}
	}

	public static void main(String[] args) {
		
		int intArray[] = {1,2,3,4,5,6,7,8,9,10};
		
		var intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		System.out.printf("Calling randomElement on int[]: %d\n", RandomNumbers.randomElement(intArray));
		System.out.printf("Calling randomElement on arrayList: %d\n", RandomNumbers.randomElement(intList));
		 
	}



}
