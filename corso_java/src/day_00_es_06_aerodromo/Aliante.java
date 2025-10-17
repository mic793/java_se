package day_00_es_06_aerodromo;

import java.util.Objects;

public class Aliante extends Aeromobile {
	private int efficienza;

	public Aliante() {
		super();
	}

	public Aliante(String aSigla, int aEfficienza) {
		super(aSigla);
		this.efficienza = aEfficienza;
	}

	public int getEfficienza() {
		return efficienza;
	}

	public void setEfficienza(int aEfficienza) {
		this.efficienza = aEfficienza;
	}

	@Override
	public int compareTo(Aeromobile other) {
		if (other == null)
			throw new NullPointerException("other is null");
		if (getClass() != other.getClass()) {
			throw new ClassCastException("Confronto non valido: atteso Aliante");
		}
		Aliante al = (Aliante) other;
		if (this.efficienza < al.getEfficienza()) return -1;
		if (this.efficienza == al.getEfficienza()) return 0;
		return 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(efficienza);
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
		Aliante other = (Aliante) obj;
		return efficienza == other.efficienza;
	}

	@Override
	public String toString() {
		return super.toString() + " Aliante efficienza = " + efficienza + "]";
	}
}
