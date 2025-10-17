package day_00_es_07_spedizione;

public class PaccoFragile extends Pacco{
	private static final double SOVRAPPREZZO = 0.015;

	
	private double sovrapprezzo;
	
	public PaccoFragile() {
		super();
	}

	public PaccoFragile(double aPeso, Indirizzo aDestinazione) {
		super(aPeso, aDestinazione);
		this.sovrapprezzo = 0.15;
	}

	public double getSovrapprezzo() {
		return sovrapprezzo;
	}

	public void setSovrapprezzo(double sovrapprezzo) {
		this.sovrapprezzo = sovrapprezzo;
	}
	
	public double getCosto() {
		return super.getPeso() * COSTO_BASE * (1+SOVRAPPREZZO);

	}

	@Override
	public String toString() {
		return super.toString() + " PaccoFragile [sovrapprezzo=" + sovrapprezzo + "]";
	}

}
