package day_07;

/*Istruzioni
 * Data una stringa che rappresenta una matrice di numeri, restituisci le righe e le colonne di tale matrice.
 * Quindi, data una stringa con nuove righe incorporate come:
 * 9 8 7
 * 5 3 2
 * 6 6 7
 * che rappresenta questa matrice:
 *     1  2  3
 *   |--------
 *1  | 9  8  7
 *2  | 5  3  2
 *3  | 6  6  7
 *
 * il tuo codice dovrebbe essere in grado di produrre:
 * Un elenco delle righe, leggendo ogni riga da sinistra a destra mentre ci si sposta dall'alto verso il basso attraverso le righe,
 * Un elenco delle colonne, leggendo ogni colonna dall'alto verso il basso, spostandosi da sinistra a destra.
 * Le righe per la nostra matrice di esempio:
 * 9, 8, 7
 * 5, 3, 2
 * 6, 6, 7
 * 
 * E le sue colonne:
 * 9, 5, 6
 * 8, 3, 6
 * 7, 2, 7
 */

import java.util.ArrayList;
import java.util.List;

// Dichiara una classe pubblica per rappresentare una matrice di numeri.
public class Matrix {

	// Campo privato e finale per memorizzare la matrice come un array bidimensionale di interi.
	private final int[][] matrix;

	// Costruttore della classe che accetta una stringa per inizializzare la matrice.
	public Matrix(String matrixString) {
		
		// Divide la stringa di input in righe separate usando il carattere di nuova riga come delimitatore.
		String[] rows = matrixString.split("\n");
		// Inizializza l'array primario della matrice con il numero di righe trovato.
		matrix = new int[rows.length][];
		
		// Inizia un ciclo 'for' per elaborare ogni riga della matrice.
		for (int i = 0; i < rows.length; i++) {
			
			// Divide la stringa della riga corrente in valori numerici usando lo spazio come delimitatore.
			String[] values = rows[i].split(" ");
			// Inizializza l'array secondario (la riga) con il numero di valori trovati.
			matrix[i] = new int[values.length];
			
			// Inizia un ciclo 'for' interno per convertire ogni valore da stringa a intero.
			for (int j = 0; j < values.length; j++) {
				
				// Converte la stringa in un intero e la memorizza nella posizione appropriata della matrice.
				matrix[i][j] = Integer.parseInt(values[j]);
			}
		}
	}

	// Metodo pubblico che restituisce le righe della matrice come una lista di liste di interi.
	public List<List<Integer>> getRows() {
		// Crea una nuova lista per contenere tutte le righe.
		List<List<Integer>> rows = new ArrayList<>();
		
		// Itera su ogni array di riga ('row') nella matrice.
		for (int[] row : matrix) {
			// Crea una nuova lista per la riga corrente.
			List<Integer> rowList = new ArrayList<>();
			// Itera su ogni valore intero ('value') nella riga corrente.
			
			for (int value : row) {
				// Aggiunge il valore alla lista della riga.
				rowList.add(value);
			}
			// Aggiunge la lista della riga completata alla lista principale delle righe.
			rows.add(rowList);
		}
		// Restituisce la lista di tutte le righe.
		return rows;
	}

	// Metodo pubblico che restituisce le colonne della matrice come una lista di liste di interi.
	public List<List<Integer>> getColumns() {
		// Crea una nuova lista per contenere tutte le colonne.
		List<List<Integer>> columns = new ArrayList<>();
		// Determina il numero di colonne basandosi sulla lunghezza della prima riga.
		int columnCount = matrix[0].length;

		// Cicla per ogni indice di colonna.
		for (int col = 0; col < columnCount; col++) {
			// Crea una nuova lista per la colonna corrente.
			List<Integer> column = new ArrayList<>();
			
			// Itera su ogni riga della matrice per estrarre l'elemento della colonna corrente.
			for (int[] row : matrix) {
				// Aggiunge l'elemento alla posizione [riga][colonna] alla lista della colonna.
				column.add(row[col]);
			}
			// Aggiunge la lista della colonna completata alla lista principale delle colonne.
			columns.add(column);
		}
		// Restituisce la lista di tutte le colonne.
		return columns;
	}

	// Metodo principale 'main', il punto di ingresso per testare la classe.
	public static void main(String[] args) {
		// Definisce una stringa che rappresenta una matrice 3x3.
		String matrixString = "9 8 7\n5 3 2\n6 6 7";

		// Crea una nuova istanza della classe Matrix usando la stringa.
		Matrix matrix = new Matrix(matrixString);

		// Stampa un'intestazione per le righe.
		System.out.println("Righe:");
		
		// Ottiene le righe e le stampa una per una.
		for (List<Integer> row : matrix.getRows()) {
			System.out.println(row);
		}

		// Stampa un'intestazione per le colonne.
		System.out.println("\nColonne:");
		// Ottiene le colonne e le stampa una per una.
		for (List<Integer> column : matrix.getColumns()) {
			System.out.println(column);
		}
	}
}