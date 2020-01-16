package chapter06;

public class Ex10MinMaxInArray {
	
	//From stackoverflow : https://stackoverflow.com/questions/59657568/the-correct-signature-of-a-utility-function-to-array-class-comparablee-or-com
	
	@SuppressWarnings("unchecked")
	public static <E> E min (Comparable<? super E>[] arr){

		E min= null;

		if(arr.length > 0)			
			min = (E) arr[0];

		for (int i = 1; i < arr.length; i++) {

			if( (arr[i].compareTo((E) min)) < 0)
				min = (E) arr[i];
		}

		return min;	
	}
	
	@SuppressWarnings("unchecked")
	public static <E> E max (Comparable<? super E>[] arr){

		E max= null;

		if(arr.length > 0)			
			max = (E) arr[0];

		for (int i = 1; i < arr.length; i++) {

			if( (arr[i].compareTo((E) max)) > 0)
				max = (E) arr[i];
		}

		return max;	
	}
	
	// From here - just a demo 

	static class A implements Comparable<A>{
		int a;
		
		A(int a){
			this.a = a;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "A"+a;
		}

		@Override
		public int compareTo(A o) {

			if(a>o.a)
				return 1;
			else return -1;
		}
	}

	static class B extends A {
		
		B(int a) {
			super(a);
			// TODO Auto-generated constructor stub
		}

		int b;

		@Override
		public String toString() {
			return "B"+a;
		}	
	}
	
	static class C implements Comparable<C>{

		@Override
		public int compareTo(C o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

	public static void main(String[] args) {

		String[] stringArr = new String[]{"a","b","c","d","e"}; 
		System.out.println(min(stringArr));

		/* B implements Comparable<A> because B extends A, but
		 * we can easily see that min() do accept an array of B[] as an 
		 * argument and that because B is of a Comparable type
		 */
		
		B[] bArr = new B[] {new B(1),new B(2)};

		System.out.println(min(bArr));
		
		/* make the min function signature as: "Comparable<E>" instead of
		 * Comparable<? super E> and call min(bArr) with a B reference 
		 * because B implements Comparable A and if limit the comparable array
		 * to E types only - then the function cannot cast it back to B type.  
		 */
		
		 min(bArr); 
		
		A aArr[] = new A[] {new A(1), new B(2), new B(-1)};
		
		A aa = min (aArr);
		System.out.println(aa);
		B bb = min(aArr);
		System.out.println(bb);
		
	}
}
