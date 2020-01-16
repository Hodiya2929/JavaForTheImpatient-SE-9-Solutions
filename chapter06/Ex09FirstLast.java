package chapter06;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;


public class Ex09FirstLast {
	
	public static <E extends Comparable<? super E>> Ex08ComparablePair<E>
		firstLast(ArrayList<E> arr) throws Exception {
			
		if(arr.size() == 0)
			throw new Exception("The array is empty, please pass an array with at least 1 element inside.");
		
		else{
			
		var pair = new Ex08ComparablePair<E>(arr.get(0), arr.get(arr.size()-1));
		return pair;		
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {

		var stringArray = new ArrayList<String>();
		stringArray.addAll(Arrays.asList(new String[] {"a","b","c","d","z"}));
		System.out.println(firstLast(stringArray));
			
		/*
		var pointArray = new ArrayList<Point>();
		pointArray.addAll(Arrays.asList(new Point[] {new Point(0,1),new Point(0,2),new Point(0,3)}));
		System.out.println(firstLast(pointArray)); - compiling error - point doesn't implements Comparable
		*/
	}
	
}
