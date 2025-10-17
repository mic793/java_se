package day_00_es_interfacce_persona_edificio;

public class Edificio implements Comparable<Edificio>{
	protected double altezza;
	
	public Edificio() {
		super();
	}
	
	public Edificio(double aAltezza) {
		this.altezza = aAltezza;
	}
	
	@Override
	public int compareTo(Edificio other) {
		return Double.compare(this.altezza, other.altezza);
	}
	
	@Override
	public String toString() {
		return "Edificio [altezza " + altezza + "]";
	}

}


