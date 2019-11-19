package chapter04;

public class Ex04Rectangle extends Ex04AbstractShape {
	
	private double width;
	private double height;
	
		public Ex04Rectangle(Ex03ProtectedFields point, double width, double height) {
			super(point);
			this.height = height;
			this.width = width;
		}

		@Override
		public Ex03ProtectedFields getCenter() {
		
			double midX = this.point.x + this.width/2;
			double midY = this.point.y + this.height/2;
			return new Ex03ProtectedFields(midX, midY);
		}

}
