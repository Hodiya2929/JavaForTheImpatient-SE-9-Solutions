package chapter02;

public class Ex06 {

	public static class Point{ 

		double x;
		double y;

		Point(){
			this(0,0);
		}

		Point (double x, double y){
			this.x=x;
			this.y=y;
		}
		/*
		 * Here Point is a private class and therefore only Ex06 can make use of the point objects
		 * There is no reason to make x & y private or to use the class getters, but it's part of the question.
		 */
		double getX() {
			return this.x;
		}
		
		double getY() {
			return this.y;
		}

		void translate(double x, double y) {

			this.x+=x;
			this.y+=y;
		}
/**
 * 
 * @param factor
 */
 
		void scale(double factor) {

			this.x*=factor;
			this.y*=factor;			
		}

		@Override
		public String toString() {
			return "(" + x + ", " + y + ")";
		}
		
		

	}

	public static void main(String[] args) {

		Point p = new Point(3,4); //can't concatenate like in Ex05 because translate and scale don't return a point object
		p.translate(1, 3);
		p.scale(0.5);
		System.out.println(p);
	}

}
