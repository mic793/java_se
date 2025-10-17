package day_12.ex_08_museo;

/**
 * Rappresenta i tipi di materiali di cui può essere fatta un'opera d'arte.
 * Questo enum non solo definisce le costanti (MARMO, BRONZO), ma associa anche
 * a ciascuna di esse una stringa corrispondente in inglese.
 */
public enum Materiale {
	
	// Dichiarazione delle costanti enum.
	// Ognuna di esse è in realtà un'istanza dell'enum Materiale.
	// Il valore tra parentesi viene passato al costruttore dell'enum.
	MARMO("marble"), 
	BRONZO("bronze");
	
	// Campo privato e final per memorizzare la rappresentazione testuale in inglese del materiale.
	// 'final' indica che questo valore non può essere modificato dopo l'inizializzazione.
	private final String material;
	
	/**
	 * Costruttore privato dell'enum.
	 * Viene chiamato automaticamente per ogni costante definita (MARMO, BRONZO).
	 * Associa la stringa passata come argomento al campo 'material'.
	 * @param aMaterial La stringa che rappresenta il materiale (es. "marble").
	 */
	private Materiale(String aMaterial) {
		this.material = aMaterial;
	}
	
	/**
	 * Metodo Getter pubblico per accedere alla rappresentazione testuale del materiale.
	 * @return La stringa associata alla costante enum (es. "marble" per MARMO).
	 */
	public String getMaterial() {
		return material;
	}
	
	/**
	 * Metodo statico di utilità (factory method) per ottenere una costante enum
	 * a partire dalla sua rappresentazione testuale in stringa, ignorando maiuscole/minuscole.
	 * @param aMaterial La stringa da cui ricavare l'enum (es. "Marble", "marble", "MARBLE").
	 * @return L'oggetto Materiale corrispondente (es. Materiale.MARMO),
	 *         o null se non viene trovata nessuna corrispondenza.
	 */
	public static Materiale fromMaterial(String aMaterial) {
		// Il metodo 'values()' è fornito implicitamente a tutti gli enum e restituisce
		// un array con tutte le costanti dichiarate (in questo caso [MARMO, BRONZO]).
		for(Materiale m: values()) {
			// Confronta la stringa interna dell'enum corrente ('m.material') con la stringa passata,
			// ignorando le differenze tra maiuscole e minuscole.
			if(m.material.equalsIgnoreCase(aMaterial)) {
				// Se viene trovata una corrispondenza, restituisce subito la costante enum.
				return m;
			}
		}
		// Se il ciclo termina senza trovare corrispondenze, restituisce null.
		return null;
	}
}
