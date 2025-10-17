package day_00_es_05_operazione;

/*ESERCIZIO 5
 * Definisci una interfaccia 'operazione' e le sue classi derivate (sub. div, mul) in modo
 * che da ciascuna sia possibile eseguire la corrispondente operazione aritmetica (di
 * addizione, divisione, moltiplicazione) istanziando un oggetto di classe 'operazione' e
 * due operandi. Realizzare anche, una classe astratta che implementi le funzionalitå
 * comuni come la stampa a video del risultato.
 */

public interface Operazione {
	double operazione();
}
