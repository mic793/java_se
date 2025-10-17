package day_00_es_07_spedizione;

public class PaccoStandard extends Pacco{
	
	public PaccoStandard() {
		super();
	}

	public PaccoStandard(double aPeso, Indirizzo aDestinazione) {
		super(aPeso, aDestinazione);
	}
	
	@Override
	public double getCosto() {
		return super.getPeso() * COSTO_BASE;
	}

	@Override
	public String toString() {
		return super.toString() + " PaccoStandard ";
	}
		
}
