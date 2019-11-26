package chapter04;

import java.awt.Point;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;
import chapter04.Ex01LabeledPoint;

public class Ex09UniversalToString {

	public static class A{
		int x;
		double y;
		String str;
		
		public A() {
			x=9;
			y=4.5;
			str="dfgg";
		}

		public A(int x, double y, String str) {
			this.x = x;
			this.y = y;
			this.str = str;
		}

	}

	public static class B extends A{

		Point p;
		Scanner scn;
		ArrayList<Ex01LabeledPoint> label;

		public B(int a,double b, String c, Point p, Scanner s, ArrayList<Ex01LabeledPoint> l ) {
			super(a,b,c);
			this.p=p;
			this.scn=s;
			this.label=l;
		}

		public B() {
			this.p = new Point();
			this.scn = new Scanner(System.in);
			this.label = new ArrayList<>();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var b = new B(2,5.6,"dwf",new Point(), new Scanner(System.in), new ArrayList<>());
		System.out.println(getFields(b));
	}

	public static String getFields(Object obj) {

		var builder = new StringBuilder();

		var cl = obj.getClass();

		builder.append("Class: "+obj.getClass().getSimpleName()+"\nFields: \n");

		while(cl != null) {

for (Field f : (obj.getClass().getFields())) {

				f.setAccessible(true);
				 builder.append(f.getName());
				var o =(f.getType());

				if(o.isArray()) 
					builder.append(o.arrayType().getTypeName())	;
				

				 builder.append(f.getType()+" ")	;

			}

			cl = cl.getSuperclass();
		}
		return builder.toString();
	}

}
