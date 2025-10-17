package day_01;

public class EsercizioPunto {

	float x, y, z;

	// classe statica annidata
	static class Segmento {
		EsercizioPunto inizio;
		EsercizioPunto fine;

		@Override
		public String toString() {
			return "Segmento da " + inizio + " a " + fine;
		}
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}

	public static void main(String[] args) {

		// Dichiarazione dei punti e del segmento
		EsercizioPunto p1, p2;
		Segmento s;

		// Creazione dei punti
		p1 = new EsercizioPunto();
		p2 = new EsercizioPunto();

		// Assegnazione delle coordinate
		p1.x = 1;
		p1.y = 2;
		p1.z = 4;

		p2.x = 2;
		p2.y = 3;
		p2.z = 7;
		// Creazione del segmento
		s = new Segmento();

		// Collegamento dei punti al segmento
		s.inizio = p1;
		s.fine = p2;

		// Stampa
		System.out.println("Punto 1: " + p1);
		System.out.println("Punto 2: " + p2);
		System.out.println(s);
	}
}
