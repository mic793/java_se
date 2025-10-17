package day_00_es_04_elettrodomestici;

/*
 * Esercizio 4: Sistema di gestione degli elettrodomestici
 * Sviluppare un sistema per controllare vari elettrodomestici. Esistono diversi tipi di elettrodomestici, come la lavatrice, 
 * il frigorifero e la televisione. Ogni elettrodomestico deve poter essere acceso e spento. 
 * Le lavatrici hanno anche cicli di lavaggio, i frigoriferi regolano la temperatura, e le televisioni cambiano canale.
 * Requisiti OOP
 * Interfaccia Accendibile: definire un'interfaccia con i metodi accendi() e spegni().
 * Ereditarietà: creare una classe base Elettrodomestico che implementa Accendibile e che contiene un attributo booleano acceso. 
 * Le classi Lavatrice, Frigorifero e Televisione ereditano da Elettrodomestico e aggiungono le loro funzionalità specifiche.
 * Polimorfismo: creare una lista di tipo Elettrodomestico (o Accendibile). 
 * In un metodo main, aggiungere istanze dei vari elettrodomestici. 
 * Usare il polimorfismo per accendere e spegnere tutti gli elettrodomestici nella lista 
 * e per chiamare le funzionalità specifiche di ogni elettrodomestico 
 * dopo un opportuno controllo del tipo (es. if (elettrodomestico instanceof Lavatrice)).
 */

public interface Accendibile {
	
	String accendi();
	String spegni();

}
