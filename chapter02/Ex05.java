package chapter02;
/**
 * Ex05 is a class which represents exercise number 05 - implementing an immutable
 * class point. Point class is implemented as a nested class - to keep on uniformity
 * in the class names
 * @author עימנואל
 * @version 1.1
 */
public class Ex05 {
	/**
	 * <em><code>Point class</em></code> - represents a point in a plane. Each point can be located in a
	 * plane by two components: x and y. 
	 * <code>Just to see how this modifier works</code>
	 * <img src="C:\Users\עימנואל\Desktop\pizza.jpg"/>
	 * @author Imanuel Eyal
	 * @version 1.1
	 *
	 */
	public static class Point { 

		private double x;
		private double y;

		/**
		 * Construct a point in position (0,0) - pivots intersection.
		 */
		public Point() {
			this(0,0); //uses the 2 arguments constructor
		}

		/**
		 * Construct a new point and locate it in a specific location
		 * @param d is the distance from x axis.
		 * @param e - distance from y axis.
		 */
		public Point(double d, double e) {
			this.x = d;
			this.y = e;
		}
		/**
		 * Returns the current value of x.
		 * @return distance from x axis.
		 */
		public double getX() {
			return this.x;
		}
		/**
		 * Returns the current value of y.
		 * @return distance from y axis.
		 */
		public double getY() {
			return this.y;
		}

		/**
		 * Moves the current point by <code>moveX</code> and <code>moveY</code> 
		 * Accessor method - returns a <boldface>new Point object</boldface>  
		 * @param movesX - value to add to current x value
		 * @param movesY value to add to current x value
		 * @return a new Point object.
		 */
		public Point translate(double movesX, double movesY) {
			return new Point(this.x+movesX, this.y+movesY);
		}

		/**
		 * Scales both coordinates by a given factor.
		 * Accessor method - returns a <boldface>new Point object</boldface>  
		 * @param d - is the scale factor 
		 * @return new scaled Point object
		 */
		public Point scale(double d) {
			return new Point(this.x*d, this.y*d);			
		}
		/**
		 * Return a String that represents the current point
		 */
		@Override
		public String toString() {
			return "("+ x + ", " + y+")";
		}

	}

	public static void main(String[] args) {

		var p = new Ex05.Point(3, 4).translate(1, 3).scale(0.5);// or just - Point x = new Point;	

		System.out.println(p);

	}
}
