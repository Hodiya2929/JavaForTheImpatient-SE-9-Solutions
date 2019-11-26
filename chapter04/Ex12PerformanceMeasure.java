package chapter04;

import java.util.Random;

public class Ex12PerformanceMeasure {

	public static class GetRandomNumbers{

		int[] arr;

		public GetRandomNumbers() {
			arr = new int[100000000];
		}

		public void gettingRandomNumbers() {

			var gen = new Random(System.currentTimeMillis());

			for (int i = 0; i < arr.length; i++) {

				arr[i] = gen.nextInt(arr.length);
			}		
		}
	}

	public static void main(String[] args) throws Exception {

		long start = System.currentTimeMillis();
		var get = new GetRandomNumbers();
		var cl = get.getClass();
		System.out.printf("Filling 100 millions random numbers regulary takes %d ms",System.currentTimeMillis() - start);		
		System.out.println();
		
		
		var field = cl.getDeclaredField("arr");
		var method = cl.getMethod("gettingRandomNumbers", null);
		start = System.currentTimeMillis();
		Object obj;
		method.invoke(get, null);
		System.out.printf("Filling 100 millions random numbers, with method.invoke takes %d ms",System.currentTimeMillis() - start);

	}
}
