package chapter02;

import org.omg.CORBA.IntHolder;

public class Ex04 {

	public static void main(String[] args) {

		int a = 1;
		int b= 100;

		intSwapping(a, b);

		/*
		 * It not possible to implement a static function which swaps the contents
		 *  of two or more 'int' variables, because the variable are passed by value
		 *  which means that the content is passed to the function and not a reference
		 *  or a pointer.
		 */

		System.out.printf("After calling to 'intSwapping' on a & b: a = %d and b = %d\n",a,b);
		
		IntHolder num1 = new IntHolder(1);
		IntHolder num2 = new IntHolder(100);
		
		swapIntHolder(num1, num2);
		
		/*
		 * With CORBA 'IntHolder' class - just works fine, because we pass a reference
		 * copy to the swapping function and changes the object value
		 */
		
		System.out.println("After calling to 'swapIntHoder' on num1 & num2: num1 = "+num1.value+" and num2 = "+num2.value);
		
		Integer num3 = 1;
		Integer num4 = 100;
		
		/*
		 * Again we can't implement a swapping function because we pass a reference copy
		 * to the swapping function, but the initial reference doesn't changes, however 
		 * if instead of using reference swapping we will use the method (e.g num3.valueOf(num4) - it will work) 
		 * 
		 */
		
		System.out.printf("After calling to 'swapIntegers' on num3 & num4: num3 = "+num3+" and num 4 = "+num4);
	
	}

	static void intSwapping(int x, int y) {

		int temp = x;
		x = y;
		y = temp;

	}

	static void swapIntHolder (IntHolder a, IntHolder b) {

		int temp = a.value	;	
		a.value = b.value;
		b.value = temp;
	}
	
	static void swapIntegers(Integer a, Integer b) {
		
		int temp = a;
		a = b;
		b = temp;
	}



}
