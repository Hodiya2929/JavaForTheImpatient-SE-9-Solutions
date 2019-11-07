package chapter03;

public class Ex04Demo {

	public static void main (String args[]) {
		
		var anonymous = Ex04IntSeuence.of(3, 1, 4, 1, 5, 9);
		
		while (anonymous.hasNext())
			System.out.print(anonymous.next()+" ");

		
		anonymous = Ex04IntSeuence.of();
		
		while (anonymous.hasNext())
			System.out.println(anonymous.next());
	}

}
