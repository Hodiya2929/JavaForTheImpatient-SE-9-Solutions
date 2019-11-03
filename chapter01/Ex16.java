package chapter01;

public class Ex16 {

	public static void main(String[] args) {
		
		double average = average(1,2,3,4,5,6,7,8,9 );
		System.out.println(average);

	}
	
	public static double average(double num, double...numbers) {
		
		double sum = num;
		
		for (double current : numbers) 
			sum+= current;
	
		return sum / (numbers.length + 1);
	}

}
