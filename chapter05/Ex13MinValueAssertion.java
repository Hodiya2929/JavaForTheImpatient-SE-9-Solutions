package chapter05;

import java.util.Arrays;
import java.util.Random;

public class Ex13MinValueAssertion {

	public static void main(String[] args) {

		int arr[] = new int[Integer.MAX_VALUE/5];

		var generator = new Random(System.currentTimeMillis());

		for (int i = 0; i < arr.length; i++) 
			arr[i] = generator.nextInt(Integer.MAX_VALUE);

		var currentTime = System.currentTimeMillis();
		min(arr);

		System.out.println("Min with assertion: "+ (System.currentTimeMillis()-currentTime));
		currentTime = System.currentTimeMillis();
		minWithoutAssertion(arr);
		System.out.println("Min without assertion: "+ (System.currentTimeMillis()-currentTime));
	}

	public static int min(int[] arr) {

		int min = arr[0];

		for (int i : arr) 
			min = Math.min(min, i);

		var effectivelyFinal = min;

		assert Arrays.stream(arr).allMatch( num ->  num >= effectivelyFinal):"Not Possible";


		return min;
	}

	public static int minWithoutAssertion(int[] arr) {

		int min = arr[0];

		for (int i : arr) 
			min = Math.min(min, i);

		return min;
	}

}
