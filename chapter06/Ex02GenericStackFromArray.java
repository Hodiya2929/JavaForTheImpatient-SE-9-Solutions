package chapter06;

import java.util.Arrays;
import java.util.logging.Logger;

public class Ex02GenericStackFromArray {

	public static class GenericStackTypeArray<E> {

		private E[] arr;
		private int size;

		@SuppressWarnings("unchecked")
		public GenericStackTypeArray(int initSize) {
			arr = (E[]) new Object[initSize];
			this.size = 0;
		}

		public boolean isEmpty() {
			return this.size == 0;
		}

		public void push(E element) {

			if(this.size >= arr.length)
			{
				System.out.println("Array is full, new Size: "+this.arr.length*2);
				@SuppressWarnings("unchecked")
				E[] newArray = (E[])new Object[this.arr.length*2];

				for (int i = 0; i < arr.length; i++) 
					newArray[i] = arr[i];

				this.arr = newArray;
			}

			arr[size++] = element;	
		}

		public E pop () {
			if(this.size == 0)
				throw new IndexOutOfBoundsException("Stack is empty");

			return arr[--size];			
		}

		public String toString() {
			var stringBuilder = new StringBuilder();
			for (int i = 0; i < size; i++) 
				stringBuilder.append(arr[i]+" ");

			return stringBuilder.toString();
		}


	}

	public static class GenericArrayWithObjects<E> {

		private Object stack[];
		private int size;

		public GenericArrayWithObjects(int length){
			
			stack = new Object[length];
			this.size = 0;
		}
		
		public boolean isEmpty() {
			return this.size == 0;
		}

		@SuppressWarnings("unchecked")
		public E pop() {

			if(size == 0) {
				throw new IndexOutOfBoundsException("Stack is empty!");
			}

			size--;
			return (E) stack[size];
		}

		@Override
		public String toString() {

			var strBuilder = new StringBuilder();

			for (int i = 0; i < this.size; i++)
				strBuilder.append(stack[i].toString()).append(" ");

			return strBuilder.toString();
		}

		public void push(E element) {

			if( size == stack.length)
				this.resize();

			stack[size++] = element;
		}

		private void resize() {
			//instead of debugging with console printing
			Logger.getGlobal().entering("GenericArrayWithObjects", "resize");
			Logger.getGlobal().info("size is: "+this.size+" length is: "+this.stack.length);
			stack = Arrays.copyOf(stack, stack.length*2);	
		}

	}

	public static void main (String[] args) {

		var stack = new GenericStackTypeArray<String>(1);

		stack.push("a");
		stack.pop();
		stack.push("b");
		stack.pop();
		stack.push("c");
		stack.pop();
		stack.push("d");
		stack.push("d");
		stack.push("d");
		System.out.println(stack);

		var stack2 = new GenericArrayWithObjects<String>(1);
		stack2.push("Dad");
		stack2.push("Mom");
		System.out.println(stack2.pop());
		System.out.println(stack2);
		System.out.println(stack2.pop());
		//System.out.println(stack2.pop());
		
		/*
		 * I like more the second static class: "GenericArrayWithObjects",
		 * because I think its easier for me to understand.
		 */

	}
}