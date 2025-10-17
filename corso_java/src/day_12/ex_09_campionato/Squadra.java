package day_12.ex_09_campionato;

//Importa le interfacce e le classi necessarie dal package java.util.
import java.util.Set;
import java.util.HashSet;
import java.util.Objects; 

/**
* Rappresenta una squadra di calcio.
* Questa classe implementa l'interfaccia Comparable per definire un "ordinamento naturale"
* basato sul nome della squadra. Sovrascrive anche equals() e hashCode() per garantire
* un comportamento corretto nelle collezioni basate su hash (come HashSet) e per la logica di uguaglianza.
*/
public class Squadra implements Comparable<Squadra> {

 // Campi privati (attributi) della classe.
 private String nome;
 private String coloriSociali;
 private String allenatore;
 private Stadio stadio;    
 
 // Campo privato per la rosa dei giocatori.
 // Viene utilizzato un HashSet per non avere valori duplicati nella struttura dati.
 // Per funzionare correttamente, la classe Giocatore deve implementare i metodi equals() e hashCode().
 private Set<Giocatore> giocatori = new HashSet<>();
 
 /**
  * Costruttore di default (senza argomenti).
  * Permette di creare un'istanza di Squadra vuota.
  */
 public Squadra() {
     super();
 }
 
 /**
  * Costruttore parametrico.
  * Crea un oggetto Squadra inizializzando i suoi campi principali.
  * @param aNome Il nome della squadra.
  * @param aColoriSociali I colori sociali.
  * @param aAllenatore Il nome dell'allenatore.
  * @param aStadio Lo stadio della squadra.
  */
 public Squadra(String aNome, String aColoriSociali, String aAllenatore, Stadio aStadio) {
     super();
     this.nome = aNome;
     this.coloriSociali = aColoriSociali;
     this.allenatore = aAllenatore;
     this.stadio = aStadio;
 }
 
 // --- Sezione dei metodi Getter e Setter ---
 // Forniscono un accesso controllato ai campi privati.

 public String getNome() {
     return nome;
 }
 
 public void setNome(String nome) {
     this.nome = nome;    
 }
 
 public String getColoriSociali() {
     return coloriSociali;
 }
 
 public void setColoriSociali(String coloriSociali) {
     this.coloriSociali = coloriSociali;    
 }
 
 public String getAllenatore() {
     return allenatore;
 }
 
 public void setAllenatore(String allenatore) {
     this.allenatore = allenatore;    
 }
 
 public Stadio getStadio() {
     return stadio;
 }
 
 public void setStadio(Stadio stadio) {
     this.stadio = stadio;
 }
 
 public Set<Giocatore> getGiocatori() {
     return this.giocatori;
 }
     
 /**
  * Override del metodo hashCode() della classe Object.
  * Calcola un codice hash per l'oggetto, basato unicamente sul nome della squadra.
  * È essenziale per il corretto funzionamento delle collezioni basate su hash come HashSet e HashMap.
  * Deve essere consistente con il metodo equals().
  * @return un intero che rappresenta il codice hash.
  */
 @Override
 public int hashCode() {
     // Usa il codice hash del nome. Se il nome è null, restituisce 0 per evitare NullPointerException.
     // Un'alternativa più moderna sarebbe: return Objects.hash(nome);
     return nome == null ? 0 : nome.hashCode();
 }
 
 /**
  * Override del metodo equals() della classe Object.
  * Definisce la logica di uguaglianza: due oggetti Squadra sono considerati uguali
  * se e solo se hanno lo stesso nome.
  * @param obj L'oggetto da confrontare con l'istanza corrente.
  * @return true se gli oggetti sono uguali, false altrimenti.
  */
 @Override
 public boolean equals(Object obj) {
     // 1. Controllo di identità: se i riferimenti puntano allo stesso oggetto, sono uguali.
     if (this == obj) {
         return true;
     }
     // 2. Controllo del tipo: se l'altro oggetto non è un'istanza di Squadra, non possono essere uguali.
     if (!(obj instanceof Squadra)) {
         return false;
     }
     // 3. Cast dell'oggetto e confronto dei campi significativi.
     Squadra other = (Squadra) obj;
     // Usa Objects.equals per confrontare i nomi in modo sicuro (gestisce correttamente i valori null).
     return Objects.equals(this.nome, other.nome);
 }
 
 /**
  * Implementazione del metodo compareTo() dall'interfaccia Comparable.
  * Definisce l' "ordinamento naturale" degli oggetti Squadra, basandolo sull'ordine alfabetico del nome.
  * Questo permette di ordinare le squadre in collezioni come TreeSet o tramite Collections.sort().
  * @param other L'altra squadra con cui confrontare l'istanza corrente.
  * @return un intero negativo, zero o positivo se questa squadra viene prima, è uguale o viene dopo l'altra.
  */
 @Override
 public int compareTo(Squadra other) {
     // Gestione dei casi in cui l'altro oggetto o i nomi sono null per evitare eccezioni.
     if (other == null) return 1; // Un oggetto non nullo è "maggiore" di uno nullo.
     if (this.nome == null && other.nome == null) return 0; // Due null sono uguali.
     if (this.nome == null) return -1; // Un nome nullo viene "prima" di uno non nullo.
     if (other.nome == null) return 1; // Un nome non nullo viene "dopo" uno nullo.
     
     // Delega il confronto al metodo compareTo() della classe String, che esegue un confronto alfabetico.
     // Questo è coerente con equals/hashCode che si basano solo sul campo 'nome'.
     return this.nome.compareTo(other.nome);
 }

 /**
  * Override del metodo toString() per fornire una rappresentazione testuale dell'oggetto Squadra.
  * @return una stringa formattata con tutti i dettagli della squadra.
  */
 @Override
 public String toString() {
		return "Squadra [nome=" + nome + ", coloriSociali=" + coloriSociali + ", allenatore=" + allenatore +
				", stadio=" + stadio + ", giocatori=" + giocatori + "]";
	}
}