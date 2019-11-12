package chapter03;

public class Ex10Runnable {

	public static void runTogether(Runnable... tasks) {

		for (var runnable : tasks) 
			new Thread(runnable).start();

	}

	public static void runInOrder(Runnable... tasks) {

		for (var runnable : tasks) 
			runnable.run();

	}

}
