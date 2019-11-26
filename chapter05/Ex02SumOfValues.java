package chapter05;

import java.io.FileNotFoundException;

public class Ex02SumOfValues {

	public static void main (String args[]) throws FileNotFoundException {

		var test = new Ex02SumOfValues();
		System.out.println(test.sumOfValues("C:/Users/עימנואל/java-eclipse-workspace/javaForTheImpatientSolutions/External_Sources/doubles.txt"));	

	}

	public double sumOfValues(String fileName) throws FileNotFoundException {

		double sum = 0;

		for (Double d :Ex01ReadDoubles.readValues(fileName)) 
			sum += d;

		return sum;
	}
}
