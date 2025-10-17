package day_00_es_04_elettrodomestici;

import day_00_es_04_elettrodomestici.Frigorifero.Temperatura;

public class Lavatrice extends Elettrodomestico {

	public enum CicloLavaggio {
		BREVE, DELICATO, FREDDO, INTENSO
	}
	
	private CicloLavaggio programma;
	
	public Lavatrice() {
		super();
	}
	
	public Lavatrice(String aMarca, String aModello, String aClasseEnergetica, int aPotenza, boolean aStato, CicloLavaggio aProgramma) {
		//String aMarca, String aModello, String aClasseEnergetica, int aPotenza, boolean aStato
		super(aMarca, aModello, aClasseEnergetica, aPotenza, aStato); // <-- super corretto qui
		this.programma = aProgramma;
	}
	
	public CicloLavaggio getProgramma() {
		return programma;
	}

	public void setProgramma(CicloLavaggio aProgramma) {
		this.programma = aProgramma;
	}

	@Override
	public String toString() {
		return "Lavatrice [" + super.toString() + " programma " + programma + "]";
	}

}
