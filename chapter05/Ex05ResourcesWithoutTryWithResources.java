package chapter05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex05ResourcesWithoutTryWithResources {

	/*
	public static void readFromScannerAndPrintIntoAFile () throws IOException { 
		try (Scanner in = new Scanner(Paths.get("/a/path/to/some/file"));
				PrintWriter out = new PrintWriter("/a/path/to/some/file")) {
			while (in.hasNext())
				out.println(in.next().toLowerCase());
		}
	}
	 */

	public static void scannerAndPrintWriter(String scannerPath, String printWriterPath) {

		Scanner scanner = null;
		PrintWriter printWriter = null;

		try {

			scanner = new Scanner(Paths.get(scannerPath));
			printWriter = new PrintWriter(printWriterPath);

			while(scanner.hasNext())//IllegalState//NoSuchElement
				printWriter.println(scanner.next());
			System.out.println("Successfully finished!");
		}
		catch(InvalidPathException e) {
			System.err.println("String canno't be converted to path");
		}
		catch(FileNotFoundException e) {
			System.err.println("Couldn't find the file in the specified path");
		}
		catch (IOException e) {
			e.printStackTrace();			
		}
		catch(IllegalStateException e) {
			System.err.println("Cann't read because the scanner have been closed!");
		}

		finally {
			if(scanner != null)
				scanner.close();
			if(printWriter != null) 
				printWriter.close();			
		}

	}

	public static void main(String[] args) {

		String scannerPath = "C:/Users/עימנואל/java-eclipse-workspace/javaForTheImpatientSolutions/External_Sources/forScanner.txt";
		String printWriterPath = "C:/Users/עימנואל/java-eclipse-workspace/javaForTheImpatientSolutions/External_Sources/forPrintWriter.txt";
		scannerAndPrintWriter(scannerPath, printWriterPath);
	}

}
