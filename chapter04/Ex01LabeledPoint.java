package chapter04;

import java.util.Objects;

public class Ex01LabeledPoint extends Ex01Point {

	private String label;

	public Ex01LabeledPoint(String label, double x, double y) {

		super(x, y);
		this.label = label;
	}
	
	public String getLabel() { return this.label; }
	
	
	@Override
	public int hashCode() {
		
		return super.hashCode()+Objects.hash(this.label);
	}

	@Override
	public boolean equals(Object obj) {
		
		//don't use instance of in inheritance because it not symmetric. obj.getClass() is the right way
		if(!super.equals(obj))
			return false;
		//the compared objects are of the same class and have the same inheritance fields values
		
		var otherP = (Ex01LabeledPoint) obj;
		
		return Objects.equals(this.label, otherP.label);		
	}

	@Override
	public String toString() {
	//toString method can make use of the protected variables x and y. 
		var str = String.format("Point: %s x(%f) y(%f)", this.label, this.x, this.y);
		return str;
	}

	public static void main(String[] args) {

		var labeledP = new Ex01LabeledPoint("First Axes", 0.0, 0.0);
		var labeledP2 = new Ex01LabeledPoint("First Axes", 0.0000, 0.0000);
		System.out.println("P1: "+labeledP);
		System.out.println("P2: "+labeledP2);
		System.out.println("Are equals: "+ labeledP.equals(labeledP2));
		System.out.println("Hash P1 "+labeledP.hashCode()+ " Hash P2: "+labeledP2.hashCode());
		
		System.out.println("Number points objects: "+labeledP.getnumOfPoints());
	
	}

}
