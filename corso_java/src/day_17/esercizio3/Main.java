package day_17.esercizio3;

/**
 * Classe principale dell'applicazione (Entry Point).
 * Il suo scopo è quello di creare un'istanza dell'Archivio e popolarla con un set di dati di prova (brani, CD, artisti e generi) per
 * dimostrare e testare il funzionamento del sistema.
 */
public class Main {
    
    /**
     * Metodo principale 'main', che viene eseguito all'avvio del programma.
     */
    public static void main(String[] args) {
        // 1. Creazione dell'oggetto principale.
        // Viene creata una nuova istanza, vuota, della classe Archivio.
        // Questo oggetto fungerà da contenitore per tutti i dati musicali.
        Archivio archivio = new Archivio();

        // 2. Popolamento dell'archivio.
        // Vengono effettuate una serie di chiamate al metodo 'aggiungiBrano'.
        // Ogni chiamata fornisce i dati di un singolo brano. La logica interna
        // dell'archivio si occuperà di creare o recuperare gli oggetti Artista, Genere e Cd
        // corrispondenti, garantendo che non ci siano duplicati.

        // Ad esempio, alla prima chiamata, verranno creati l'artista "Ed Sheeran", il genere "Pop" e il CD "Divide".
        archivio.aggiungiBrano("Shape of You", "Divide", "Ed Sheeran", "Pop");
        // Alla seconda chiamata, il sistema riutilizzerà gli oggetti "Ed Sheeran", "Pop" e "Divide" già esistenti.
        archivio.aggiungiBrano("Castle on the Hill", "Divide", "Ed Sheeran", "Pop");

        archivio.aggiungiBrano("Blinding Lights", "After Hours", "The Weeknd", "R&B");
        archivio.aggiungiBrano("Save Your Tears", "After Hours", "The Weeknd", "R&B");

        archivio.aggiungiBrano("Billie Jean", "Thriller", "Michael Jackson", "Pop");
        // Nota come lo stesso CD ("Thriller") possa avere brani di generi diversi. 
        // L'archivio assegna il genere al CD la prima volta che lo incontra.
        archivio.aggiungiBrano("Beat It", "Thriller", "Michael Jackson", "Rock");

        archivio.aggiungiBrano("Smells Like Teen Spirit", "Nevermind", "Nirvana", "Rock");
        archivio.aggiungiBrano("Come As You Are", "Nevermind", "Nirvana", "Rock");

        archivio.aggiungiBrano("Rolling in the Deep", "21", "Adele", "Soul");
        archivio.aggiungiBrano("Someone Like You", "21", "Adele", "Soul");

        archivio.aggiungiBrano("Viva la Vida", "Viva la Vida or Death and All His Friends", "Coldplay", "Alternative Rock");
        archivio.aggiungiBrano("Lost!", "Viva la Vida or Death and All His Friends", "Coldplay", "Alternative Rock");

        archivio.aggiungiBrano("Bohemian Rhapsody", "A Night at the Opera", "Queen", "Rock");
        archivio.aggiungiBrano("Love of My Life", "A Night at the Opera", "Queen", "Rock");

        archivio.aggiungiBrano("Lose Yourself", "8 Mile (Soundtrack)", "Eminem", "Hip-Hop");
        archivio.aggiungiBrano("Without Me", "The Eminem Show", "Eminem", "Hip-Hop");

        archivio.aggiungiBrano("Numb", "Meteora", "Linkin Park", "Nu Metal");
        archivio.aggiungiBrano("Breaking the Habit", "Meteora", "Linkin Park", "Nu Metal");

        archivio.aggiungiBrano("Imagine", "Imagine", "John Lennon", "Pop/Rock");
        archivio.aggiungiBrano("Jealous Guy", "Imagine", "John Lennon", "Pop/Rock");

        // 3. Visualizzazione dei risultati.
        // Viene chiamato il metodo 'stampaArchivio()' per mostrare a video
        // l'intero contenuto dell'archivio, ora completamente popolato e strutturato.
        archivio.stampaArchivio();
    }
}