package chapter04;

import java.util.Objects;

public class Ex06DicountedItem extends Ex06Item {

	private double discount;

	public Ex06DicountedItem(String description, double price, double discount) {
		super(description, price);
		this.discount = discount;
	}

	public boolean equals(Object otherObject) {

		if(!super.equals(otherObject)) return false;

		if(otherObject.getClass() == this.getClass()) {
			
			var discounted =(Ex06DicountedItem)otherObject;
			return Objects.equals(this.discount, discounted.discount);
		}
		
		else return super.equals(otherObject);
	}

	public int hashCode() {
		return Objects.hash(super.hashCode(), discount);
	}
}

