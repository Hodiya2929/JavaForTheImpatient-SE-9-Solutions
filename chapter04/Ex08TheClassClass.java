package chapter04;

import java.awt.Point;
import java.util.ArrayList;

import chapter02.Ex17.MyQueue;

public class Ex08TheClassClass {
	
	public static void main(String args[]) throws ClassNotFoundException {
		
	var scanner = "java.util.Scanner";
	
	Class<?> obj = Class.forName(scanner);
	
	System.out.println("Methods that return a string for 'Scanner class: '");
	System.out.println("\nScanner object method - getCanonicalName() returns: "+obj.getCanonicalName());
	System.out.println("Scanner object method - getSimpleName() returns: "+ obj.getSimpleName());
	System.out.println("Scanner object method - getTypeName() returns: "+ obj.getTypeName() );
	System.out.println("Scanner object method - getName() returns: "+ obj.getName());
	System.out.println("Scanner object method - toString() returns: "+ obj.toString());
	System.out.println("Scanner object method - toGenericString() returns: "+ obj.toGenericString());
		
	var array = new ArrayList<Point>();
	array.add(new Point());
	obj = array.getClass();
	
	System.out.println("\n\nMethods that return a string for the generic class arrayList<Point>: '");
	System.out.println("\nArrayList<Point> object method - getCanonicalName() returns: "+obj.getCanonicalName());
	System.out.println("ArrayList<Point> object method - getSimpleName() returns: "+ obj.getSimpleName());
	System.out.println("ArrayList<Point> object method - getTypeName() returns: "+ obj.getTypeName() );
	System.out.println("ArrayList<Point> object method - getName() returns: "+ obj.getName());
	System.out.println("ArrayList<Point> object method - toString() returns: "+ obj.toString());
	System.out.println("ArrayList<Point> object method - toGenericString() returns: "+ obj.toGenericString());
	
	obj = double.class;
	
	System.out.println("\n\nMethods that return a string for 'void' type:");
	System.out.println("\ngetCanonicalName() returns: "+obj.getCanonicalName());
	System.out.println("getSimpleName() returns: "+ obj.getSimpleName());
	System.out.println("getTypeName() returns: "+ obj.getTypeName() );
	System.out.println("getName() returns: "+ obj.getName());
	System.out.println("toString() returns: "+ obj.toString());
	System.out.println("toGenericString() returns: "+ obj.toGenericString());
	
	obj = double[].class;
	
	System.out.println("\n\nMethods that return a string for double[] type:");
	System.out.println("\ngetCanonicalName() returns: "+obj.getCanonicalName());
	System.out.println("getSimpleName() returns: "+ obj.getSimpleName());
	System.out.println("getTypeName() returns: "+ obj.getTypeName() );
	System.out.println("getName() returns: "+ obj.getName());
	System.out.println("toString() returns: "+ obj.toString());
	System.out.println("toGenericString() returns: "+ obj.toGenericString());
	
	obj = String[].class;
			
	System.out.println("\n\nMethods that return a string for String[] type:");
	System.out.println("\ngetCanonicalName() returns: "+obj.getCanonicalName());
	System.out.println("getSimpleName() returns: "+ obj.getSimpleName());
	System.out.println("getTypeName() returns: "+ obj.getTypeName() );
	System.out.println("getName() returns: "+ obj.getName());
	System.out.println("toString() returns: "+ obj.toString());
	System.out.println("toGenericString() returns: "+ obj.toGenericString());
	
	var queueFromChapter2 = new MyQueue();
	var inner = queueFromChapter2.new Iterator();
	
	obj = inner.getClass();
	
	System.out.println("\n\nMethods that return a string for Iterator inner class:");
	System.out.println("\ngetCanonicalName() returns: "+obj.getCanonicalName());
	System.out.println("getSimpleName() returns: "+ obj.getSimpleName());
	System.out.println("getTypeName() returns: "+ obj.getTypeName() );
	System.out.println("getName() returns: "+ obj.getName());
	System.out.println("toString() returns: "+ obj.toString());
	System.out.println("toGenericString() returns: "+ obj.toGenericString());
	
	}
}
