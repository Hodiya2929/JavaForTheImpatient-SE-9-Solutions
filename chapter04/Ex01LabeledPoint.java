package chapter04;

public class Ex01LabeledPoint extends Ex01Point {

	private String label;

	public Ex01LabeledPoint(String label, double x, double y) {

		super(x, y);
		this.label = label;
	}
	
	public String getLabel() { return this.label; }
	
	
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
	
		var str = String.format("Point: %s x(%f) y(%f)", this.label, this.getX(), this.getY());
		return str;
	}

	public static void main(String[] args) {

		var labeledP = new Ex01LabeledPoint("First Axes", 0.0, 0.0);
		System.out.println(labeledP);
		
		System.out.println(labeledP.getnumOfPoints());
		

	}

}
