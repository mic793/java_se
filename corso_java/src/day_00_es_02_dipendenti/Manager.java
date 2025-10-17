package day_00_es_02_dipendenti;

public class Manager extends Dipendente{
	
	private double bonus;

	public Manager() {
		super();
	}

	public Manager(String aNome, String aId, double aSalarioBase, double aBonus) {
		super(aNome, aId, aSalarioBase);
		this.bonus = aBonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double calcolaStipendio() {
		return super.getSalarioBase() + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + " - Manager bonus=" + bonus + "]";
	}
	
	
	
	
}
