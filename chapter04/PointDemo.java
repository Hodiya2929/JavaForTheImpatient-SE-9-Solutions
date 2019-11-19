package chapter04;

public class PointDemo {

	public static void main(String[] args)  {

		var l = new Ex04Line(new Ex03ProtectedFields(2, 3), new Ex03ProtectedFields(10, 3));

		var nl = l.clone();

		l.point.x=345;

		System.out.println(nl.point.x);
	}

}
