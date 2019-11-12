package chapter03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex08LuckySort {

	public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {

		int counter = 0;

		while(!isSorted(strings, comp))
		{
			counter++;
			Collections.shuffle(strings);
		}
		
		System.out.printf("Suffled %d times!", counter);
	}
	
	private static boolean isSorted(ArrayList<String> strings, Comparator<String> comp) {

		for (int i = 0; i < strings.size()-1; i++) {

			if(	comp.compare(strings.get(i), strings.get(i+1)) < 0)
				return false;
		}
		return true;
	}

	public static void main(String atgs[]) {

		/*
		 * String implements Comparable<String> and one's want to sort it differently 
		 * then he must implements Comparator<String>
		 */
		
		Comparator<String> comp = (str1, str2) -> {
			
			return str1.compareTo(str2);
			
		};//end of comparator

		var myList = new ArrayList<String>();
		myList.add("c");
		myList.add("b");
		myList.add("a");
		myList.add("d");
		myList.add("e");
		myList.add("h");

		luckySort(myList, comp);


	}


}


