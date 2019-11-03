package chapter01;

public class Ex05 {

	public static void main(String[] args) {
		
		/**
		 * Test what happens after casting a number 
		 * whose value is greater than the maximum INT value - 
		 * back to INT.
		 */
		
		System.out.println("Maximum INTEGER value is: " + Integer.MAX_VALUE);
		
		var doubleNum=Integer.MAX_VALUE+1.0;
		
		System.out.println("After assigning to double and increasing by 1: " + doubleNum);
		
		System.out.println("After casting back to INT: " + (int)doubleNum);

	}

}
