package chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex06DifferentSolutions {


	public static String bufferReading(Path path) {

		BufferedReader in = null;
		String result = null;

		try {
			in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			result = in.readLine();

		}
		catch(IOException e) {
			System.err.println("Caught IOException: "+e.getMessage());
		}
		finally {
			//if(in != null) - a checked exception - must be handled
				//in.close();		
		}

		return result;

	}

	public static String catchingInFinally(Path path) {

		BufferedReader in = null;
		String result = null;

		try {
			in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			result = in.readLine();

		}
		catch(IOException e) {
			System.err.println("Caught IOException: "+e.getMessage());
		}
		finally {
			if(in != null)

				try {
					in.close();	
				}
			catch(IOException e) {
				System.err.println("Cannot close the source");
			}
		}

		return result;
	}

	public static String tryFinallyInTryCatch(Path path) {

		BufferedReader in = null;
		String result = null;

		try {
			in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			result = in.readLine();
			try {
				if(in != null)
					in.close();	
			}
			catch(IOException e) {
				System.err.println("Cannot close the source");
			}
		}
		catch(IOException e) {
			System.err.println("Caught IOException: "+e.getMessage());
		}
		return result;
	}

	public static String tryWithResourcesWithACatch(Path path) {

		String result = null;

		try (var in = Files.newBufferedReader(path, StandardCharsets.UTF_8))
		{
			result = in.readLine();	
		}
		catch(IOException e) {
			System.err.println("Caught IOException: "+e.getMessage());
		}
		return result;
	}

	public static void main(String[] args) {

		Path path = Paths.get("C:/Users/עימנואל/java-eclipse-workspace/javaForTheImpatientSolutions/External_Sources/forScanner.txt");
		System.out.println(catchingInFinally(path));
		System.out.println(tryFinallyInTryCatch(path));
		System.out.println(tryWithResourcesWithACatch(path));
	}

}
