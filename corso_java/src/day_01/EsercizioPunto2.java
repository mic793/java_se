package day_01;

//Esercizio: passaggio e restituzione di argomenti

class Punto {
	float x, y, z;
}

class Segmento {
	Punto inizio, fine;
}

public class EsercizioPunto2 {

	static double lunghezza(Segmento s) {
		return Math.sqrt(Math.pow((s.fine.x - s.inizio.x), 2) + Math.pow((s.fine.y - s.inizio.y), 2)
				+ Math.pow((s.fine.z - s.inizio.z), 2));
	}

	static void inizioInOrigine(Segmento s) {
		s.inizio.x = s.inizio.y = s.inizio.z = 0;
	}

	static Punto mediano(Segmento s) {
		Punto med = new Punto();
		med.x = (s.fine.x + s.inizio.x) / 2;
		med.y = (s.fine.y + s.inizio.y) / 2;
		med.z = (s.fine.z + s.inizio.z) / 2;
		return med;
	}

	static Segmento meta(Segmento s) {
		Segmento met = new Segmento();
		met.inizio = s.inizio;
		met.fine = mediano(s);
		return met;
	}

	public static void main(String[] args) {
		Segmento s1 = new Segmento();
		s1.inizio = new Punto();
		s1.fine = new Punto();

		s1.inizio.x = s1.inizio.y = s1.inizio.z = 4;
		s1.fine.x = s1.fine.y = s1.fine.z = 10;

		System.out.println("Lunghezza di s1: " + lunghezza(s1));

		inizioInOrigine(s1);
		System.out.println(
				"s1.inizio.x: " + s1.inizio.x + ", s1.inizio.y: " + s1.inizio.y + ", s1.inizio.z: " + s1.inizio.z);
		Punto m = mediano(s1);
		System.out.println("m.x: " + m.x + ", m.y: " + m.y + ", m.z: " + m.z);

		Segmento s2 = meta(s1);
		System.out.println(
				"s2.inizio.x: " + s2.inizio.x + ", s2.inizio.y: " + s2.inizio.y + ", s2.inizio.z: " + s2.inizio.z);

		System.out.println("s2.fine.x: " + s2.fine.x + ", s2.fine.y: " + s2.fine.y + ", s2.fine.z: " + s2.fine.z);
	}
}
