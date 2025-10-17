package day_00_es_02_dipendenti;

import java.util.ArrayList;
import java.util.List;

public class GestioneAzienda {

	List<Dipendente> dipendenti = new ArrayList<>();

	public GestioneAzienda() {
		super();
	}

	public GestioneAzienda(List<Dipendente> dipendenti) {
		super();
		this.dipendenti = dipendenti;
	}

	public List<Dipendente> getDipendenti() {
		return dipendenti;
	}

	@Override
	public String toString() {
		return "GestioneAzienda [dipendenti=" + dipendenti + "]";
	}
	
		
}//la posso cancellare non serve
