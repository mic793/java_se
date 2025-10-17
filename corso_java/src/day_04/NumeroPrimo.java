package day_04;

/*
 * Write a Java program that checks whether a given number is prime or not.
 * */

/*public class NumeroPrimo {

    // Metodo principale 'main', dove inizia l'esecuzione del programma.
    public static void main(String[] args) {

        // Dichiara e inizializza il numero da controllare.
        int numero = 17;
        
        // Inizializza una variabile booleana a 'true', assumendo che il numero sia primo fino a prova contraria.
        boolean isPrimo = true;
        
        // Controlla il caso base: i numeri minori o uguali a 1 non sono primi per definizione.
        if(numero <= 1) {
            isPrimo = false;
        } else {
            // Inizia un ciclo 'for' per trovare eventuali divisori, partendo da 2.
            // L'ottimizzazione consiste nel ciclare solo fino alla radice quadrata del numero.
            for(int i = 2; i <= Math.sqrt(numero); i++) {
                // Se il resto della divisione tra il numero e 'i' è 0, significa che 'i' è un divisore.
                if(numero % i == 0) {
                    // Imposta la variabile a 'false' perché abbiamo trovato un divisore.
                    isPrimo = false;
                    // Interrompe il ciclo, non è necessario continuare a cercare.
                    break;
                }
            }
        }
        // Stampa il risultato usando un operatore ternario per scegliere la frase corretta.
        System.out.println("Il numero " + numero + (isPrimo ? " e' primo" : " non e' primo"));

    }
}
*/

//ESERCIZIO 10
//Scrivi un programma Java che verifica se un numero dato è primo o meno.
public class NumeroPrimo {
	public static void main(String[] args) {
		int numero = 1;

		boolean isPrimo = true;

		// Controlla il caso base: i numeri minori o uguali a 1 non sono primi per
		// definizione.
		if (numero <= 1) {
			isPrimo = false;

		} else {
			// L'ottimizzazione consiste nel ciclare solo fino alla radice quadrata del
			// numero.
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					isPrimo = false;
					break;
				}
			}
		}
		// Stampa il risultato usando un operatore ternario per scegliere la frase
		// corretta.
		System.out.println("Il numero " + numero + (isPrimo ? " e' primo" : " non e' primo"));

	}

}
