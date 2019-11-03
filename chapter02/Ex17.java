package chapter02;

import java.util.ArrayList;

public class Ex17 {

	public static class MyQueue{

		private static class MyNode { 

			String data;
			MyNode nextNode;

			public MyNode(String str) { this.data = str; }

			@Override
			public String toString() {
				return data;
			}
		}

		MyNode first;
		MyNode last;
		int size;

		public MyQueue() { first=last=null;  }

		public void add(String str) {

			MyNode node = new MyNode(str);

			if(first==null) {
				first=last=node;
				size++;
			}
			else {
				last.nextNode = node;
				last = node;
				size++;
			}
		}

		public MyNode remove() {

			if(first == null)
				return null;
			else {

				MyNode temp = first;
				first = first.nextNode;
				size--;
				return temp;	
			}
		}

		@Override
		public String toString() {
			if(first == null)
				return "Queue is empty!";
			else {
				var iteration = first;
				var builder = new StringBuilder();

				while(iteration != null)
				{
					builder.append(iteration.toString());

					if(iteration != last)
						builder.append(" <-- ");

					iteration = iteration.nextNode;
				}
				return builder.toString();
			}
		}

		public Iterator iterator() {
			return this.new Iterator();
		}

		public class Iterator{

			MyNode iteration;
			int lastIndex;
			int cursor;

			public Iterator () { this.iteration = first; cursor = -1; lastIndex = MyQueue.this.size; };

			public boolean hasNext() {

				return ((cursor+1) < this.lastIndex);
			}

			public MyNode next() {

				MyNode temp = iteration;
				iteration = iteration.nextNode;
				cursor++;
				return temp;			
			}					
		}		
	}

	public static void main (String args[]) {

		MyQueue queue = new MyQueue();
		var iter=queue.iterator();
		System.out.println(iter.hasNext());
		queue.add("a");
		System.out.println(iter.hasNext());
		iter = queue.iterator();
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());

	}
}
