package day_03;

/*
 * Write a program that displays your name inside a rectangle on the terminal screen, as in the following example:
 * + —---+ 
 * |Paolo|
 * + - -—+ 

 */
/*public class MyName {

    public static void main(String[] args) {
    	// Definisce il nome da visualizzare
    	String nome = "Paola";

    	// Calcola la lunghezza del nome in caratteri
    	int lunghezzaNome = nome.length();

    	// Crea la linea orizzontale superiore/inferiore della cornice
    	String lineaOrizzontale = "+ " + "-".repeat(lunghezzaNome) + " +";

    	// Crea la riga vuota con spazi interni alla cornice
    	String spaziVuoti = "| " + " ".repeat(lunghezzaNome) + " |";

    	// Stampa la linea orizzontale superiore
    	System.out.println(lineaOrizzontale);
    	// Stampa la riga vuota sopra il nome
    	System.out.println(spaziVuoti);
    	// Stampa il nome centrato nella cornice
    	System.out.println("| " + nome + " |");
    	// Stampa la riga vuota sotto il nome
    	System.out.println(spaziVuoti);
    	// Stampa la linea orizzontale inferiore
    	System.out.println(lineaOrizzontale);
    }
}
*/


//ESERCIZIO 5
//Scrivere un programma che visualizzi sullo schermo del terminale il vostro nome all’interno di un rettangolo, come nell’esempio seguente:
//+ ------+ 
//| Paolo |
//+ - - --+ 
public class MyName {
	public static void main(String[] args) {

		String nome = "Paolo Rossi";

		int lunghezzaNome = nome.length();

		String lineaOrizzontale = "+ " + "-".repeat(lunghezzaNome) + " +";

		String spaziVuoti = "| " + " ".repeat(lunghezzaNome) + " |";

		System.out.println(lineaOrizzontale);
		System.out.println(spaziVuoti);
		System.out.println("| " + nome + " |");
		System.out.println(spaziVuoti);
		System.out.println(lineaOrizzontale);

	}

}
