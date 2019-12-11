package chapter06;

import java.util.ArrayList;

public class  Ex01GenericStack<E> {
	
	private ArrayList<E> stack;
	
	
	public Ex01GenericStack(){
		stack = new ArrayList<>();
	}
	
	public boolean push(E element) {
		
	return	stack.add(element);
	}
	
	public E pop () {
		//case size is 0 is handled by the ArrayList class programmers.
		return stack.remove( stack.size()-1 );		
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		var stringStack = new Ex01GenericStack<String>();
		stringStack.push("a");
		stringStack.push("b");
		stringStack.push("c");
		stringStack.push("d");
		System.out.println(stringStack.isEmpty());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.isEmpty());
		
		var integerStack = new Ex01GenericStack<Integer>();
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		System.out.println(integerStack.isEmpty());
		System.out.println(integerStack.pop());
		System.out.println(integerStack.pop());
		System.out.println(integerStack.pop());
		System.out.println(integerStack.pop());
		System.out.println(integerStack.isEmpty());
		
		
	}

}
