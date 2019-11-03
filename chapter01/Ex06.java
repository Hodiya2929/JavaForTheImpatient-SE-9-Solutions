package chapter01;

import java.math.BigInteger;

public class Ex06 {
	
	/*
	 * In this case recursion is not efficient, because of the function calls, 
	 * but it's for practice only.
	 */


	public static void main(String[] args) {
	
		System.out.println("Factorial of 1000: " + bigFactorial(new BigInteger("1000")));
		
	}
	
	public static BigInteger bigFactorial(BigInteger num) {
		
		if(num.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		
		else return num.multiply(bigFactorial(num.subtract(BigInteger.ONE)));
		
	}

}
