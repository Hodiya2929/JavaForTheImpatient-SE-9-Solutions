package chapter05;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex07TryWithResourcesQuestion {

	/*
	 * Explain why the first example is better than the second one.
	 * 
	 * Answer: As expected - in the second example there are exceptions which 
	 * don't properly handled. The exception that can occur while constructing the objects 
	 * aren't handled. In addition, if an exception occurs in the printWriter constructor - 
	 * the scanner is never closed, therefore the second example is a better solution because
	 * it handles exceptions in the constructors as well in the reverse order that they were built
	 */

	public static void firstExample(){

		try(var in = new Scanner(Paths.get("some/path/..."));
				var out = new PrintWriter("some fileName"))
		{
			while(in.hasNext())
				out.println(in.next().toLowerCase());

		} catch (IOException e) {

		}
	}


	public static void secondExample(){

		var in = new Scanner(Paths.get("some/path/..."));
		var out = new PrintWriter("some fileName");
//
		try(in;out)

		{
			while(in.hasNext())
				out.println(in.next().toLowerCase());
		}
	}
}
