package day_00;

public class Contatore {

	public static int sommaStatica(int a, int b) {
		return a + b;
	}

	// Chiamata al metodo statico
	static int risultato = Contatore.sommaStatica(3, 5);

	public static void main(String[] args) {
		System.out.println(risultato);
	}
}
