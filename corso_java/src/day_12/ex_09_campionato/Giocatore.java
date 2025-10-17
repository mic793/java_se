package day_12.ex_09_campionato;

//Importa la classe LocalDate dal package java.time, necessaria per gestire le date.
import java.time.LocalDate;

/**
* Rappresenta un singolo giocatore.
* Questa classe è un "POJO" (Plain Old Java Object) che contiene i dati
* anagrafici e tecnici di un giocatore.
*/
public class Giocatore {
 
 // Campo privato per memorizzare il nome del giocatore.
 private String nome;
 // Campo privato per memorizzare il cognome del giocatore.
 private String cognome;
 // Campo privato per memorizzare la data di nascita del giocatore.
 private LocalDate nascita;
 // Campo privato per memorizzare il ruolo del giocatore, utilizzando il tipo enum Ruolo.
 private Ruolo ruolo;
 
 /**
  * Costruttore di default (senza argomenti).
  * Permette di creare un'istanza vuota di Giocatore, che potrà essere
  * popolata in seguito tramite i metodi setter.
  */
 public Giocatore() {
     // Chiama il costruttore della classe genitore (Object).
     // Questa chiamata è implicita e potrebbe essere omessa.
     super();
 }

 /**
  * Costruttore parametrico.
  * Permette di creare un oggetto Giocatore fornendo subito tutti i suoi dati.
  * @param aNome Il nome del giocatore.
  * @param aCognome Il cognome del giocatore.
  * @param aNascita La data di nascita del giocatore (come oggetto LocalDate).
  * @param aRuolo Il ruolo del giocatore (un valore dell'enum Ruolo).
  */
 public Giocatore(String aNome, String aCognome, LocalDate aNascita, Ruolo aRuolo) {
     // Chiama il costruttore della classe genitore.
     super();
     // Inizializza gli attributi (campi) della classe con i valori passati come parametri.
     // 'this' serve a distinguere il campo della classe dal parametro del metodo.
     this.nome = aNome;
     this.cognome = aCognome;
     this.nascita = aNascita;
     this.ruolo = aRuolo;    
 }

 // --- Sezione dei metodi Getter e Setter ---
 // Forniscono un accesso pubblico e controllato ai campi privati della classe,
 // rispettando il principio dell'incapsulamento.

 /**
  * Restituisce il nome del giocatore.
  * @return il nome.
  */
 public String getNome() {
     return this.nome;
 }

 /**
  * Imposta o modifica il nome del giocatore.
  * @param nome il nuovo nome da impostare.
  */
 public void setNome(String nome) {
     this.nome = nome;
 }

 /**
  * Restituisce il cognome del giocatore.
  * @return il cognome.
  */
 public String getCognome() {
     return cognome;
 }

 /**
  * Imposta o modifica il cognome del giocatore.
  * @param cognome il nuovo cognome da impostare.
  */
 public void setcognome(String cognome) {
     this.cognome = cognome;
 }

 /**
  * Restituisce la data di nascita del giocatore.
  * @return la data di nascita come oggetto LocalDate.
  */
 public LocalDate getNascita() {
     return nascita;
 }

 /**
  * Imposta o modifica la data di nascita del giocatore.
  * @param nascita la nuova data di nascita da impostare.
  *        (come oggetto LocalDate).
  */
 public void setNascita(LocalDate nascita) {
     this.nascita = nascita;
 }

 /**
  * Restituisce il ruolo del giocatore.
  * @return il ruolo come valore dell'enum Ruolo.
  */
 public Ruolo getRuolo() {
     return ruolo;    
 }

 /**
  * Imposta o modifica il ruolo del giocatore.
  * @param ruolo il nuovo ruolo da impostare.
  */
 public void setRuolo(Ruolo ruolo) {
     this.ruolo = ruolo;
 }

 /**
  * Override del metodo toString() della classe Object.
  * Fornisce una rappresentazione testuale personalizzata e leggibile dell'oggetto Giocatore,
  * utile per operazioni di stampa e debug.
  * @return una stringa formattata con tutti i dettagli del giocatore.
  */
 @Override
 public String toString() {
     return "Giocatore [nome=" + this.nome + ", cognome=" + this.cognome + ", nascita=" + this.nascita + ", ruolo=" + this.ruolo + "]";
 }
}