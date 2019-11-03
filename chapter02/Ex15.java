package chapter02;

import java.util.ArrayList;

public class Ex15 {

	public static class Invoice {

		/* Item is private = only Invoice can access Item class! one's can declare Invoice class 
		 * ass a public, and in this case it will be important to follow encapsulation mechanism - 
		 * declaring item's fields as private, in addition we will take into account that anyone can 
		 * declare item object (nested class, but not inner class) so it's important to change the 
		 * addItem method:
		 * public void addItem(Item anItem){ items.add(anItem); }
		 *  
		 */
		private static class Item {  

			String description;		
			int quantity;		
			double unitPrice;


			double price() { return unitPrice*quantity; }

			public String toString() {
				var itemString = String.format("Description: %s  |  Quantity: %d  |  UnitPrice: %f  -------  Price: %f\n",this.description, this.quantity, this.unitPrice, this.price() );				
				return itemString;
			}

		}

		private ArrayList<Item> items = new ArrayList<>();

		public void addItem(String description, int quantity, double unitPrice) {

			var newItem = new Item();
			newItem.description=description;
			newItem.quantity=quantity;
			newItem.unitPrice=unitPrice;
			items.add(newItem);
		}

		@Override
		public String toString() {
			var total= 0.0 ;
			var stringBuilder = new StringBuilder();
			
			for (Item item : items) {
				total+=item.price();
				stringBuilder.append(item.toString());
			}
			
			stringBuilder.append("Total Price: "+total);
			return stringBuilder.toString();
		}
		
		

	}

	public static void main(String[] args) {
		
		var foodInvoice = new Invoice();
		
		foodInvoice.addItem("Cola", 3, 4.5);
		foodInvoice.addItem("Bread", 2, 5);
		foodInvoice.addItem("Chease", 5, 6);
		
		System.out.println(foodInvoice);

	}
}




