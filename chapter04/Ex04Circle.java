package chapter04;

public class Ex04Circle extends Ex04AbstractShape{

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

	public Ex04Circle clone() {

		var clonedCircle = new Ex04Circle(new Ex03ProtectedFields(this.point.x, this.point.y), radius);
		return clonedCircle;
	}

}
