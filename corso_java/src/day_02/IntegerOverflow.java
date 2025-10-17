package day_02;

/*
 * Lo scopo dell'esercizio è dimostrare il concetto di "integer overflow" in programmazione.
 * L'esercizio mostra che i tipi di dati numerici, come int in Java, non sono infiniti e hanno dei limiti ben precisi.
 * L'esercizio mette in evidenza:
 * - Limiti dei Tipi di Dato: mostra che una variabile di tipo int può contenere un valore massimo 
 * 	 (Integer.MAX_VALUE, che è 2,147,483,647).
 * - Comportamento dell'Overflow: mostra cosa succede quando si cerca di superare questo limite. 
 *   Invece di dare un errore, il valore fuoriesce (overflow) e "gira intorno" (wraps around), diventando il valore 
 *   più piccolo possibile (Integer.MIN_VALUE, che è -2,147,483,648).
 * - Potenziale fonte di bug: sottolinea come un'operazione matematica apparentemente innocua (max + 1) possa produrre 
 *   un risultato completamente inaspettato e scorretto. 
 *   Questo è una causa comune di errori (bug) nei programmi, specialmente in quelli che gestiscono grandi numeri, 
 *   come applicazioni finanziarie, scientifiche o contatori di sistema.
*/

public class IntegerOverflow {

	public static void main(String[] args) {
		 // Assegna alla variabile 'max' il valore massimo che un tipo 'int' può contenere.
        int max = Integer.MAX_VALUE; 
        
        // Incrementa di 1 il valore massimo. Questo causa un "overflow".
        max = max + 1;
        
        // Stampa il nuovo valore di 'max', che sarà il minimo valore intero possibile (un numero negativo).
        System.out.println("Max value =: " + max);
    } 

}