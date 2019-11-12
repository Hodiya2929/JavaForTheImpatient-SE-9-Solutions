package chapter03;

import java.io.File;
import java.io.FileFilter;

public class Ex11subDirectories {

	public static File[] getSubAnonymous(String fileName) {

		var file = new File(fileName);
		var subDirectories = file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {

				return pathname.isDirectory();
			}
		});

		return subDirectories;	
	}

	public static File[] getSubLambda(String fileName) {

		var file = new File(fileName);

		var subDirectories = file.listFiles(
				//Complier can figure out what is pathName type..
				(pathName) -> { return pathName.isDirectory(); }

				);	
		return subDirectories;
	}

	//Insane!
	public static File[] getSubMethod(String fileName) {

		var file = new File(fileName);

		return file.listFiles(File::isDirectory);

	}

	public static void main (String args[]) {

		for (var fileName : getSubMethod("C:/Program Files/Java/jdk-13.0.1")) 
		System.out.println(fileName);	



	}
}