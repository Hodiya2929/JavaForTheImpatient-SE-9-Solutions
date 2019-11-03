package chapter01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
				
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		
		var num1=scan.nextInt();
		var num2=scan.nextInt();
		var num3=scan.nextInt();
		
		var max=0;

		if(num1>=num2&&num1>=num3)
			max=num1;
		else if(num2>=num1&&num2>=num3)
			max=num2;
		else max=num3;
	
		System.out.println("Finding Max with conditional operators: " + max);
	
		max=Math.max(Math.max(num1,num2), num3);
	
		System.out.println("Finding Max with Math.max: " + max);
	
	}

}
