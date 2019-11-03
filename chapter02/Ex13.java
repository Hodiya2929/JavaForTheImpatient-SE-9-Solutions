package chapter02;

import java.io.FileReader;

import com.opencsv.CSVReader;

/*Exception - Exception in thread "main" Exception in thread "main" java.lang.NoClassDefFoundError: org/apache/commons/lang3/ObjectUtils....
 * - in order to fix added commons-lang3-3.9.jar to the classpath
 *
 */
public class Ex13 {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		var csvReader = new CSVReader(new FileReader("OpenCSV/african_crises.csv"));

		for (String[] line : csvReader) {
			
			for (String word : line) 
				System.out.print(word+" ");
			
			System.out.println();
		}


	}
}
