package day_00;

public class CastImplicito {
	
	public static void main(String[] args) {
		byte b = 10; // valore iniziale
		short s = b; // cast implicito da byte a short
		int i = s; // cast implicito da short a int
		long l = i; // cast implicito da int a long
		float f = l; // cast implicito da long a float
		double d = f; // cast implicito da float a double

		// Stampa dei valori
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
	}
}
