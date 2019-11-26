package chapter04;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex10MethodPrinter {
	
	public static void main(String[] args) {


		int[] arr = { 1,2,3,4,5,6,7,8,9,10 };
		
		
		var cl = arr.getClass();
		
		while(cl != null ) {
			
			for (Method m : cl.getDeclaredMethods()) {
				
				System.out.println(m.getModifiers()+" "+
				m.getReturnType().getCanonicalName()+" "+
						m.getName()+
						Arrays.toString(m.getParameters()));	
			}
			
			cl=cl.getSuperclass();
			//clone is not presented as an array method, but as an object method
			
		}

	}

}
