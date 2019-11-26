package chapter05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex01ReadDoubles {

	public static void main(String[] args) throws FileNotFoundException {

		var doubleArray = readValues("C:/Users/עימנואל/java-eclipse-workspace/javaForTheImpatientSolutions/External_Sources/doubles.txt");

		for (Double d : doubleArray) 
			System.out.println(d);

	}

	public static ArrayList<Double> readValues(String filename) throws FileNotFoundException {

		var file = new File(filename);

		var fileScanner = new Scanner(file);
		var doubleList = new ArrayList<Double>();


		//In case the values are not of double type - the resources are closed. Finally block always executed 
		try {
			while(fileScanner.hasNext()) 
				doubleList.add( Double.parseDouble( fileScanner.next() ) );
		}finally {
			fileScanner.close();
		}

		return doubleList;
	}
}
