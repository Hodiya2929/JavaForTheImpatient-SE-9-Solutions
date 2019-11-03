package chapter02;

import static java.lang.Integer.parseInt;
import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static java.lang.System.out;

public class Ex11 {
	
	/*
	 * Exercise: change the 'calendar' class to use static import instead of
	 *  explicitly calling the static methods.
	 *  
	 */

	public static void main(String[] args) {

		var date = now().withDayOfMonth(1);
		int month;
		if (args.length >= 2) {    
			month = parseInt(args[0]);
			var year = parseInt(args[1]);
			date = of(year, month, 1);
		} else 
			month = date.getMonthValue();


		out.println(" Mon Tue Wed Thu Fri Sat Sun");
		var weekday = date.getDayOfWeek();
		var value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
		for (int i = 1; i < value; i++) 
			out.print("    ");
		while (date.getMonthValue() == month) {
			out.printf("%4d", date.getDayOfMonth());
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1) 
				out.println();
		}
		if (date.getDayOfWeek().getValue() != 1) 
			out.println();

	}
}
