package day_00_es_06_gestione_pagamento;

/*
 * Esercizio 6: Gestione di un sistema di pagamento
 * Sviluppare un semplice sistema che gestisca diversi metodi di pagamento. 
 * Ogni metodo di pagamento ha una funzionalità per effettuare una transazione.
 * Requisiti OOP
 * Interfaccia: definire un'interfaccia MetodoDiPagamento con un metodo effettuaPagamento(double importo).
 * Polimorfismo: implementare l'interfaccia in diverse classi concrete, ad esempio CartaDiCredito, PayPal e BonificoBancario. 
 * Ciascuna classe avrà un'implementazione diversa del metodo effettuaPagamento().
 * Utilizzo: nel metodo main, creare un array di tipo MetodoDiPagamento. 
 * Inserire un'istanza di ogni classe e iterare sull'array per simulare il pagamento di un importo su ciascun metodo, sfruttando il polimorfismo.
 */

public interface MetodoPagamento {
	
	double effettuaPagamento(double importo);
}
