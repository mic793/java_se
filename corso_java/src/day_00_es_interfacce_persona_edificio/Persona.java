package day_00_es_interfacce_persona_edificio;

public class Persona implements Comparable<Persona>{
	protected double altezza;
	
	public Persona() {
		super();
	}
	
	public Persona(double aAltezza) {
		this.altezza=aAltezza;
	}
	
	public int compareTo(Persona other) {
		return Double.compare(this.altezza, other.altezza);
	}
	
	public String toString() {
		return "Persona [altezza = " + altezza + "]";
	}

}
