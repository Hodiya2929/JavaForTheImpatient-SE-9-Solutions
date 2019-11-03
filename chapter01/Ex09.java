package chapter01;

public class Ex09 {

	public static void main(String[] args) {
	
		var str1 = "Hello World!";
		var str2 = new String("Hello World!");
		
		System.out.println("Str1 && str2 have the value: Hello World! ,but...");
		
		System.out.println("Str1.equals(str2) ? "+str1.equals(str2));
		System.out.println("Str1 == str2 ? "+(str1 == str2));

	}

}
