package day_00_es_02_dipendenti;

public class ImpiegatoFullTime extends Dipendente {

	public ImpiegatoFullTime() {
		super();
	}
	
	public ImpiegatoFullTime(String aNome, String aId, double aSalarioBase) {
		super(aNome, aId, aSalarioBase);
	}
	
	public double calcolaStipendio() {
		return super.getSalarioBase();//e' corretto????
	}

	@Override
	public String toString() {
		return super.toString() + " - ImpiegatoFullTime ]";
	}
	
	
}
