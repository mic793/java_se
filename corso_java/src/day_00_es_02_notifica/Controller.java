package day_00_es_02_notifica;

import java.util.List;

public class Controller {
	
	// utility semplici per gestire il gruppo
    public static boolean aggiungi(Gruppo aG, Utente aU) {
        if (aG == null || aU == null) return false;
        return aG.getUtenti().add(aU);
    }

    public static boolean rimuoviUtente(Gruppo aG, Utente u) {
        return aG.getUtenti().remove(u);
    }
    

}
