package day_00_es_03_figure_geometriche;

/*
 * Esercizio 3: Gestore di figure geometriche
 * Realizza un'applicazione che gestisce diverse forme geometriche e ne calcola l'area e il perimetro.
 * Requisiti:
 * Interfaccia FiguraGeometrica:
 * Crea un'interfaccia FiguraGeometrica con due metodi: calcolaArea() e calcolaPerimetro().
 * Classi concrete:
 * Crea una classe Rettangolo (con lunghezza e larghezza).
 * Crea una classe Cerchio (con raggio).
 * Crea una classe Triangolo (con base, altezza e i lati per il perimetro).
 * Fai in modo che tutte e tre le classi implementino l'interfaccia FiguraGeometrica, fornendo la propria implementazione per i metodi di calcolo.
 * Classe GestoreFigure:
 * Crea una classe GestoreFigure che contiene un ArrayList di oggetti FiguraGeometrica.
 * Aggiungi un metodo aggiungiFigura(FiguraGeometrica f) per aggiungere una figura alla lista.
 * Aggiungi un metodo stampaReport() che itera sulla lista e, per ogni figura, stampa l'area e il perimetro, dimostrando il polimorfismo.
 * Aggiungi un metodo sommaAree() che calcola e restituisce la somma delle aree di tutte le figure nella lista.
 * Programma principale:
 * Nel main, crea istanze di Rettangolo, Cerchio e Triangolo.
 * Aggiungile a un'istanza di GestoreFigure.
 * Chiama i metodi del GestoreFigure per stampare i report e la somma delle aree. 
 */

public interface FiguraGeometrica {
	double calcolaArea();
	double calcolaPerimetro();
}
