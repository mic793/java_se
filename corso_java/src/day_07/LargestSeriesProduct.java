package day_07;

import java.util.Scanner;

/*
 * Introduzione Lavori per un'agenzia governativa che ha intercettato una serie
 * di segnali di comunicazione criptati da un gruppo di rapinatori di banche. I
 * segnali contengono una lunga sequenza di cifre. Il tuo team deve utilizzare
 * varie tecniche di elaborazione del segnale digitale per analizzare i segnali
 * e identificare eventuali schemi che potrebbero indicare la pianificazione di
 * una rapina. Istruzioni Il tuo compito è cercare degli schemi nella lunga
 * sequenza di cifre nel segnale criptato. La tecnica che utilizzerai qui è
 * quella del prodotto in serie più grande.
 * 
 * Definiamo innanzitutto alcuni termini. input: la sequenza di cifre che devi
 * analizzare serie: una sequenza di cifre adiacenti (quelle che sono una
 * accanto all'altra) contenuta nell'input span: quante cifre sono lunghe
 * ciascuna serie prodotto: ciò che si ottiene moltiplicando i numeri insieme
 * Facciamo un esempio con l'input "63915". Per formare una serie, prendi le
 * cifre adiacenti nell'input originale. Se si lavora con un intervallo di 3, ci
 * saranno tre possibili serie: "639" "391" "915"
 *
 * Quindi dobbiamo calcolare il prodotto di ciascuna serie: Il prodotto della
 * serie "639"è 162 ( 6 × 3 × 9 = 162) Il prodotto della serie "391"è 27 ( 3 × 9
 * × 1 = 27) Il prodotto della serie "915"è 45 ( 9 × 1 × 5 = 45)
 * 
 * 162 è più grande sia di 27 che di 45, quindi il prodotto in serie più grande
 * di "63915"è della serie "639". Quindi la risposta è 162 .
 * 
 */

