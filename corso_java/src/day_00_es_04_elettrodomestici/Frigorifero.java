package day_00_es_04_elettrodomestici;

import day_00_es_04_elettrodomestici.Lavatrice.CicloLavaggio;

public class Frigorifero extends Elettrodomestico {

	public enum Temperatura {
		MINIMA, BASSA, MEDIA, ALTA
	}

	private Temperatura valore;

	public Frigorifero(String aMarca, String aModello, String aClasseEnergetica, int aPotenza, boolean aStato,
			Temperatura aValore) {
		// String aMarca, String aModello, String aClasseEnergetica, int aPotenza, boolean aStato
		super(aMarca, aModello, aClasseEnergetica, aPotenza, aStato); // <-- super corretto qui
		this.valore = aValore;
	}

	public Temperatura getValore() {
		return valore;
	}

	public void setValore(Temperatura valore) {
		this.valore = valore;
	}

	@Override
	public String toString() {
		return "Frigorifero [" + super.toString() + "valore = " + valore + "]";
	}

}
