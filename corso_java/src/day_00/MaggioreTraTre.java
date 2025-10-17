package day_00;

public class MaggioreTraTre {

	public static void main(String[] args) {
		double x = 10.5;
		double y = 21.3;
		double z = 15.9;
		
		double maggiore = Double.MIN_VALUE;
		
		if(x > y && x > z) {
			maggiore = x;
			System.out.println("Il numero maggiore e': " + maggiore);
		}else if(y > z){
			maggiore = y;
			System.out.println("Il numero maggiore e': " + maggiore);
		
		}else {
			maggiore = z;
			System.out.println("Il numero maggiore e': " + maggiore);
		}
	}

}
