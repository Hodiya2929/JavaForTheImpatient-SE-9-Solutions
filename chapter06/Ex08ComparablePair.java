package chapter06;

public class Ex08ComparablePair<E extends Comparable<E> > {
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
			
		
		}
	}
