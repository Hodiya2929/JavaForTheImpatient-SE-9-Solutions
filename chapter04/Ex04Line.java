package chapter04;

public class Ex04Line extends Ex04AbstractShape {

	private Ex03ProtectedFields edgePoint;

	public Ex04Line(Ex03ProtectedFields from, Ex03ProtectedFields edgePoint) {
		super(from);
		this.edgePoint = edgePoint;
	}

	@Override
	public void moveBy(double dx, double dy) {
		super.moveBy(dx, dy);
		this.edgePoint.x += dx; this.edgePoint.y += dy;
	}

	@Override
	public Ex03ProtectedFields getCenter() {

		double midX = (this.point.x + this.edgePoint.x)/2;
		double midY = (this.point.y + this.edgePoint.y)/2;

		return new Ex03ProtectedFields(midX, midY);	
	}

	public Ex04Line clone() {

		var from = new Ex03ProtectedFields(this.point.x, this.point.y);
		var to = new Ex03ProtectedFields(this.edgePoint.x, this.edgePoint.y);
		var newLine = new Ex04Line(from, to);
		return newLine;
	}



}
