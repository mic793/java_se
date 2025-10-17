package day_00_es_06_aerodromo;

import java.util.Objects;

public class AereoAMotore extends Aeromobile {
	private double potenza;

	public AereoAMotore() {
		super();
	}

	public AereoAMotore(String aSigla, double aPotenza) {
		super(aSigla);
		this.potenza = aPotenza;
	}

	public double getPotenza() {
		return potenza;
	}

	public void setPotenza(double aPotenza) {
		this.potenza = aPotenza;
	}

	// Regola richiesta: false se x == null o tipo diverso; altrimenti confronto per
	// potenza
	@Override
	public int compareTo(Aeromobile other) {
		if (other == null)
			throw new NullPointerException("other is null");
		if (!(other instanceof AereoAMotore)) {
			throw new ClassCastException("Confronto non valido: atteso AereoAMotore");
		}
		AereoAMotore am = (AereoAMotore) other;
		if (this.potenza < am.getPotenza()) return -1;
		if (this.potenza == am.getPotenza()) return 0;
		return 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(potenza);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AereoAMotore other = (AereoAMotore) obj;
		return Double.doubleToLongBits(potenza) == Double.doubleToLongBits(other.potenza);
	}

	@Override
	public String toString() {
		return super.toString() + " Aerei a motore potenza = " + potenza + "]";
	}
}
