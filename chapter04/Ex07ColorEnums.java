package chapter04;

public enum Ex07ColorEnums {

	BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;
	
	public static Ex07ColorEnums getRed() { return RED; }

	public static Ex07ColorEnums getBlue() { return BLUE; }

	public static Ex07ColorEnums getGreen() { return GREEN; }
	
	public static void main (String args[]) {
	
		var what = Ex07ColorEnums.getBlue();
		
		System.out.println("var value is: " + what.name());
				
	}
}
