package chapter06;

public class Ex05VarargsArguments {
	
	public static <T> T[] swap(int i, int j, T... values) {
		
		T temp = values[i];
		values[i] = values[j];
		values[j] = temp;
		
		return values;
	}
	
	public static void main(String args[]) {
		
		//Double[] result = swap(0,1, 1.5, 2, 3);
		//Type mismatch: cannot convert from Number&Comparable<?>&Constable&ConstantDesc[] to Double[] 
		
		//Double[] result = Ex05VarargsArguments.<Double>swap(0, 1, 1.5, 2, 3);
		//The parameterized method <Double>swap(int, int, Double...) of type Ex05VarargsArguments is not
		//applicable for the arguments (int, int, Double, Integer, Integer)
		
		/*
		 * @see https://stackoverflow.com/questions/59323006/is-it-possible-to-make-the-generic-varargs-methos-compile-without-changing-the-m
		 *In order to make the function call compiled without warnings - we need to
		 *call the function with all arguments of the same type
		 */
		Double[] result = swap(0,1,1.5,2d,3d);
	}

}
