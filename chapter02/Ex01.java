package chapter02;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex01 { public static void main(String[] args) {

	LocalDate date = LocalDate.now().withDayOfMonth(1);

	int month;
	if (args.length >= 2) {        
		month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		date = LocalDate.of(year, month, 1);
	} else {
		month = date.getMonthValue();
	}
	//date = LocalDate.of(2019, 1, 1);

	System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

	DayOfWeek weekday = date.getDayOfWeek();

	int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday

	for (int i = 1; i <= (value % 7); i++) //for 7 (=Sunday) - don't print. for 1 = print 1 time ... 
		System.out.print("    ");

	while (date.getMonthValue() == month) {
		System.out.printf("%4d", date.getDayOfMonth());
		date = date.plusDays(1);
		if (date.getDayOfWeek().getValue() == 7) // if after increasing, the value is 7 then a new week starting
			System.out.println();
	}

	if (date.getDayOfWeek().getValue() != 7) // if the month ends on Friday, then we already printed a new line, otherwise - print a new line 
		System.out.println();
}
}




