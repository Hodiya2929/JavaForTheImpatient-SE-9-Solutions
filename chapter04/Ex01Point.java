package chapter04;

public class Ex01Point {
	
	private static int counter = 0;

	private double x;
	private double y;
	
	
	public Ex01Point(double x, double y) {
		counter++;
		this.x= x;
		this.y = y;
	}
	// Signing a method as 'final' - the inheritance class cannot override and it's the very opposite from abstract
	public final double getX() { return x;}
	public final double getY() { return y;}

	@Override
	public int hashCode() {
		
		return Double.hashCode(this.x)+2*Double.hashCode(this.y);
	}

	@Override
	public boolean equals(Object obj) {
		
		//identical
		if(this == obj)
			return true;
		
		//other is null or not of the same classes
		if(obj == null || obj.getClass()!=this.getClass())
			return false;
		
		var otherP = (Ex01Point) obj; 
		//have equals values fields, with objects consider using the null-safe - objects.equals(arg1, arg2)
		return (Double.compare(this.x, otherP.x)==0 && Double.compare(this.y, otherP.y)==0);

	}

	@Override
	public String toString() {
		
		var str = String.format("Point: x(%f) y(%f)", this.x, this.y);
		return str;
	}
	
	public int getnumOfPoints() { return counter; }
	
	
	
}
