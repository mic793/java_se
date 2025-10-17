package day_00_es_08_deposito;

import day_00_es_06_aerodromo.Aliante;

public class Lattina extends Contenitore{
		
	public Lattina() {
		super();
	}
	
	public Lattina(String aCodice, String aNome, double aQuantita) {
		super(aCodice, aNome, aQuantita);
	}
	
	public int compareTo(Contenitore other) {
		if (other == null)
			throw new NullPointerException("other is null");
		if (getClass() != other.getClass()) {
			throw new ClassCastException("Confronto non valido: attesa Lattina");
		}
		Lattina l = (Lattina) other;
		if (super.getQuantita() < l.getQuantita()) return -1;
		if (super.getQuantita() == l.getQuantita()) return 0;
		return 1;
	}
	
	@Override
	public String toString() {
		return "Lattina[ " + super.toString() + " ]";
	}
	
	

}
