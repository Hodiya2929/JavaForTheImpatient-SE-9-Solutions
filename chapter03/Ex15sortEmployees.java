package chapter03;

import java.util.Arrays;
import java.util.Comparator;


public class Ex15sortEmployees {
	
	public static Ex15Employee[] sortEmployeesByNameAndSalary(Ex15Employee[] list){
		
		Arrays.sort(list,Comparator.comparing(Ex15Employee::getSalary).thenComparing(Ex15Employee::getName));
		
		return list;
		
	}
	
	public static Ex15Employee[] sortEmployeesByNameAndSalaryReversed(Ex15Employee[] list){
		
		Arrays.sort(list,Comparator.comparing(Ex15Employee::getSalary).reversed().thenComparing(Ex15Employee::getName));
		
		return list;
		
	}
	
	
	
	public static void main(String[] args) {
		Ex15Employee[] list = new Ex15Employee[5];
		list[0] = new Ex15Employee("Amir", 30_000);
		list[1] = new Ex15Employee("Itshak", 15_000);
		list[2] = new Ex15Employee("Shalom", 15_000);
		list[3] = new Ex15Employee("Yafit", 15_000);
		list[4] = new Ex15Employee("Shlomo", 50_000);
		
		sortEmployeesByNameAndSalary(list);
		
		 for (Ex15Employee emp : list) {
			System.out.println(emp);
		}
		 
		 sortEmployeesByNameAndSalaryReversed(list);
		 for (Ex15Employee emp : list) {
				System.out.println(emp);
			}
	}

}
