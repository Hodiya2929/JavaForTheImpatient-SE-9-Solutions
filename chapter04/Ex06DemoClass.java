package chapter04;

public class Ex06DemoClass {
	
	/*This demo class shows that the equals method of the Ex06Item
	 * and the Ex06DiscountedItem equals method are symmetric, but not transitive, thus
	 * x.equals(y) and y.equals(x), and also y.equals(z) and z.equals(y) are true
	 * but x.equals(z) is false.
	  	 */
	public static void main (String args[]) {
		
		var item = new Ex06Item("Bamba", 5.4);
		
		var discounted = new Ex06DicountedItem("Bamba", 5.4, 0.4);
		var discounted_2 = new Ex06DicountedItem("Bamba", 5.4, 1.5);
		
		System.out.println("item equals discounted ? "+ item.equals(discounted));
		System.out.println("discounted equals item? "+ discounted.equals(item));
		System.out.println("item equals discounted_2 ? "+ item.equals(discounted_2));
		System.out.println("discounted_2 equals item? "+ discounted_2.equals(item));
		System.out.println("Testing Transitivity: ");
		System.out.println("discounted equals discounted_2 ? "+ discounted.equals(discounted_2));
		System.out.println("discounted_2 equals discounted? "+ discounted_2.equals(discounted));
	
	
	}
	
	

}
