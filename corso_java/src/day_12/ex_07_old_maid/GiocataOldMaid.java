/*
 * package day_12.ex_07_old_maid;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * public class GiocataOldMaid extends Giocatore {
 * 
 * public GiocataOldMaid(String player) { super(player); }
 * 
 * // Restituisce il seme “opposto” (mapping come nel 3 - seme del codice
 * Python) private static Carta.SEME semeOpposto(Carta.SEME s) { switch (s) {
 * case FIORI: return Carta.SEME.PICCHE; // 0 -> 3 case QUADRI: return
 * Carta.SEME.CUORI; // 1 -> 2 case CUORI: return Carta.SEME.QUADRI; // 2 -> 1
 * case PICCHE: return Carta.SEME.FIORI; // 3 -> 0 default: return s; } }
 * 
 *//**
	 * Rimuove le coppie (stesso rango, seme opposto) dalla mano. Ritorna il numero
	 * di coppie eliminate.
	 *//*
		 * public int rimuoveCoppie() { int conteggio = 0;
		 * 
		 * // Copia difensiva per evitare ConcurrentModificationException List<Carta>
		 * copia = new ArrayList<>(super.getCarte());
		 * 
		 * for (Carta carta : copia) { Carta.SEME opposto =
		 * semeOpposto(carta.getSeme()); Carta cartaDaCercare = new Carta(opposto,
		 * carta.getRango());
		 * 
		 * // Si verifica che entrambe le carte siano ancora in mano prima di rimuoverle
		 * if (super.getCarte().contains(carta) &&
		 * super.getCarte().contains(cartaDaCercare)) { super.getCarte().remove(carta);
		 * super.getCarte().remove(cartaDaCercare);
		 * 
		 * System.out.printf( "Giocata di %s: %s di %s elimina %s di %s%n",
		 * super.getNome(), carta.getRango(), carta.getSeme(),
		 * cartaDaCercare.getRango(), cartaDaCercare.getSeme() );
		 * 
		 * conteggio++; } }
		 * 
		 * return conteggio; } }
		 */

package day_12.ex_07_old_maid;

import java.util.ArrayList;
import java.util.List;

/**
 * Variante Old Maid: rimozione delle coppie (stesso rango, seme opposto).
 */
public class GiocataOldMaid extends Player {

    public GiocataOldMaid(String player) { super(player); }

    private static Carta.SEME semeOpposto(Carta.SEME s) {
        switch (s) {
            case FIORI:  return Carta.SEME.PICCHE; // 0 <-> 3
            case PICCHE: return Carta.SEME.FIORI;
            case QUADRI: return Carta.SEME.CUORI;  // 1 <-> 2
            case CUORI:  return Carta.SEME.QUADRI;
            default:     return s;
        }
    }

    /**
     * Rimuove le coppie (stesso rango, seme opposto) dalla mano.
     * @return numero di coppie eliminate.
     */
    public int rimuoveCoppie() {
        int conteggio = 0;

        List<Carta> copia = new ArrayList<>(getCarte()); // copia difensiva

        for (Carta carta : copia) {
            Carta.SEME opposto = semeOpposto(carta.getSeme());
            Carta cartaDaCercare = new Carta(opposto, carta.getRango());

            if (getCarte().contains(carta) && getCarte().contains(cartaDaCercare)) {
                getCarte().remove(carta);
                getCarte().remove(cartaDaCercare);

                System.out.printf(
                    "Giocata di %s: %s di %s elimina %s di %s%n",
                    getNome(),
                    carta.getRango(), carta.getSeme(),
                    cartaDaCercare.getRango(), cartaDaCercare.getSeme()
                );

                conteggio++;
            }
        }

        return conteggio;
    }
}
