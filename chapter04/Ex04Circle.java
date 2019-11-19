package chapter04;

public class Ex04Circle extends Ex04AbstractShape{
		
	@SuppressWarnings("unused")
	private double radius;
	
	public Ex04Circle(Ex03ProtectedFields point, double radius){
		super(point);
		this.radius = radius;
	}

	//The users of the getCenter method will not be able to change this center, (only with moveBy)
	@Override
	public Ex03ProtectedFields getCenter() {
		
		return new Ex03ProtectedFields(this.point.x, this.point.y);
	}
	
	public void setRadius(double radius) { this.radius = radius; }

	
}
