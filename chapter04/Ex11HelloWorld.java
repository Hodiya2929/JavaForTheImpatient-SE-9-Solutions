package chapter04;

public class Ex11HelloWorld {

	public static void main(String... args) throws Exception{

		/*
		   var m = System.out.getClass().getMethod("println", String.class);
		   m.invoke(System.class.getField("out").get(null), "Hello World!");
		 */


		//class obj of the java.lang.System class
		var cl = Class.forName("java.lang.System");

		//f is the field - "out"
		var f = cl.getField("out");

		//clf id class object of the out typr (PrintStream class)
		var clf = f.getType();

		//m is the method - 1 string arg 		
		var m = clf.getMethod("println", String.class);

		//invoking m on f. Out is a static field so the argument ignored and can be null 		
		m.invoke(f.get(null), "Hello World!");
	}
}