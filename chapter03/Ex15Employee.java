package chapter03;

public class Ex15Employee {

	private String name;
	private double salary;

	public Ex15Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public Ex15Employee(String name) {
		this(name, 0);
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;    
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Ex15Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}



