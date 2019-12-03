package chapter05;

public class Ex11RecursiveStackTrace {


	public static long facturial(int num) {

		if(num < 0)
			throw new IllegalArgumentException("Number must be positive");

		if(num == 0 || num == 1)
			return 1;
		
		/*
		 * or var ex = new Exception();
		 * ex.printStackTrace();
		 * In order to process the stack frame
		 * it is possible to use StackWalker class
		 */

		System.out.println("In factorial. Stack Trace: ");
		var walker = StackWalker.getInstance();
		walker.forEach(st->
		{
			if(st.getClassName().contains("Ex"))
				System.out.println(st);
		}
		);
				
		return num * facturial(num -1);

	}

	public static void main(String[] args) {
		
		System.out.println(facturial(20));
	}

}
