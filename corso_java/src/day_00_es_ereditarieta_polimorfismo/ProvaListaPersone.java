package day_00_es_ereditarieta_polimorfismo;

import java.util.Scanner;

public class ProvaListaPersone {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ElencoPersone elenco1 = new ElencoPersone(10);

		boolean continua = false;

		do {
			System.out.println("""
                    Chi si vuole inserire?
                    1) Persona
                    2) Studente
                    3) Docente
                    Selezione: """);
			int opz = input.nextInt();
			input.nextLine();
			String cf = "";
			String nome = "";
			String cognome = "";

			if (opz < 4) {
				System.out.println("Inserire CF");
				cf = input.nextLine();
				System.out.println("Inserire nome");
				nome = input.nextLine();
				System.out.println("Inserire cognome");
				cognome = input.nextLine();
			}
			switch (opz) {
			case 1:
				Persona p1 = new Persona(cf, nome, cognome);
				System.out.println(elenco1.aggiungiPersona(p1));
				break;
			case 2:
				// String aCf, String aNome, String aCognome, String aMatricola, String
				// aUniversita
				System.out.println("Inserire matricola");
				String matricola = input.nextLine();
				System.out.println("Inserire universita");
				String universita = input.nextLine();
				Studente s1 = new Studente(cf, nome, cognome, matricola, universita);
				System.out.println(elenco1.aggiungiPersona(s1));
				break;
			case 3:
				// String aCf, String aNome, String aCognome, String aMateria, double aSalario
				System.out.println("Inserire materia");
				String materia = input.nextLine();
				System.out.println("Inserire salario");
				double salario = input.nextDouble();
				Docente d1 = new Docente(cf, nome, cognome, materia, salario);
				System.out.println(elenco1.aggiungiPersona(d1));
				break;
			default:
				System.out.println("Opzione non in elenco");
			}
			System.out.println("Inserire un'altra persona? S/N");
			String scelta = input.nextLine();
			if (scelta.equalsIgnoreCase("S")) {
				continua = true;
			} else {
				continua = false;
			}

		} while (continua);

		System.out.println(elenco1.toString());

	}

}
