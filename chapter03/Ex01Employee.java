package chapter03;

public class Ex01Employee implements Ex01Measurable {

	@Override
	public String toString() {
		return "Employee " + name + ", id=" + id + ", salary=" + salary + "]";
	}

	private String name;
	private int id;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Ex01Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public double getMeasured() {
		return this.salary;
	}

}


