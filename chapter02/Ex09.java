package chapter02;

public class Ex09 {

	public static class Car {

		private double x;
		private double fuel;
		private final int efficiency;

		public Car(double x, double fuel, int efficiency) {
			this.x = x;
			this.fuel = fuel;
			this.efficiency = efficiency;
		}

		public double distanceFromOrigin() {

			System.out.printf("Current distance from origin: %f\n", this.x);
			return x;
		}

		public void setX(double x) {
			System.out.printf("Current distance from origin: %f\n", this.x);
			this.x = x;
		}

		public double getFuel() {
			System.out.printf("Current fuel gallons: %f\n",this.fuel);
			return fuel;
		}

		public void drive(double x) throws Exception {

			double fuelForCurrentDriving = x/this.efficiency;

			if(this.fuel < fuelForCurrentDriving) {
				var msg = String.format("you can't drive "+x+" miles, you have left only "+(this.fuel*this.efficiency) +" miles! please refuel");
				throw new IllegalArgumentException(msg);
			}

			else { 
				System.out.printf("Driving %f miles...\n",x);
				this.x = x;
				this.fuel -= x/this.efficiency; //Decrease the current amount of fuel by distance/car-efficiency 
			}

		}

		public void fuel(double fuel) {

			System.out.printf("Current fuel gallons: %f\n",this.fuel);
			this.fuel+=fuel;
		}
	}

	public static void main(String[] args) {

		var car = new Car(0, 100, 5);
		car.distanceFromOrigin();
		try {
			car.drive(500);
			car.fuel(20);
			car.drive(1);
			car.fuel(50);
			car.drive(100);
		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
