package chapter04;

public abstract class Ex04AbstractShape {
	
	 Ex03ProtectedFields point;
	
	public Ex04AbstractShape(Ex03ProtectedFields point) {
		this.point = point;
	}
	
	public void moveBy(double dx, double dy) {
		this.point.x+= dx;
		this.point.y+= dy;
	}
	
	//abstract method
	public abstract Ex03ProtectedFields getCenter();
	
}
