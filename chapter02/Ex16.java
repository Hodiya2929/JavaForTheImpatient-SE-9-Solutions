package chapter02;

/* Differences between inner and nested classes:
 * Inner classes have a reference to the enclosing class instance - nested - don't!
 * Consequently - we use inner class when it is important to which instance of the outer class
 * the instance of the inner class belongs, and when it's not important we use nested classes
 * 
 * Inner class can invoke methods of the outer class instance
 */

public class Ex16 {

	public static class MyQueue{

		/*MyNode is a nested class because it doesn't have to access it's enclosing class.
		 * Myqueue instance has all the required functionality and making MyNode inner will not add
		 * more power or functionality
		 */
		
		private static class MyNode { //if  MyQueue is inner - MyNode cannot be static, because inner classes doesn't have static variables

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
		
		public void add(String str) {

			MyNode node = new MyNode(str);

			if(first==null)
				first=last=node;
			else {
				last.nextNode = node;
				last = node;
			}
		}

		public MyNode remove() {

			if(first == null)
				return null;
			else {

				MyNode temp = first;
				first = first.nextNode;
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
	}

	public static void main (String args[]) {

		MyQueue myQueue = new MyQueue();
		System.out.println(myQueue);
		myQueue.add("a");
		System.out.println(myQueue);
		
		myQueue.add("b");
		System.out.println(myQueue);
		
		myQueue.remove();
		System.out.println(myQueue);
		
		myQueue.add("c");
		myQueue.add("d");
		myQueue.add("e");
		System.out.println(myQueue);
		
		myQueue.remove();
		myQueue.remove();
		myQueue.remove();
		System.out.println(myQueue);

		myQueue.remove();
		System.out.println(myQueue);
		
		myQueue.add("yes");
		System.out.println(myQueue);


	}


}







