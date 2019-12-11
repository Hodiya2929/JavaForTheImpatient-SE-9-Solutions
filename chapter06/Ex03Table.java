package chapter06;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Ex03Table<K, V> {

	private static class Entry<K, V>{

		K key;
		V value;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public V getValue() {
			return this.value;
		}

		@Override
		public int hashCode() {

			return Objects.hashCode(this.key);
		}

		@Override
		public boolean equals(Object obj) {
			if(this == obj)
				return true;

			if(obj == null)
				return false;

			if(this.getClass()!= obj.getClass())
				return false;

			@SuppressWarnings("unchecked")
			var entry = (Entry<K,V>) obj;
			return Objects.equals(this.key, entry.key);	
		}

		@Override
		public String toString() {
			return "Entry key: " + key + "-> value: " + value ;
		}


	}

	ArrayList<Entry<K, V>> table;

	public Ex03Table() {

		table = new ArrayList<>();
	}

	public void put(K key, V value) {

		Objects.requireNonNull(key);

		for(Entry<K, V> entry : table) 
			if(entry.key.equals(key)) {
				entry.setValue(value);
				return;
			}

		table.add(new Entry<>(key, value));

	}

	public boolean remove(K key) {
		for (Entry<K, V> entry : table) 
			if(entry.key.equals(key))
				return table.remove(entry);

		return false;	
	}



	public V get(K key) {

		for (Entry<K, V> entry : table) 
			if(entry.key.equals(key))
				return entry.getValue();

		throw new NoSuchElementException(); //return null?
	}

	public boolean contains(K key) {
		for (Entry<K, V> entry : table) 
			if(entry.key.equals(key))
				return true;
		return false;
	}

	public String toString() {
		var strBuilder = new StringBuilder();
		for (Entry<K, V> entry : table) {
			strBuilder.append(entry.toString());
			strBuilder.append("\n");
		}
		return strBuilder.toString();
	}

	public static void main(String[] args) {

		var table = new Ex03Table<String, Integer>();
		table.put("one", 11);
		table.put("two", 22);
		table.put("three", 3);
		table.put("four", 4);

		table.put("one", 1);
		table.put("two", 2);
		table.remove("four");

		//	table.get("five"); exception = "five" doesn't exist

		System.out.println(table.toString());

		assert (table.get("one").equals(1)): "Add method didn't override the value for key one";
		assert (!table.contains("four")): "four wasn't removed";


	}

}
