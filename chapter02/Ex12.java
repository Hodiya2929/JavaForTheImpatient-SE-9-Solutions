package chapter02;

public class Ex12 {

	public static void main(String[] args) {

		System.out.println("When the program contains no package = defaulf package then we can run\njavac + java without considering the package name");
		System.out.println("On the other hand, most of the time our program will be part of a package, so in this case it has to\nbe located in a path which contains the package name and in order to run it:\nfrom the path class - run javac with"+ " \\ "+"sign seperated classpath.java and then run java with '.'\nseperated classpath with class name");
		System.out.println("When our program is not saved in a subdirectory which match the package, and we run\njavac from that subdirectory - a class file is indeed created in the subdirectory, but\njava + classname doesn't run the class file - after running the javap command - this is the warning massage:\n"
				+ "Warning: File .\\Me.class does not contain class Me\r\n" + 
				"Compiled from \"Me.java\"\r\n" + 
				"public class chapter02.Me {\r\n" + 
				"  public chapter02.Me();\r\n" + 
				"  public static void main(java.lang.String[]);\r\n" + 
				"}");
		System.out.println("When running: javac -d . classname.java the command automatically located the classfile in a subdirectory that match the package name");


	}

}
