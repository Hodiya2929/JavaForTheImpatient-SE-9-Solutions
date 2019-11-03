package chapter01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		var scan =new Scanner(System.in);
		
		var str= scan.next();
		
		var length=str.length();
		
		for(var size=1; size<length; size++)
			
			for (int index = 0; index <= length - size; index++) {
				
						if(!str.substring(index, index+size).isEmpty())
							System.out.print(str.substring(index, index+size)+" ");			
		}		
	}
}
