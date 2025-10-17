package day_00_es_07_collezioneOpereArte;

import java.util.LinkedList;
import java.util.List;

public class Collezione {
	private String nome;
	//List<OperadArte> opere = new LinkedList<>();
	private final List<OperadArte> opere;
	/*
	 * final rende immutabile il riferimento, non il contenuto. 
	 * Cosa impedisce: 
	 * - dopo l’inizializzazione nel costruttore, non è più possibile fare opere = new ArrayList<>();. 
	 * Quindi il campo punterà sempre alla stessa lista.
	 * Cosa non impedisce: 
	 * - la lista interna resta mutabile; si possono aggiungere/rimuovere elementi (add, remove, …). final blocca il riferimento, non gli elementi.
	 * Perché è utile:
	 * Intento chiaro: comunica che la collezione interna esiste per tutta la vita dell’oggetto e non verrà rimpiazzata con un’altra lista.
	 * Riduzione dei bug: evita riassegnazioni accidentali del campo a una nuova lista, che potrebbero far “perdere” le opere già inserite.
	 * Invariante di classe: garantisce che i metodi lavorino sempre sulla stessa struttura dati inizializzata nel costruttore.
	 * Se si volesse anche impedire la modifica del contenuto dall’esterno, si potrebbero:
	 * - non esporre un getter della lista oppure restituire una vista non modificabile: Collections.unmodifiableList(opere);
	 * - aggiungere solo metodi controllati (inserisciOpera, ecc.) e non permettere accesso diretto alla lista.
	 * */
	
	//COSTRUTTORE PARAMETRICO
	public Collezione(String aNome) {
		super();
		this.nome = aNome;
		this.opere = new LinkedList<>();		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}
	
	public List<OperadArte> getOpere(){
		return opere;
	}	
	
	@Override
	public String toString() {
		return "Collezione [nome = " + nome + opere.toString() + "]" ;
	}
	
}
