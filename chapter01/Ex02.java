package chapter01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter an angle: ");
		
		var angle=scan.nextInt();
				
		System.out.println("Normalized angle (% operator): " + ((angle % 360) + 360) % 360);
		
		System.out.println("Normalized angle (Math.floorMod): "+ Math.floorMod(angle, 360));
			
	}

}
