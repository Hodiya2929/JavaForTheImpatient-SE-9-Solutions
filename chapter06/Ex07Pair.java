package chapter06;

public class Ex07Pair<E> {
	
	private E first;
	private E second;
	
	public Ex07Pair(E first, E second) {
		
		this.first = first;
		this.second = second;
	}
	
	
	public E getFirst() {
		
	return first;
	}

	public E getSecond() {
	
	return second;
	}
	
	@Override
	public String toString() {
		return "first=" + first + ", second=" + second;
	}

	public static void main(String[] args) {
		
		var stringPair = new Ex07Pair<String>("A","B");
		var integerPair = new Ex07Pair<>(3, 5);
		
		System.out.println(stringPair);
		System.out.println(stringPair.getFirst());
		System.out.println(stringPair.getSecond());
		
		System.out.println(integerPair);
		System.out.println(integerPair.getFirst());
		System.out.println(integerPair.getSecond());
	}

}
