package algoritmi_colloquio;

public class RicercaBinaria {
	
	public static int ricercaBinaria(int arr[], int x) {
	    
	    // Inizializza due puntatori: 'l' (left) all'inizio dell'array e 'r' (right) alla fine.
	    // Questi due puntatori definiscono l'intervallo in cui stiamo cercando.
	    int l = 0; 
	    int r = arr.length - 1; 
	    
	    // Il ciclo continua finché l'intervallo di ricerca è valido (l'inizio è prima o coincide con la fine).
	    while (l <= r) {
	        // Calcola l'indice dell'elemento centrale dell'intervallo corrente.
	        // La formula l + (r - l) / 2 è preferita a (l + r) / 2 per evitare problemi di overflow con numeri molto grandi.
	        int m = l + (r - l) / 2; // m -> middle

	        // 1° CONTROLLO: Abbiamo trovato il numero?
	        // Controlla se l'elemento al centro (arr[m]) è proprio il numero che stiamo cercando (x).
	        if (arr[m] == x) {
	            return m; // Se sì restituiamo il suo indice 'm'.
	        }

	        // 2° CONTROLLO: Il numero che cerchiamo è più grande?
	        // Se l'elemento centrale è più piccolo del numero che cerchiamo...
	        if (arr[m] < x) {
	            // ...allora il nostro numero, se esiste, si troverà sicuramente nella metà destra dell'array.
	            // Ignoriamo quindi tutta la parte sinistra, spostando il puntatore 'l' subito dopo 'm'.
	            l = m + 1;
	        } 
	        // 3° CONTROLLO: Il numero che cerchiamo è più piccolo?
	        else {
	            // Se l'elemento centrale è più grande del numero che cerchiamo...
	            // ...allora il nostro numero, se esiste, si troverà nella metà sinistra.
	            // Ignoriamo la parte destra, spostando il puntatore 'r' subito prima di 'm'.
	            r = m - 1;
	        }
	    }
	    
	    // Se il ciclo 'while' finisce, significa che l'intervallo di ricerca si è "chiuso" (l > r)
	    // senza aver trovato il numero.
	    return -1; // Restituiamo -1, un valore convenzionale per dire "elemento non trovato".
	}

	public static void main(String[] args) {
		
		               //0  1  2   3   4   5  6   7   8    9  10  11  12  13  14  15  16  17  18 
		int[] numbers = {3, 7, 8, 12, 16, 20, 22, 25, 40, 48, 52, 68, 70, 74, 75, 80, 85, 92, 100 };
		
		int x = 12;
		
		if(ricercaBinaria(numbers, x) == -1) {
			System.out.println("L'elemento cercato non e' presente nell'array");
		}else {
			System.out.println("L'elemento cercato " + x + " e' nella posizione con indice " + ricercaBinaria(numbers, x));
		}
		
	}

}
