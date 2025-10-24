package day_00;

public class DivisioneTraInteri {

	public static void main(String[] args) {
		
		int x = 5;
		
		int y = 2;
		
		double z = x / y;//perde la parte frazionaria
		System.out.println(z);
		
		double z2 = x / (double) y;//mantiene la parte frazionaria grazie al cast
		System.out.println(z2);
		
	}

}
