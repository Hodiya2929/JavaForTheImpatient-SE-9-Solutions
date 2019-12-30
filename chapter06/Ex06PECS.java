package chapter06;

import java.util.ArrayList;

public class Ex06PECS { //PECS = Producer Extends, Consumer Supply

	static class A {

		@Override
		public String toString() {
			return "A";
		}
		
	}
	
	static class B extends A {
		
		@Override
		public String toString() {
			return "B";
		}
		
	}
	
	
	public static <T> void append(ArrayList<? extends T> arr1, ArrayList<T> arr2) {
		
		arr2.addAll(arr1);
		
	}
	
	// B extends A
	
	public static <T> void append2(ArrayList<T> arr1, ArrayList<? super T> arr2) {
		
		arr2.addAll(arr1);
	}
	
	public static void main(String[] args) {
		
		var AList = new ArrayList<A>();
		var BList = new ArrayList<B>();
		
		AList.add(new A());
		AList.add(new B());//ok because B is A + some properties.
		
     // BList.add(new A()); not allowed 
		BList.add(new B());
		BList.add(new B());
		
		
		var emptyA = new ArrayList<A>();
		var emptyB = new ArrayList<B>();
		
		/* that is exactly the point to let copy from a reference
		 * of some type that extends T to an array of type T 
		 */
		append(BList,emptyA); 
		// append(AList, emptyB); A doesn't extends B - compiling error
		
		//Now examine appent2 function:
			
		append(BList,emptyA); 
		// append(AList, emptyB); A doesn't extends B - compiling error
		
		//Behave in the same way just like 'append'.

	}

}
