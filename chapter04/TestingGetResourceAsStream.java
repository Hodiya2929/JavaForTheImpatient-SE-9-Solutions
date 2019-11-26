package chapter04;

import java.util.Scanner;

public class TestingGetResourceAsStream {

	public static void main(String[] args) {
		
		var input = TestingGetResourceAsStream.class.getResourceAsStream("NoWay.txt");
		var scanner = new Scanner(input);
		while(scanner.hasNext())
			System.out.print(scanner.next()+" ");

	}

}
