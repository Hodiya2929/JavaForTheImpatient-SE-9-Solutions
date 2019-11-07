package chapter03;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		
		var moshe = new Ex01Employee("Moshe", 302645385, 10500.34);
		var itshak = new Ex01Employee("Itshak",34868345, 150_203.2);
		var amir = new Ex01Employee("Amir", 3448796, 12_234.2);
		var fadi = new Ex01Employee("Fadi", 456798347, 6034.6);
		var answer = new Ex01Employee("Answer", 345645456, 2_332_346_034.0);
		
		var employeeArray = new ArrayList<Ex01Employee>();

		employeeArray.add(moshe);
		employeeArray.add(itshak);
		employeeArray.add(amir);
		employeeArray.add(answer);
		employeeArray.add(fadi);
		

		
		Ex01Employee[] emp = employeeArray.toArray(new Ex01Employee[5]);
		
		//'largest' returns an interface reference, but the object is of Employee type, so i had to cast it to Ex01Employee
		
		System.out.printf("The highest payed employee is: %s",(Ex01Employee)largest(emp));
		
		
	}

	public static Ex01Measurable largest(Ex01Measurable[] objects) {

		Ex01Measurable largest = objects[0];

		double max = 0.0;

		for (int i = 0; i < objects.length; i++) {
			if(objects[i].getMeasured() > max)
			{
				max = objects[i].getMeasured();
				largest = objects[i];
				}
		}

		return largest;
	}

}
