package chapter02;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/*run with Debug and follow the date reference (id changes when Local.of() is called )
		  date reference changes - Accessor
		*/
		LocalDate date = LocalDate.of(2019, 10, 20);
		
		date = LocalDate.of(2019, 10, 19);
		
		Scanner scan = new Scanner(System.in);
		
		/*run with Debug and follow the scanner reference (scan id doesn't changes)
		*scan reference doesn't changes but other fields change - Mutator
		*/
		var num1 = scan.nextInt();
		
		var num2 = scan.nextInt();
		
		var num3 = scan.nextInt();
		
		scan.close();
		
		/*
		 * Again rand reference doesn't changes and the object state is the same as before calling
		 * 
		 * nexiInt() method.
		 * 
		 *  public int nextInt() {
            return next(32);
            }
            
        public int nextInt(int bound) {
        if (bound <= 0)
            throw new IllegalArgumentException(BadBound);

        int r = next(31);
        int m = bound - 1;
        if ((bound & m) == 0)  // i.e., bound is a power of 2
            r = (int)((bound * (long)r) >> 31);
        else {
            for (int u = r;
                 u - (r = u % bound) + m < 0;
                 u = next(31))
                ;
        }
        return r;
    }

		 */
		
		Random rand = new Random();
		
		var num4 = rand.nextInt();
		
		var num5 = rand.nextInt();
		
		var num6 = rand.nextInt();
			
	}

}
