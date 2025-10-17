package day_00_es_07_spedizione;

public abstract class Pacco {
	
	double peso;
	Indirizzo destinazione;
	protected static final double COSTO_BASE = 2.50;
	
	public Pacco() {
		super();
	}

	public Pacco(double aPeso, Indirizzo aDestinazione) {
		super();
		this.peso = aPeso;
		this.destinazione = aDestinazione;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double aPeso) {
		this.peso = aPeso;
	}

	public Indirizzo getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(Indirizzo aDestinazione) {
		this.destinazione = aDestinazione;
	}
	
	/*
	 * public double getCosto() { return costo; }
	 */

	public abstract double getCosto();
	
	/*----------DA IMPLEMTARE NEL CONTROLLER------------
	public abstract double calcolaCosto();
	
	public static String stampaDettagli(double peso, Indirizzo destinazione) {
		return 
	}
	*/

	@Override
	public String toString() {
		return "Pacco [peso=" + peso + ", destinazione=" + destinazione + "]";
	}
		
}
