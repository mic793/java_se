package day_00_es_06_gestione_pagamento;

public class Controller {

	public static String pagamenti(MetodoPagamento[] metodi, double importo) {
		String str = "";
		for (MetodoPagamento m : metodi) {
			str = str + m.getClass().getName() + " : " + m.effettuaPagamento(importo);

		}
		return str;
	}

}
