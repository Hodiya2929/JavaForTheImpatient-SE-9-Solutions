package chapter03;

import java.util.Random;

public class Ex16RandomSequence  {

	private static Random generator = new Random();


	public static Ex04IntSeuence randomInts(int low, int high) {

		return new RandomSequence(low, high);


	}

	static class RandomSequence implements Ex04IntSeuence{

		int low;
		int high;


		public RandomSequence(int low, int high) {
			this.low = low;
			this.high = high;
		}

		@Override
		public boolean hasNext() {
			return true;
		}

		@Override
		public int next() {
			return (low + generator.nextInt(high-low));
		}

	}

	public static void main(String args[]) {

		var intSeq = randomInts(10, 1000);
		
		for (int i = 0; i < 1000; i++) 
			System.out.printf("%d ",intSeq.next());



	}

}

