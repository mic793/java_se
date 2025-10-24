package day_07;

public class KidsGarden {

	public static void main(String[] args) {

		// Dichiara un array di stringhe con i nomi dei bambini.
		String[] kids = { "Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ilena", "Joseph",
				"Kincaid", "Larry" };

		// Definisce la prima fila di piante 
		String fila1 = "VRCGVVRVCGGCCGVRGCVCGCGV";
		// Definisce la seconda fila di piante.
		String fila2 = "VRCCCGCRRGVCGCRVVCVGCGCV";

		// Inizializza un indice per tenere traccia della posizione nelle file di piante.
		int indicePianta = 0;
		
		// Dichiara un array di caratteri per contenere le 4 piante di un singolo bambino.
		char[] kidPlants = new char[4];

		// Stampa un titolo per l'output.
		System.out.println("Assegnazione delle piante");

		// Inizia un ciclo 'for' per scorrere l'elenco dei bambini.
		for (int i = 0; i < kids.length; i++) {
            
			// Prende la prima pianta per il bambino corrente dalla prima fila.
			kidPlants[0] = fila1.charAt(indicePianta);
			// Prende la seconda pianta per il bambino corrente dalla prima fila.
			kidPlants[1] = fila1.charAt(indicePianta + 1);
			// Prende la terza pianta per il bambino corrente dalla seconda fila.
			kidPlants[2] = fila2.charAt(indicePianta);
			// Prende la quarta pianta per il bambino corrente dalla seconda fila.
			kidPlants[3] = fila2.charAt(indicePianta + 1);
			
			// Dichiara un array di stringhe per contenere i nomi tradotti delle piante.
			String[] kidPlantsNames = new String[4];
			// Inizia un ciclo per tradurre ogni iniziale di pianta nel suo nome completo.
			for(int j = 0; j < kidPlants.length; j++) {
				// Chiama il metodo di traduzione e salva il nome nell'array.
				kidPlantsNames[j] = traduciPianta(kidPlants[j]);
				
			}
			// Stampa il nome del bambino seguito dai nomi delle sue quattro piante.
			System.out.println(kids[i] + ": " + kidPlantsNames[0] + ", " + kidPlantsNames[1] + ", "
					+ kidPlantsNames[2] + ", " + kidPlantsNames[3]);

			// Avanza l'indice di due posizioni per passare al prossimo bambino.
			indicePianta = indicePianta + 2;
		}
	}

	// Metodo privato che traduce il carattere di una pianta nel suo nome completo.
	private static String traduciPianta(char simbolo) {

		// Dichiara una stringa vuota che conterrà il nome completo della pianta.
		String estesa = "";

		// Inizia un blocco 'switch' per valutare il carattere 'simbolo'.
		switch (simbolo) {
		// Se il carattere è 'G',
		case 'G':
			// assegna "Erba" alla variabile 'estesa'.
			estesa = "Erba";
			// Interrompe l'esecuzione dello switch.
			break;
		// Se il carattere è 'C',
		case 'C':
			// assegna "Trifoglio" alla variabile 'estesa'.
			estesa = "Trifoglio";
			// Interrompe l'esecuzione dello switch.
			break;
		// Se il carattere è 'R',
		case 'R':
			// assegna "Ravanello" alla variabile 'estesa'.
			estesa = "Ravanello";
			// Interrompe l'esecuzione dello switch.
			break;
		// Se il carattere è 'V',
		case 'V':
			// assegna "Viola" alla variabile 'estesa'.
			estesa = "Viola";
			// Interrompe l'esecuzione dello switch.
			break;
		// Se il carattere non corrisponde a nessun caso precedente,
		default:
			// assegna "Sconosciuto" come valore di default.
			estesa = "Sconosciuto";

		};
		// Restituisce la stringa con il nome della pianta.
		return estesa;
	}
}