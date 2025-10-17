package day_00_es_04_elettrodomestici;

public class Televisione extends Elettrodomestico{
	private int canale;
	
	public Televisione() {
		super();
	}
	
	public Televisione(String aMarca, String aModello, String aClasseEnergetica, int aPotenza, boolean aStato, int aCanale) {
		// String aMarca, String aModello, String aClasseEnergetica, int aPotenza, boolean aStato
		super(aMarca, aModello, aClasseEnergetica, aPotenza, aStato);
		this.canale = aCanale;
	}

	public int getCanale() {
		return canale;
	}

	public void setCanale(int aCanale) {
		this.canale = aCanale;
	}

	@Override
	public String toString() {
		return "Televisione [" + super.toString() + "canale" + canale + "]";
	}


}
