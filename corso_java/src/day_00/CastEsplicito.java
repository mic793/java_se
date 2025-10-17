package day_00;

public class CastEsplicito {
	
	public static void main(String[] args) {
        double d = 123.456;          // valore iniziale di tipo double
        float f = (float) d;         // cast esplicito da double a float
        long l = (long) f;           // cast esplicito da float a long
        int i = (int) l;             // cast esplicito da long a int
        short s = (short) i;         // cast esplicito da int a short
        byte b = (byte) s;           // cast esplicito da short a byte

        // Stampa di tutti i passaggi
        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
    }
}

