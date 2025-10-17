package day_00_es_02_dipendenti;

public class ImpiegatoPartTime extends Dipendente{
	
	private double oreLavorate;
	
	public ImpiegatoPartTime() {
		super();
	}
	
	public ImpiegatoPartTime(String aNome, String aId, double aSalarioBase, double aOreLavorate) {
		super(aNome, aId, aSalarioBase);
		this.oreLavorate = aOreLavorate;
	}

	public double getOreLavorate() {
		return oreLavorate;
	}

	public void setOreLavorate(double aOreLavorate) {
		this.oreLavorate = aOreLavorate;
	}
	
	public double calcolaStipendio() {
		return super.getSalarioBase() * this.oreLavorate;
	}

	@Override
	public String toString() {
		return super.toString() + " - ImpiegatoPartTime oreLavorate=" + oreLavorate + "]";
	}
	
	
	

}
