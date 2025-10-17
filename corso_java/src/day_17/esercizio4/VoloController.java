package day_17.esercizio4;

public class VoloController {

    public static void aggiungiCliente(Volo aVolo, Cliente aCliente) {
        // prova a inserire nei posti
        for (int i = 0; i < aVolo.getPosti().length; i++) {
            if (aVolo.getPosti()[i] == null) { // libero
                aVolo.getPosti()[i] = aCliente;
                return;
            }
        }
        // se non c’è spazio, accoda in attesa
        aVolo.getAttesa().addLast(aCliente);
    }

    public static void disdiciPrenotazione(Volo aVolo, Cliente aCliente) {
        // libera il posto se presente
        boolean disdetto = false;
        for (int i = 0; i < aVolo.getPosti().length; i++) {
            Cliente occupante = aVolo.getPosti()[i];
            if (occupante != null && occupante.equals(aCliente)) {
                aVolo.getPosti()[i] = null;
                disdetto = true;

                // se c’è qualcuno in attesa, lo si fa salire e lo si rimuove dalla coda
                if (!aVolo.getAttesa().isEmpty()) {
                    aVolo.getPosti()[i] = aVolo.getAttesa().removeFirst();
                }
                break;
            }
        }

        // opzionale: se non era nei posti, si può decidere di rimuoverlo dalla coda
        // aVolo.getAttesa().remove(aCliente);
    }
}
