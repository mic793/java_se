package day_00_es_08_votazione_concorso;

import java.util.LinkedList;
import java.util.List;

public class Concorso {
	
	private final List<Partecipante> partecipanti;

	public Concorso() {
		super();
		this.partecipanti = new LinkedList<>();
	}

	public List<Partecipante> getPartecipanti() {
		return partecipanti;
	}

	@Override
	public String toString() {
		return "Concorso [partecipanti=" + partecipanti + "]";
	}
	
	
	
}
