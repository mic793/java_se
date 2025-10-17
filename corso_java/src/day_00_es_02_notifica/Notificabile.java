package day_00_es_02_notifica;

/*
 * ESERCIZIO 2: Sistema di notifica per una piattaforma
 * Progetta un sistema di notifiche flessibile per una piattaforma, in grado di inviare messaggi attraverso diversi canali.
 * Requisiti:
 * - Interfaccia Notificabile:
 * 		- Definisci un'interfaccia Notificabile con un metodo notifica(String messaggio).
 * - Sottoclassi Utente e Gruppo:
 * 		- Crea una classe Utente (con nome e indirizzo email) che implementa Notificabile e invia una notifica via email.
 * 		- Crea una classe Gruppo (con un nome e una lista di Utente) che implementa Notificabile. La sua implementazione di notifica() 
 * 		  deve iterare su tutti gli utenti del gruppo e inviare la notifica a ciascuno.
 * - Classe astratta Messaggio e sottoclassi:
 * 		- Crea una classe astratta Messaggio con campi per il contenuto (String content) e un metodo astratto invia(Notificabile destinatario).
 * 		- Crea due sottoclassi di Messaggio: MessaggioSemplice e MessaggioUrgente.
 * 		- MessaggioSemplice implementa invia() in modo standard.
 * 		- MessaggioUrgente implementa invia() aggiungendo una prefazione specifica al messaggio (es. "URGENTE: " + messaggio). 
 * 		  Questo sfrutta il polimorfismo per cambiare il comportamento.
 * - Programma principale:
 * 		- Crea un'istanza di Utente e un'istanza di Gruppo.
 * 		- Crea oggetti MessaggioSemplice e MessaggioUrgente.
 * 		- Usa il polimorfismo per inviare i diversi tipi di messaggi sia all'utente singolo che al gruppo. 
 */
public interface Notificabile {
	
	String notifica(String messaggio);
	
}
