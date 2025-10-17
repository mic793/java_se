package day_06;

import java.util.Scanner;

/*
 * Determinare se una parola o una frase è un isogramma.
 * Un isogramma (noto anche come "parola non modello") è una parola o una frase senza una lettera ripetuta, tuttavia spazi e trattini possono apparire più volte.
 * Esempi di isogrammi:
 * Raspberry
 * Speak
 * Change
*/

/*
 * Determine whether a word or phrase is a isogram.
 * An isogram (also known as a "non-pattern word") is a word or phrase
 * without a repeated letter, although spaces and hyphens may appear multiple times.
 * Examples of isograms:
 * Raspberry
 * Speak
 * Change*/

/*
 public class Isogramma {


    // Metodo principale 'main', dove inizia l'esecuzione del programma.
    public static void main(String[] args) {

        // Crea un nuovo oggetto Scanner per leggere l'input dell'utente dalla console.
        Scanner input = new Scanner(System.in);

        // Crea un array di 25 booleani, uno per ogni lettera dell'alfabeto.
        boolean[] lettere = new boolean[25]; // di default un array di boolean viene inizializzato a false
        // boolean[] lettere1 = {true, false, false, true}; altro modo per definire un array

        // Visualizzazione dello stato iniziale dell'array di controllo.
        // [f][f][f][f][f][f][f][f][f][f][f][f][f][f][f][f][f][f][f][f][f][f][f][f][f]
        // 0 1 2…
        // a b c…
        
        // Inizializza una variabile booleana a 'true', assumendo che la parola sia un isogramma.
        boolean isogramma = true;

        // Stampa un messaggio per chiedere all'utente di inserire una parola.
        System.out.println("Inserisci una parola e ti diro' se e' un isogramma: ");

        // Legge l'intera riga inserita, la converte in minuscolo per un controllo uniforme.
        String frase = input.nextLine().toLowerCase();

        // Inizia un ciclo 'for' per analizzare ogni carattere della stringa inserita.
        for (int i = 0; i < frase.length(); i++) {
            // Estrae il carattere alla posizione corrente.
            char lettera = frase.charAt(i); // [c][i][a][o][!]
            
            // Controlla se il carattere è una lettera dell'alfabeto (ignora spazi, numeri, punteggiatura).
            if (lettera >= 'a' && lettera <= 'z') {
                // Calcola l'indice dell'array corrispondente alla lettera (a=0, b=1, c=2...).
                int index = lettera - 'a';
                
                // Controlla se abbiamo già incontrato questa lettera (se l'indice è ancora 'false').
                if (lettere[index] == false) {
                    // Se non l'abbiamo mai vista, la marchiamo come 'vista' impostando l'indice a 'true'.
                    lettere[index] = true;
                } else {
                    // Se l'indice è già 'true', significa che la lettera è ripetuta.
                    System.out.println("La parola non e' un isogramma!");
                    // Imposta la variabile a 'false' per registrare che non è un isogramma.
                    isogramma = false;
                    // Interrompe il ciclo, non serve continuare il controllo.
                    break;
                }
            }
        }

        // Dopo il ciclo, controlla se la variabile 'isogramma' è rimasta 'true'.
        if (isogramma) {
            // Se è rimasta 'true', significa che nessuna lettera è stata ripetuta.
            System.out.println("La frase e' un isogramma");
        }
        
        // Chiude lo scanner per liberare le risorse di sistema.
        input.close();
    }
}

*/

//ESERCIZIO 2
public class Isogramma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Crea un array di 25 booleani, uno per ogni lettera dell'alfabeto.
		boolean[] lettere = new boolean[25];

		// Inizializza una variabile booleana a 'true', assumendo che la parola sia un isogramma.
		boolean isogramma = true;

		System.out.println("Inserisci una parola e ti diro' se e' un isogramma: ");

		// Legge l'intera riga inserita, la converte in minuscolo per un controllo uniforme.
		String frase = input.nextLine().toLowerCase();

		for (int i = 0; i < frase.length(); i++) {

			// Estrae il carattere alla posizione corrente.
			char lettera = frase.charAt(i);
			// Controlla se il carattere è una lettera dell'alfabeto (ignora spazi, numeri, punteggiatura).
			if (lettera >= 'a' && lettera <= 'z') {
				
				// Calcola l'indice dell'array corrispondente alla lettera (a=0, b=1, c=2...).
				int indice = lettera - 'a';
				// Controlla se abbiamo già incontrato questa lettera (se l'indice è ancora 'false').
				if (lettere[indice] == false) {
					// Se non l'abbiamo mai vista, la marchiamo come 'vista' impostando l'indice a 'true'.
					lettere[indice] = true;
				} else {
					isogramma = false;
				}
			}
		}
		if (isogramma) {
			System.out.println("la frase e' un isogramma");
		} else {
			System.out.println("la frase non e' un isogramma");
		}

		input.close();
	}

}
