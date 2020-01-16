package chapter06;

public class Ex08ComparablePair<E extends Comparable<? super E>> {
	//ensures that E is a subtype of Comparable

	private E first;
	private E second;

	public Ex08ComparablePair(E first, E second) {

		this.first = first;
		this.second = second;
	}


	public E getFirst() {

		return first;
	}

	public E getSecond() {

		return second;
	}

	public E getMin() {
		if(first.compareTo(second)<=0)
			return first;
		else return second;

	}

	public E getMax() {
		if(first.compareTo(second)>=0)
			return first;
		else return second;

	}

	@Override
	public String toString() {
		return "first=" + first + ", second=" + second;
	}


	public static void main(String[] args) {

		var stringPair = new Ex08ComparablePair<>("A", "Z");
		System.out.println("Min: " + stringPair.getMin());
		System.out.println("Max: " + stringPair.getMax()); 

		/*
		 * Why the type bound must be: "E extends Comparable <? super E>>" ? 
		 * Here is an example: let's have a class A implementing Comparable A 
		 * and a sub-type class B inheriting from A (and of course implementing 
		 * Comparable<A> too. But this is the problem - B class implementing
		 * Comparable<A> and not Comparable<B> and thus not match the type bound
		 * "<E extends Comparable<E>>" but does indeed match the type bound 
		 * <E extends Comparable<? super E>> 
		 * 
		 */

	}
}