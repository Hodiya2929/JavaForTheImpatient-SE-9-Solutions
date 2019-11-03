package chapter01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex15 {
	
	int numOfRows; //number of rows in Pascal triangle.
	ArrayList<ArrayList<Integer>> pascal;
	 
	public Ex15(int numOfRows) {
		
		this.numOfRows = numOfRows;
		this.pascal = new ArrayList<ArrayList<Integer>>(this.numOfRows);
	}
	
	void fill() {

		for (int i = 0; i < this.numOfRows; i++) {
			
			this.pascal.add(new ArrayList<Integer>(i+1));
			
			var current = this.pascal.get(i);
			var currentSize = i+1;
			
			if(i == 0)
				current.add(1); // the first row
			
			else if(i == 1) {  // the second row
				current.add(1);
				current.add(1);
			}
			
			else { // the rest of the rows
				
			current.add(1);
			
			var oneBelow = pascal.get(i-1); // reference to the upper row.
				
			for(int index = 1; index < currentSize-1; index++)	
				current.add(index,oneBelow.get(index-1)+oneBelow.get(index));
			
			current.add(1);
			
			}
		}
	
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		for(ArrayList<Integer> row :this.pascal) 
		{
			for (Integer number : row) 
				builder.append(number+" ");
			builder.append("\n");
		}
		return builder.toString();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Please enter how many rows for pascal triangle ");
		
		Scanner scan = new Scanner(System.in);
		
		var n = scan.nextInt();
		
		scan.close();
		
		Ex15 pascal = new Ex15(n);
		
		pascal.fill();
		
		System.out.println(pascal.toString());
		
	}


	

}
