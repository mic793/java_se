package day_00_es_08_votazione_concorso;

import java.util.List;

public class Controller {

	public static String iscriviPartecipante(Concorso aC, Partecipante aP) {
		aC.getPartecipanti().add(aP);
		return aP.getNome() + "partecipante aggiunto";
	}

	public static String aggiungiVoto(Partecipante aP, int aVoto) {
		double nuovo = aP.getPunteggioTotale() + aVoto;
		aP.setPunteggioTotale(nuovo);
		return "Assegnato voto " + aVoto + " a " + aP.getNome() + ". Nuovo punteggio " + nuovo;
	}

	// vota(String nomePartecipante, int voto): cerca il partecipante per nome e, se
	// lo trova,
	// aggiunge il voto chiamando il metodo aggiungiVoto del partecipante.
	public static String vota(Concorso aC, Partecipante aP, int aVoto) {
		for (Partecipante p : aC.getPartecipanti()) {
			p.getNome().equalsIgnoreCase(aP.getNome());
			return aggiungiVoto(aP, aVoto);
		}

		return aP.getNome() + " partecipante non trovato.";

	}

	// stampa a console la lista dei partecipanti e i loro punteggi. Non è
	// necessario ordinarla.
	public static String mostraClassifica(Concorso aCo) {
		return "Classifica dei partecipanti " + aCo.getPartecipanti().toString();
	}

}
