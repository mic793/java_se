package day_12;

// Dichiara una classe pubblica chiamata ForConMatrice.
public class ForConMatrice {

	// Metodo principale 'main', il punto di ingresso del programma.
	public static void main(String[] args) {
		
		// Dichiara e inizializza una matrice (array bidimensionale) di interi 3x3.
		int[][] matrice = { 
				{ 1, 2, 3 }, // riga = 0 matrice[0] (prima riga)
				{ 4, 5, 6 }, // riga = 1 matrice[1] (seconda riga)
				{ 7, 8, 9} };// riga = 2 matrice[2] (terza riga)
	 // colonna = 0  1  2 (indici delle colonne)
		
		// Inizia un ciclo 'for' esterno per scorrere ogni riga della matrice.
		// 'riga' rappresenta l'indice della riga corrente.
		for (int riga = 0; riga < matrice.length; riga++) {
			
			// Inizia un ciclo 'for' interno per scorrere ogni colonna della riga corrente (matrice[i]).
			// 'colonna' rappresenta l'indice della colonna corrente.
			for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
				// Stampa l'elemento che si trova all'incrocio della riga 'riga' e della colonna 'colonna', seguito da uno spazio.
				System.out.print(matrice[riga][colonna] + " ");
			}
			
			// Dopo aver stampato tutti gli elementi di una riga, va a capo per la riga successiva.
			System.out.println();
		}
	}
}
