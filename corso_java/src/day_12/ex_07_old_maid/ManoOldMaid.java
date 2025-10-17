/*
 * package day_12.ex_07_old_maid;
 * 
 * import java.util.ArrayList; import java.util.Arrays; import java.util.List;
 * 
 *//**
	 * Versione "tutto in uno" che replica lo script Python: - definisce Carta,
	 * Mazzo, Giocatore, GiocataOldMaid, Gioco, ManoOldMaid - rimuove la Regina di
	 * Fiori - distribuisce 51 carte - rimuove le coppie, gioca turni finché si
	 * raggiungono 25 coppie - stampa gli stati intermedi
	 *//*
		 * public class ManoOldMaid extends Gioco {
		 * 
		 * private final List<GiocataOldMaid> mani = new ArrayList<>();
		 * 
		 * void partita(List<String> nomi) { // rimozione della Regina di Fiori (così la
		 * Regina di Picche resta spaiata) mazzo.rimuoviCarta(new
		 * Carta(Carta.SEME.FIORI, Carta.RANGO.REGINA));
		 * 
		 * // creazione di una mano per ogni giocatore mani.clear(); for (String nome :
		 * nomi) mani.add(new GiocataOldMaid(nome));
		 * 
		 * // distribuzione 51 carte mazzo.mescola(); mazzo.distribuisci(mani, 51);
		 * System.out.println("---------- Le carte sono state distribuite");
		 * stampaMani();
		 * 
		 * // rimozione delle coppie iniziali int numCoppie = rimuoveTutteLeCoppie();
		 * System.out.println("---------- Coppie scartate, inizia la partita");
		 * stampaMani();
		 * 
		 * // gioca finché non si raggiungono 25 coppie int turno = 0; int numMani =
		 * mani.size(); while (numCoppie < 25) { numCoppie += giocaUnTurno(turno); turno
		 * = (turno + 1) % numMani; }
		 * 
		 * System.out.println("---------- La partita è finita"); stampaMani(); }
		 * 
		 * private int rimuoveTutteLeCoppie() { int conteggio = 0; for (GiocataOldMaid
		 * mano : mani) conteggio += mano.rimuoveCoppie(); return conteggio; }
		 * 
		 * private void stampaMani() { for (GiocataOldMaid g : mani) {
		 * System.out.println("Giocatore: " + g.getNome());
		 * System.out.println("Carte in mano:"); System.out.println(g);
		 * System.out.println(); } }
		 * 
		 * private int giocaUnTurno(int giocatore) { GiocataOldMaid corrente =
		 * mani.get(giocatore); if (corrente.isEmpty()) return 0;
		 * 
		 * int vicino = trovaVicino(giocatore); GiocataOldMaid avversario =
		 * mani.get(vicino);
		 * 
		 * // prende la prima carta dalla mano del vicino Carta cartaScelta =
		 * avversario.primaCarta(); corrente.aggiungeCarta(cartaScelta);
		 * System.out.println("Mano di " + corrente.getNome() + ": scelta " +
		 * cartaScelta);
		 * 
		 * int coppieFatte = corrente.rimuoveCoppie(); corrente.mescola(); return
		 * coppieFatte; }
		 * 
		 * private int trovaVicino(int giocatore) { int n = mani.size(); for (int step =
		 * 1; step < n; step++) { int vicino = (giocatore + step) % n; if
		 * (!mani.get(vicino).isEmpty()) return vicino; } return giocatore; // caso
		 * limite } }
		 * 
		 * ========================== MAIN – esecuzione ==========================
		 * public static void main(String[] args) { // replica dello script ManoOldMaid
		 * mano = new ManoOldMaid(); mano.partita(Arrays.asList( "Richard Marcus",
		 * "Joseph Murphy", "Edward Thorp", "Joseph Jagger" )); } }
		 * 
		 * 
		 * public class ManoOldMaid extends Gioco { private final List<GiocataOldMaid>
		 * mani = new ArrayList<>();
		 * 
		 * public void partita(List<String> nomi) { // rimozione della Regina di Fiori
		 * per lasciare la Regina di Picche spaiata getCartemazzo.rimuoviCarta(new
		 * Carta(Carta.SEME.FIORI, Carta.RANGO.REGINA));
		 * 
		 * // crea una mano per ogni giocatore mani.clear(); for (String nome : nomi)
		 * mani.add(new GiocataOldMaid(nome));
		 * 
		 * // distribuisce 51 carte mazzo.mescola(); mazzo.distribuisci(mani, 51);
		 * System.out.println("---------- Le carte sono state distribuite");
		 * stampaMani();
		 * 
		 * // rimuove le coppie iniziali int numCoppie = rimuoveTutteLeCoppie();
		 * System.out.println("---------- Coppie scartate, inizia la partita");
		 * stampaMani();
		 * 
		 * // gioca finché non sono state fatte 25 coppie int turno = 0; int numMani =
		 * mani.size(); while (numCoppie < 25) { numCoppie += giocaUnTurno(turno); turno
		 * = (turno + 1) % numMani; }
		 * 
		 * System.out.println("---------- La partita è finita"); stampaMani(); }
		 * 
		 * private int rimuoveTutteLeCoppie() { int conteggio = 0; for (GiocataOldMaid
		 * mano : mani) conteggio += mano.rimuoveCoppie(); return conteggio; }
		 * 
		 * private void stampaMani() { for (GiocataOldMaid g : mani) {
		 * System.out.println("Giocatore: " + g.getNome());
		 * System.out.println("Carte in mano:"); System.out.println(g);
		 * System.out.println(); } }
		 * 
		 * private int giocaUnTurno(int giocatore) { GiocataOldMaid corrente =
		 * mani.get(giocatore); if (corrente.isEmpty()) return 0;
		 * 
		 * int vicino = trovaVicino(giocatore); GiocataOldMaid avversario =
		 * mani.get(vicino);
		 * 
		 * Carta cartaScelta = avversario.primaCarta(); // prende la prima carta dal
		 * vicino corrente.aggiungeCarta(cartaScelta); System.out.println("Mano di " +
		 * corrente.getNome() + ": scelta " + cartaScelta);
		 * 
		 * int coppieFatte = corrente.rimuoveCoppie(); corrente.mescola(); return
		 * coppieFatte; }
		 * 
		 * private int trovaVicino(int giocatore) { int n = mani.size(); for (int step =
		 * 1; step < n; step++) { int vicino = (giocatore + step) % n; if
		 * (!mani.get(vicino).isEmpty()) return vicino; } return giocatore; // caso
		 * limite } }
		 * 
		 * ========================== MAIN – esecuzione ==========================
		 * public static void main(String[] args) { // replica esatta dello script
		 * Python richiesto Gioco gioco = new Gioco(); // creato ma non usato
		 * direttamente qui ManoOldMaid mano = new ManoOldMaid();
		 * mano.partita(Arrays.asList( "Richard Marcus", "Joseph Murphy",
		 * "Edward Thorp", "Joseph Jagger" )); } }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */