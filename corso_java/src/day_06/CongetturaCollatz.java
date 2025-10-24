package day_06;

/*
 * La Congettura di Collatz o problema 3x+1 può essere riassunta come segue:
 * Prendi qualsiasi numero intero positivo n. Se n è pari, dividi n per 2 per ottenere n / 2. Se n è dispari, moltiplicare n per 3 e aggiungere 1 per ottenere 3n + 1. Ripetere il processo indefinitamente. La congettura afferma che non importa con quale numero inizi, alla fine raggiungerai sempre 1.
 * Dato un numero n, restituire il numero di passi necessari per raggiungere 1.
 */

public class CongetturaCollatz {

    // Metodo che calcola il numero di passi della sequenza di Collatz per arrivare a 1.
    public static int collatzSteps(int n) {
        // Controlla se il numero in input è valido. La congettura si applica a interi positivi.
        if (n <= 0) {
            // Se il numero non è valido, lancia un'eccezione per indicare l'errore.
            throw new IllegalArgumentException("Il numero deve essere un intero positivo maggiore di 0.");
        }

        // Inizializza a 0 un contatore per i passi della sequenza.
        int passi = 0;

        // Inizia un ciclo che continua finché il numero 'n' non raggiunge il valore 1.
        while(n != 1) {
            // Controlla se il numero corrente 'n' è pari.
            if (n % 2 == 0) {
                // Se è pari, lo divide per 2.
                n = n / 2; 
            } else {
                // Altrimenti (se è dispari), lo moltiplica per 3 e aggiunge 1.
                n = 3 * n + 1;
            }
            // Ad ogni operazione (divisione o moltiplicazione), incrementa il contatore dei passi.
            passi = passi +1;
        }
        // Una volta che il ciclo termina (quando n=1), restituisce il numero totale di passi.
        return passi;
    }
    
        // Metodo principale 'main', il punto di ingresso del programma.
    public static void main(String[] args) {
    	
        // Dichiara e inizializza il numero di partenza per la sequenza.
        int n = 12;
        // Chiama il metodo collatzSteps per calcolare il numero di passi e salva il risultato.
        int result = collatzSteps(n);
        
        // Stampa a video il numero di passi calcolato.
        System.out.println("Numero di passi per raggiungere 1 partendo da " + n + ": " + result);
    }
}


//ESERCIZIO 1
//Dato un numero n, restituire il numero di passi necessari per raggiungere 1.
/*
public class CongetturaCollatz {
	public static int collatzSteps(int n) {

		if (n <= 0) {
			throw new IllegalArgumentException("Il numero deve essere un intero positivo maggiore di 0.");

		}

		int passi = 0;//passi corrisponde a i del ciclo for

		while (n != 1) {

			if (n % 2 == 0) {

				n /= 2;//divisione per due
			} else {
				n = 3 * n + 1;
			}
			passi++;
		}
		return passi;
	}

	public static void main(String[] args) {

		int n = 12;
		int result = collatzSteps(n);
		System.out.println("Numero di passi per raggiungere 1 partendo da " + n + ": " + result);
	}

}
*/