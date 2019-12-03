package chapter05;

public class Ex10RuntimeExceptionsInScannerAndPrintWriter {	
	/*
	 * Question: The methods of Scanner and PrintWriter object don't throw checked exceptions
	 * - in order to make them easier to use for beginners, why does that defeat the goal of
	 * making the classes easier to use?
	 * 
	 * Answer: Because if exceptions happens while reading or writing the user will find out
	 * only in runtime and then it will be harder to understand where the problem comes from,
	 * so it seems better idea to throw checked exceptions and force the user to deal with those
	 * situations
	 */
}
