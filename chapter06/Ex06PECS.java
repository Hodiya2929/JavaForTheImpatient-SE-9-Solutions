package chapter06;

import java.util.ArrayList;

public class Ex06PECS {

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
		
		//PECS = Producer Extends, Consumer Supply

	}

}
