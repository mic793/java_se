package day_12;

public class Echo {
	
	public static void main(String[] args) {

		for(int i = 0; i < args.length; i++) {
			System.out.println(" i: " + i + " - " + args[i] + " ");
			System.out.println(); 
			System.exit(0);
		}
	}

}
