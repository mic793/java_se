package day_06;

/*
 * Il kata di diamante prende come input una lettera e la emette a forma di diamante. Data una lettera, stampa un diamante che inizia con 'A', con la lettera fornita nel punto più largo.
 * Requisiti:
 * La prima riga contiene una 'A'.
 * L'ultima riga contiene una 'A'.
 * Tutte le righe, tranne la prima e l'ultima, hanno esattamente due lettere identiche.
 * Tutte le file hanno tanti spazi finali quanti spazi principali. (Questo potrebbe essere 0).
 * Il diamante è simmetrico orizzontalmente.
 * Il diamante è simmetrico verticalmente.
 * Il diamante ha forma quadrata (larghezza uguale altezza).
 * Le lettere creano una forma a diamante.
 * La metà superiore ha le lettere in ordine crescente.
 * La metà inferiore ha le lettere in ordine decrescente.
 * I quattro angoli ( contenenti gli spazi) sono triangoli
 */

/*public class Diamante {

    // Metodo principale 'main', il punto di ingresso del programma.
    public static void main(String[] args) {

        // Imposta la lettera che rappresenterà il punto più largo del diamante.
        char letter = 'E';
        
        // Calcola quante lettere verranno usate per metà diamante (es. A, B, C, D, E -> 5).
        int numeroLettereDaStampare = letter - 'A' + 1;
        //ASCII E=69, ASCII A=65 -->    69   -  65 + 1 = 5

        // Ciclo per stampare la parte superiore e centrale del diamante (da A fino alla lettera E).
        for (int i = 0; i < numeroLettereDaStampare; i++) {
            // Chiama il metodo di supporto per disegnare la riga corrente.
            printDiamondRow(i, numeroLettereDaStampare);
        }

        // Ciclo per stampare la parte inferiore del diamante (dalla D fino alla A).
        for (int i = numeroLettereDaStampare - 2; i >= 0; i--) {
            // Chiama di nuovo il metodo di supporto per disegnare la riga corrente.
            printDiamondRow(i, numeroLettereDaStampare);
        }
    }

    // Metodo privato che si occupa di stampare una singola riga del diamante.
    private static void printDiamondRow(int row, int numeroLettereDaStampare) {
        // Calcola la lettera da stampare per la riga corrente (A per la riga 0, B per la riga 1, ecc.).
        char letter = (char) ('A' + row);
        // Calcola il numero di spazi necessari prima della prima lettera per centrare la figura.
        int spaceBefore = numeroLettereDaStampare - row - 1;

        // Stampa gli spazi iniziali per l'indentazione della riga.
        for (int i = 0; i < spaceBefore; i++) {
            System.out.print(" ");
        }
        // Stampa la prima lettera della riga.
        System.out.print(letter);

        // Se non è la prima riga (la riga della 'A'), c'è una seconda lettera da stampare.
        if (row > 0) {
            // Calcola il numero di spazi tra le due lettere.
            int spaceMiddle = 2 * row - 1;

            // Stampa gli spazi centrali.
            for (int i = 0; i < spaceMiddle; i++) {
                System.out.print(" ");
            }
            // Stampa la seconda lettera (speculare).
            System.out.print(letter);
        }
        // Va a capo per terminare la riga e prepararsi per la successiva.
        System.out.println("");
    }
}
*/

/*

i=row | sb=spaceBefor
0     |_sb_A
1     |___B_B
2     |__C___C
3     |_D_____D
4     |E__sm___E  sm=spaceMiddle
3     |_D_____D
2     |__C___C
1     |___B_B
0     |____A

*/

//ESERCIZIO 2
public class Diamante {

	public static void printDiamondRow(int row, int numeroLettereDaStampare) {
		char lettera = (char) ('A' + row);

		int spaceBefore = numeroLettereDaStampare - row - 1;

		for (int i = 0; i < spaceBefore; i++) {
			System.out.print(" ");

		}
		System.out.print(lettera);

		if (row > 0) {

			int spaceMiddle = 2 * row - 1;

			for (int i = 0; i < spaceMiddle; i++) {
				System.out.print(" ");
			}
			System.out.print(lettera);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int numeroLettereDaStampare = 'E' - 'A' + 1;// il cast viene effettuato implicitamente dal compilatore

		// prima della scrittura del for farlo funzionare a mano chiamando il
		// printDiamondRow piu' volte
		// printDiamondRow(0, 5);
		// printDiamondRow(1, 5);
		for (int i = 0; i < numeroLettereDaStampare; i++) {
			printDiamondRow(i, numeroLettereDaStampare);
		}

		for (int i = numeroLettereDaStampare - 2; i >= 0; i--) {
			printDiamondRow(i, numeroLettereDaStampare);

		}

	}

}
