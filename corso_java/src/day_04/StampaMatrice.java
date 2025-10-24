package day_04;

/*
 * Scrivi un programma java per stampare gli elementi di una matrice.
 * */

public class StampaMatrice { // 1, 2, 3

	public static void main(String[] args) {
		// Dichiara e inizializza una matrice (array bidimensionale) 3x3 di interi.
        int[][] matrice = { { 1, 2, 3 }, 
        					{ 4, 5, 6 }, 
        					{ 7, 8, 9} };		
        // Chiama il metodo 'stampaMatrice', passandogli la matrice appena creata.
        stampaMatrice(matrice);
        }
                                                       //      0   1    2 
	public static void stampaMatrice(int[][] matrice) {// 0 { {1,  2,  3},
													   // 1   {4,  5,  6},
													   // 2   {7,  8,  9} }
	
		// Inizia un ciclo 'for' esterno per scorrere ogni riga della matrice.
		for(int riga = 0; riga < matrice.length; riga++) {
			
			// Inizia un ciclo 'for' interno per scorrere ogni colonna della riga corrente.
			for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
				
			  // Stampa l'elemento alla posizione [riga][colonna] seguito da uno spazio.
				System.out.print(matrice[riga][colonna] + " ");
	
			}
			// Dopo aver stampato tutti gli elementi di una riga, va a capo per la riga successiva.
			System.out.print("\n");
		}
	}

}

//PER STAMPARE SOLO LE COLONNE INVERTIRE L'ORDINE NEL FOR INTERNO CHE DIVENTA
/*
for (int colonna = 0; colonna < matrice[0].length; colonna++) {
	
	  // Stampa l'elemento alla posizione [riga][colonna] seguito da uno spazio.
		System.out.print(matrice[colonna][0] + " ");

	}
*/



//*******************************************************************************************************
//ESERCIZIO 12
//Scrivi un programma java per stampare gli elementi di una matrice.
/*
public class StampaMatrice{
	public static void main(String[] args) {
		int[][] matrice = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		stampaMatrice(matrice);
			
	}
	
	public static void stampaMatrice(int[][] matrice) {
		
		for(int riga = 0; riga < matrice.length; riga++) {
			for(int colonna = 0; colonna < matrice.length; colonna++) {
				System.out.println(matrice[riga][colonna] + " ");
			}
			System.out.println("\n");
		}
	}
}

*/

