package chapter01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Ex13 {

	public static void main(String[] args) {
		
		final var size = 49;

		var lottery=new ArrayList<Integer>(size);

		for (int num = 1; num < 50; num++)//index 0 = 1,... , index 48 = 49
			lottery.add(num);

		var result=new ArrayList<Integer>(6);

		var random = new Random();
		int winningIndex;

		for(int i=0; i<6; i++) {
			
			winningIndex = random.nextInt(49-i);  
			result.add(lottery.remove(winningIndex));	
			
			}
		
		Collections.sort(result);
			
		for (var integer : result) 
			System.out.print(integer+" ");
		
	}			
}

