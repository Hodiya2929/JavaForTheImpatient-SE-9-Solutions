package chapter05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ex04ReadDoubles {

	public enum Status { SUCCESS, FILE_NOT_FOUND, VALUE_NOT_DOUBLE }

	private static Status readValues(String fileName, List<Double> list) {

		if(fileName.isEmpty()||fileName == null)
			return Status.FILE_NOT_FOUND;

		//try with resources syntax
		try (var scanner = new Scanner(new File(fileName))){

			while(scanner.hasNext())
				list.add(scanner.nextDouble());

		} catch (FileNotFoundException e) {
			return Status.FILE_NOT_FOUND;
		}

		catch(InputMismatchException e) {
			return Status.VALUE_NOT_DOUBLE;
		}

		return Status.SUCCESS;
	}

	public static Status sumValues(String fileName, List<Double> list) {

		Status result = readValues(fileName, list);

		if(result != Status.SUCCESS )
			return result;

		double sum=0;

		for (Double d : list)
			sum+=d;

		System.out.printf("Sum is: %f\n", sum);

		return Status.SUCCESS;
	}


	public static void main(String[] args) {

		String fileName = "C:/Users/עימנואל/java-eclipse-workspace/javaForTheImpatientSolutions/External_Sources/doubles.txt";
		var list = new ArrayList<Double>();
		
		var status = sumValues(fileName, list);
		
		System.out.printf("Program exites with status: %s",status);
	}

}
