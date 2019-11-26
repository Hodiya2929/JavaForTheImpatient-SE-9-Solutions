package chapter05;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Ex03HandlingPrecedingExceptions {

	public static void main(String[] args) {
		
		var fileName = "C:/Users/עימנואל/java-eclipse-workspace/javaForTheImpatientSolutions/External_Sources/doubles.txt";
		
		printDoubles(fileName);

	}

	public static void printDoubles(String fileName) {

		var doubleValues = new Ex02SumOfValues();

		try {
			var sumValue = doubleValues.sumOfValues(fileName);
			System.out.println(sumValue);
		} catch (FileNotFoundException e) {
			System.err.println("File is not in the specified location!");
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.err.println("The data in the file is not of a floating-point type!");
			e.printStackTrace();
		}

	}

}
