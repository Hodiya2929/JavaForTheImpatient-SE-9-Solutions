package chapter03;

//return to the other solution and figure it out
public class Ex09Greeter implements Runnable {

	int n;
	String target;
	
	public Ex09Greeter(int n, String target) {
		this.n = n;
		this.target = target;
	}

	@Override
	public void run() {

		for (int i = 0; i < this.n; i++) 
			System.out.println("Hello "+ this.target);
				
	}

	public static void main(String[] args) {
		
		Thread manuGreeter = new Thread(new Ex09Greeter(100, "Imanuel"));
		Thread HadarGreeter = new Thread(new Ex09Greeter(100, "Hadar"));
		
		manuGreeter.start();
		HadarGreeter.start();
		
	}

}
