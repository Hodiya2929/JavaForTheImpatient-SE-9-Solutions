package chapter01;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
	//������ ������ ������� ������� ������� �"� �� ���� ������ ���� ���� ������� ������� ���� ����� 36 

		var rand = new Random(System.currentTimeMillis());
		var randomLongValue = rand.nextLong();
	
		System.out.println(Long.toString(randomLongValue, 36)+ " is base 36 of the Decimal value of:  "+ randomLongValue);		
	}

}
