package day_00_es_08_deposito;

public class Bidone extends Contenitore {
		
	public Bidone() {
		super();
	}
	
	public Bidone(String aCodice, String aNome, double aQuantita) {
		super(aCodice, aNome, aQuantita);
	}
	
	public int compareTo(Contenitore other) {
		if (other == null)
			throw new NullPointerException("other is null");
		if (getClass() != other.getClass()) {
			throw new ClassCastException("Confronto non valido: attesa Lattina");
		}
		Bidone b = (Bidone) other;
		if (super.getQuantita() < b.getQuantita()) return -1;
		if (super.getQuantita() == b.getQuantita()) return 0;
		return 1;
	}
	
	@Override
	public String toString() {
		return "Bidone[ " + super.toString() + " ]";
	}
	
	

}
