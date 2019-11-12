package chapter03;

public class Ex14runRunnables {
	
		
	public static Runnable runRunnables(Runnable[] array) {
		
		return ()->{//start lambda
			
			for (var runnable : array) 
				runnable.run();
			
		};//end lambda	
	}

}
