


package chapter06;

public class Ex11MinMaxArray {

	public static <E extends Comparable<? super E>> Ex08ComparablePair<E> minMax (Comparable<E>[] arr) {

		if(arr.length == 0)
			throw new RuntimeException("Array must contains at least 1 element!");

		var pair = new Ex08ComparablePair<E>(Ex10MinMaxInArray.min(arr),Ex10MinMaxInArray.max(arr));

		return pair;

	}




	public static void main(String[] args) {
		
		var a =new Ex10MinMaxInArray.A(1);
		//var b =new Ex10MinMaxInArray.B(5);
		//var a1 =new Ex10MinMaxInArray.A(-1);
	//	var b1 =new Ex10MinMaxInArray.B(7);
		
		Ex10MinMaxInArray.A[] array = new Ex10MinMaxInArray.A[]{a}; 
		
		System.out.println(minMax(array));

	}

}
