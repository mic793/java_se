package day_04;

/**
 * Questa classe implementa l'algoritmo del Crivello di Eratostene
 * per determinare se un dato numero è primo, calcolando tutti i numeri primi fino a quel numero.
 */
public class CrivelloEratostene {
	
	public static void main(String[] args) {
		
		// Imposta il numero che si vuole verificare (e il limite superiore del crivello).
		int numero = 17;
		
		// Crea un array di booleani (il "crivello") di dimensione 'numero + 1'.
		// L'indice dell'array rappresenta il numero stesso. isPrimo[i] sarà true se i è primo.
		boolean[] isPrimo = new boolean[numero+1];
		// Per default, un array di boolean in Java è inizializzato con tutti i valori a 'false'.
		//[false][false][false][false][false][false][false][false][false][false][false][false][false][false][false][false][false][false]
        //    0      1     2      3       4     5      6      7      8      9      10     11     12     13     14     15     16     17
		
		// Primo passo: si assume che tutti i numeri da 2 a 'numero' siano primi.
		for(int i = 2; i <= numero; i++) {
			// Imposta il valore a 'true' per ogni numero a partire da 2.
			isPrimo[i] = true;
		}
		// Stato dell'array dopo l'inizializzazione. 0 e 1 sono correttamente 'false'.
		//[false][false][true][true][true][true][true][true][true][true][true][true][true][true][true][true][true][true]
        //    0      1     2     3      4    5     6    7      8     9    10     11   12    13    14    15    16    17
		
		// Ciclo principale dell'algoritmo del crivello.
		// Si itera a partire da 2 fino alla radice quadrata di 'numero' (un'ottimizzazione chiave).
		for(int i = 2; i <= Math.sqrt(numero); i++) {
		     // Se il numero 'i' è ancora considerato primo (il suo valore nell'array è 'true'),
		     if (isPrimo[i]) {
			        // allora tutti i suoi multipli non possono essere primi.
			        // Si parte da i*i (altra ottimizzazione) e si marcano tutti i multipli successivi.
			        for (int j = i * i; j <= numero; j += i) {
			            // Imposta il valore a 'false' per ogni multiplo trovato.
			            isPrimo[j] = false;
			        }
			 }
		}
	
		// Stato finale dell'array dopo aver "setacciato" tutti i multipli.
		// Gli indici con valore 'true' corrispondono ai numeri primi.
    	//[false][false][true][true][false][true][false][true][false][false][false][true][false][true][false][false][false][true]
        //    0      1     2     3      4    5     6       7     8     9      10     11    12     13     14     15     16    17
		
		// Stampa il risultato finale.
		// Utilizza un operatore ternario per scegliere la stringa corretta in base al valore di isPrimo[numero].
		System.out.println("Il numero " + numero + ((isPrimo[numero] ? " e' primo": " non e' primo")));
	}
}


//ESERCIZIO 11
//Scrivi un programma java per verificare se un numero è primo con il metodo del crivello di eratostene.
/*
public class CrivelloEratostene{
    public static void main(String[] args) {
        int numero = 17;
        boolean[] isPrimo = new boolean[numero + 1];
        for (int i = 2; i <= numero; i++) {
            isPrimo[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (isPrimo[i]) {
                for (int j = i * i; j <= numero; j += i) {
                    isPrimo[j] = false;
                }
            }
        }
        System.out.println("Il numero " + numero + ((isPrimo[numero] ? " è primo" : " non è primo")));
    }
}
*/

