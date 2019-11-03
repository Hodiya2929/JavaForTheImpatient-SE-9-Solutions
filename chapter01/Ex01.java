package chapter01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		var num=scanner.nextInt();
		
		printInDiffBases(num);

	}
	
	public static void printInDiffBases(int num) {
		
		System.out.print("In Binary: " + Integer.toBinaryString(num));
		System.out.printf("\nIn Octal: %o", num);
		System.out.printf("\nIn Hexadecimal: %x",num);
		
		var reciprocal=1.0/num;
		
		System.out.printf("\nReciprocal in Hexadecimal: %a", reciprocal);
		
	}

}
