package day_00_es_07_spedizione;

import java.util.LinkedList;
import java.util.List;

public class GestoreSpedizione {
	
	private final List<Pacco> spedizioni;

	public GestoreSpedizione() {
		super();
		this.spedizioni = new LinkedList<>();
	}

	public List<Pacco> getSpedizioni() {
		return spedizioni;
	}

	@Override
	public String toString() {
		return "GestoreSpedizioni [spedizioni=" + spedizioni + "]";
	}
	
	
}
