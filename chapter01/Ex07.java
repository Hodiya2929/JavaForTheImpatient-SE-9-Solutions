package chapter01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		
		 /*
		   Consider this solution:
		   var in = new Scanner(System.in);
           var one = (int) in.nextLong();
           var two = (int) in.nextLong();
		  */

		Scanner scan=new Scanner(System.in);
		//Reads as Strings and convert to unsigned int
		System.out.println("Insert two numbers between 0 - 4294967295: ");
		var str1=scan.next();
		var str2=scan.next();

		var num1=Integer.parseUnsignedInt(str1); 
		var num2=Integer.parseUnsignedInt(str2); 

		System.out.println("Unsigned sum: "+(Integer.toUnsignedLong(num1)+Integer.toUnsignedLong(num2)));
		System.out.println("Unsigned division: " +Integer.divideUnsigned(num1, num2));
		System.out.println("Unsigned remainder: "+Integer.remainderUnsigned(num1, num2));
		System.out.println("Unsigned product: "+(Integer.toUnsignedLong(num1)*Integer.toUnsignedLong(num2)));
		System.out.println("Unsigned difference: "+(Integer.toUnsignedLong(num1)-Integer.toUnsignedLong(num2)));

	}

}
