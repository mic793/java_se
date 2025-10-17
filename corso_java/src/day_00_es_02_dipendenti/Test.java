package day_00_es_02_dipendenti;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Dipendente> dipendenti = new ArrayList<>(); 

		// String aNome, String aId, double aSalarioBase
		Dipendente ift = new ImpiegatoFullTime("Paolo Rossi", "ID01", 1500);

		// String aNome, String aId, double aSalarioBase, double aOreLavorate
		Dipendente ipt = new ImpiegatoPartTime("Marta Neri", "ID02", 1600, 20);

		// String aNome, String aId, double aSalarioBase, double aBonus
		Dipendente m = new Manager("Paola Verdi", "ID03", 2500, 600);

		//System.out.println(ift);
		//System.out.println(ipt);
		//System.out.println(m);
		
		dipendenti.add(ift);
		dipendenti.add(ipt);
		dipendenti.add(m);
		
		for(Dipendente d : dipendenti) {
			//System.out.println(d.toString());
			System.out.println("Il dipendente " + d.getNome() + " ha uno stipendio di Euro " + d.calcolaStipendio());
		}
		

	}

}
