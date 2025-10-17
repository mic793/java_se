package day_00_es_01_negozio_online;

import java.util.LinkedList;
import java.util.List;

public class Carrello {
	
	private final List<Prodotto> prodotti;

	public Carrello() {
		super();
		this.prodotti = new LinkedList<>();	
	}

	public List<Prodotto> getProdotti() {
		return prodotti;
	}

	@Override
	public String toString() {
		return "Carrello [prodotti=" + prodotti + "]";
	}
	
		
}
