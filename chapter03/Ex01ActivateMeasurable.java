package chapter03;

import java.util.ArrayList;

public class Ex01ActivateMeasurable {

	public static void main(String[] args) {

		var moshe = new Ex01Employee("Moshe", 302645385, 10500.34);
		var itshak = new Ex01Employee("Itshak",34868345, 150_203.2);
		var amir = new Ex01Employee("Amir", 3448796, 12_234.2);
		var fadi = new Ex01Employee("Fadi", 456798347, 6034.6);

		/*
		 * Working with arrayList is more convenient, but the question requirement 
		 * is to have an array argument. 
		 */
		var employeeArray = new ArrayList<Ex01Employee>();

		employeeArray.add(moshe);
		employeeArray.add(itshak);
		employeeArray.add(amir);
		employeeArray.add(fadi);
		
		Ex01Employee[] emp = employeeArray.toArray(new Ex01Employee[4]);

		System.out.printf("Average of Employees salaries: %f ", average(emp));

	}

	public static double average(Ex01Measurable[] objects) {//consider the other solution

		double average = 0;

		for (Ex01Measurable obj : objects) 
			average+=obj.getMeasured();

		return average/objects.length;
	}

}
