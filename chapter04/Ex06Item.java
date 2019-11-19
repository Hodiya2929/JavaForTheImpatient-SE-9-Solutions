package chapter04;

import java.util.Objects;

public class Ex06Item {

	private String description;
	private double price;

	public Ex06Item(String description, double price) {
		this.description = description;
		this.price = price;
	}

	public boolean equals(Object otherObject) {
		// A quick test to see if the objects are identical
		if (this == otherObject) return true;
		// Must return false if the explicit parameter is null
		if (otherObject == null) return false;
		// Check that otherObject is a Item
		if (!(otherObject instanceof Ex06Item) ) return false;
		// Test whether the instance variables have identical values
		Ex06Item other = (Ex06Item) otherObject;
		return Objects.equals(description, other.description)
				&& price == other.price;
	}

	public int hashCode() {
		return Objects.hash(description, price);
	}
}

