package chapter05;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Ex12Assertions {

	// see also - https://stackoverflow.com/questions/1081409/why-should-i-use-asserts

	public static String gettingFileNameFromServer() {
		String fileName = null;
		return fileName;
	}

	public static void main(String[] args) throws IOException {
		
		//Example of Objects.requireNonNull

		String fileName = gettingFileNameFromServer(); 
		Objects.requireNonNull(fileName); //uncomment and see the difference
		var scanner = new Scanner(Paths.get(fileName));
		scanner.close();
		
		//Example of assert obj != null
		
		var name = randomName();
		//The assumption is that name is not null because I wrote the randomName method
		assert name != null: "How is it possible?"; 
		System.out.println(name);
	}
	
	// returns a random name in random length
	private static String randomName() {
		
		var generator = new Random(System.currentTimeMillis());
		int length =1+generator.nextInt(9);
		var name = "";
		
		for(int i = 0; i < length; i++) {
			int a = 97;
			
			name += (char) (a+generator.nextInt(25));
		}
		return name;
	}

}