/*
 * import java.util.Scanner;
 * 
 * 
 *//**
	 * Questa classe calcola il prodotto più grande di una serie di cifre
	 * consecutive di una data lunghezza (chiamata "span") all'interno di una
	 * stringa di numeri più grande.
	 *//*
		 * public class LargestSeriesProduct {
		 * 
		 * public static void main(String[] args) {
		 * 
		 * // Crea un oggetto Scanner per leggere l'input dall'utente tramite la
		 * console. Scanner inputStr = new Scanner(System.in);
		 * 
		 * // Richiede all'utente di inserire la stringa di numeri da analizzare.
		 * System.out.println("Inserisci la serie: "); // Legge l'intera riga di input
		 * come una stringa. String serie = inputStr.nextLine();
		 * 
		 * // Richiede all'utente di inserire la lunghezza della sottosequenza ("span").
		 * System.out.println("Inserisci lo span minore della serie intercettata"); //
		 * Legge il prossimo intero dall'input. int span = inputStr.nextInt();
		 * 
		 * // Esegue una validazione dell'input. // Controlla se lo span è un numero
		 * negativo, se la stringa è nulla // o se la lunghezza della stringa è
		 * inferiore a quella dello span. if (span < 0 || serie == null ||
		 * serie.length() < span) { // Se una delle condizioni è vera, l'input non è
		 * valido. // Lancia un'eccezione di tipo IllegalArgumentException con un
		 * messaggio di errore. // Questo interrompe immediatamente l'esecuzione del
		 * programma. throw new
		 * IllegalArgumentException("Input non valido o intervallo troppo lungo."); }
		 * 
		 * 
		 * Inizializza la variabile `maxProduct` al valore minimo possibile per un
		 * intero. Questo garantisce che qualsiasi prodotto calcolato (anche se
		 * negativo, nel caso di estensioni future) sarà maggiore di questo valore
		 * iniziale. Per questo specifico problema, inizializzare a 0 andrebbe bene lo
		 * stesso, dato che i prodotti non possono essere negativi.
		 * 
		 * long maxProduct = 0; // Utilizziamo long per evitare overflow con prodotti
		 * molto grandi.
		 * 
		 * 
		 * Questo ciclo `for` scorre la stringa `serie`. La condizione `i
		 * <=serie.length() - span` assicura che il ciclo si fermi all'ultimo indice
		 * possibile da cui si può estrarre una sottostringa completa di lunghezza
		 * `span`. Esempio: serie="63915", span=3. serie.length()=5. Il ciclo andrà da
		 * i=0 a i <= 5-3, quindi i=0, 1, 2. i=0 -> sottostringa "639" i=1 ->
		 * sottostringa "391" i=2 -> sottostringa "915"
		 * 
		 * for (int i = 0; i <= serie.length() - span; i++) {
		 * 
		 * // Inizializza il prodotto per la sottostringa corrente a 1. // 1 è
		 * l'elemento neutro della moltiplicazione, quindi non altera il risultato. long
		 * product = 1;
		 * 
		 * 
		 * Estrae la sottostringa di lunghezza `span` che inizia all'indice `i`. Esempio
		 * (primo ciclo, i=0, span=3): `serie.substring(0, 0 + 3)` estrae i caratteri
		 * dall'indice 0 fino al 2 (l'indice finale è escluso). `miniSerie` sarà "639".
		 * 
		 * String miniSerie = serie.substring(i, i + span);
		 * 
		 * // Dichiara una variabile `c` per memorizzare temporaneamente ogni carattere.
		 * char c = ' ';
		 * 
		 * // Ciclo interno: scorre ogni carattere della `miniSerie` appena estratta.
		 * for (int j = 0; j < miniSerie.length(); j++) {
		 * 
		 * // Estrae il carattere alla posizione `j` della `miniSerie`. c =
		 * miniSerie.charAt(j);
		 * 
		 * // Controlla se il carattere corrente non è una cifra (da '0' a '9'). if
		 * (!Character.isDigit(c)) { // Se non è una cifra, lancia un'eccezione per
		 * input non valido. throw new
		 * IllegalArgumentException("Input contiene caratteri non numerici"); }
		 * 
		 * 
		 * Converte il carattere numerico nel suo valore intero corrispondente. La
		 * sottrazione `c - '0'` sfrutta la codifica ASCII (o Unicode), dove i caratteri
		 * per le cifre '0' attraverso '9' sono consecutivi. Esempio: '6' - '0' -> 54 -
		 * 48 = 6. Il risultato viene poi moltiplicato per il prodotto corrente.
		 * 
		 * product = product * (c - '0'); } // Fine del ciclo interno (sulla
		 * `miniSerie`)
		 * 
		 * // Confronta il prodotto della sottostringa corrente con il massimo prodotto
		 * // trovato finora. if (maxProduct < product) { // Se il prodotto corrente è
		 * maggiore, aggiorna `maxProduct`. maxProduct = product; } } // Fine del ciclo
		 * esterno (sulla `serie` principale)
		 * 
		 * // Stampa il risultato finale, mostrando la serie originale, lo span e il //
		 * prodotto massimo calcolato.
		 * System.out.println("Il prodotto più grande per la sequenza \"" + serie +
		 * "\" con intervallo (span) " + span + " è: " + maxProduct);
		 * 
		 * inputStr.close(); }
		 * 
		 * }
		 */

//ESERCIZIO 2 - DAY 07

public class LargestSeriesProduct{
	
	public static void main(String[] args) {
		Scanner inputStr = new Scanner(System.in);
		System.out.println("Inserisci la serie: ");
		
		String serie = inputStr.nextLine();
		
		System.out.println("Inserisci lo span minore della serie intercettata: ");
		
		int span = inputStr.nextInt();
		
		if(span < 0 || serie == null || serie.length() < span) {
			
			throw new IllegalArgumentException("Input non valido o intervallo troppo lungo.");
		}
		
		long maxProduct = 0;
		
			for(int i = 0; i <= serie.length() -  span; i++) {
				
				long product = 1;
				String miniSerie = serie.substring(i, i + span);
			}
		
		
		
	}
}