package chapter03;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Ex13FileComparator {

	public static File[] sortByNameAndType(File[] list){

		Arrays.sort(list, Comparator.comparing(File::isDirectory).reversed().thenComparing((a,b)->{return a.compareTo(b);}));

		return list;
	}



	public static void main(String[] args) {

		File[] fileList = new File("C:/Users/עימנואל/Documents").listFiles();

		for (File file : sortByNameAndType(fileList)) 
			System.out.println(file);


	}

}
