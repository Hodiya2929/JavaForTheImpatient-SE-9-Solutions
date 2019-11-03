package chapter01;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
	
		 	var scan = new Scanner(System.in);
		 	
		 	var textLine = scan.nextLine();
		 	
		 	int size = textLine.length();
		 	
		 	for (int index = 0; index < size; index++) 
				if(textLine.charAt(index)>127) //last value in ASCII is 127
					System.out.println(textLine.codePointAt(index));
				 
	}

}
