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
	
	public double getX() { return x;}
	public double getY() { return y;}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		
		var str = String.format("Point: x(%f) y(%f)", this.x, this.y);
		return str;
	}
	
	public int getnumOfPoints() { return counter; }
	
	
	
}
