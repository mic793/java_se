package day_12.ex_09_campionato;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {

		// AC Milan
		Giocatore maignan = new Giocatore("Mike", "Maignan", LocalDate.of(1995, 7, 3), Ruolo.POR);

		Giocatore calabria = new Giocatore("Davide", "Calabria", LocalDate.of(1996, 12, 6), Ruolo.DC);
		Giocatore tomori = new Giocatore("Fikayo", "Tomori", LocalDate.of(1997, 12, 19), Ruolo.DC);
		Giocatore thiaw = new Giocatore("Malick", "Thiaw", LocalDate.of(2001, 8, 8), Ruolo.DC);
		Giocatore theo = new Giocatore("Theo", "Hernandez", LocalDate.of(1997, 10, 6), Ruolo.DC);

		Giocatore bennacer = new Giocatore("Ismael", "Bennacer", LocalDate.of(1997, 12, 1), Ruolo.CC);
		Giocatore tonali = new Giocatore("Sandro", "Tonali", LocalDate.of(2000, 5, 8), Ruolo.CC);
		Giocatore loftusCheek = new Giocatore("Ruben", "Loftus-Cheek", LocalDate.of(1996, 1, 23), Ruolo.CC);
		Giocatore krunic = new Giocatore("Rade", "Krunic", LocalDate.of(1993, 10, 7), Ruolo.CC);

		Giocatore giroud = new Giocatore("Olivier", "Giroud", LocalDate.of(1986, 9, 30), Ruolo.ATT);
		Giocatore leao = new Giocatore("Rafael", "Leao", LocalDate.of(1999, 6, 10), Ruolo.ATT);

		// stadi
		Stadio sanSiro = new Stadio("Stadio Giuseppe Meazza - San Siro", 75000, "Milano");
		// Stadio olimpicoRoma = new Stadio("Stadio Olimpico", 72698, "Roma");
		// Stadio artemioFranchi = new Stadio("Stadio Artemio Franchi", 43147,
		// "Firenze");
		// Stadio sanPaolo = new Stadio("Stadio Diego Armando Maradona", 54726,
		// "Napoli");
		// Stadio dallAra = new Stadio("Stadio Renato Dall’Ara", 38279, "Bologna");
		// Stadio luigiFerraris = new Stadio("Stadio Luigi Ferraris", 36599, "Genova");
//        Stadio juventusStadium = new Stadio("Allianz Stadium", 41507, "Torino");
		// Stadio marcantonioBentegodi = new Stadio("Stadio Marcantonio Bentegodi",
		// 39211, "Verona");
		// Stadio friuli = new Stadio("Dacia Arena - Stadio Friuli", 25144, "Udine");
		// Stadio santElia = new Stadio("Unipol Domus - ex Sant’Elia", 16416,
		// "Cagliari");
		// Stadio olimpicoTorino = new Stadio("Stadio Olimpico Grande Torino", 27994,
		// "Torino");

		// System.out.println(olimpicoRoma);

		// Squadre
		Squadra milan = new Squadra("AC Milan", "Rossoneri", "Stefano Pioli", sanSiro);
		// Squadra roma = new Squadra("AS Roma", "Giallorossi", "Daniele De Rossi",
		// olimpicoRoma);
		// Squadra fiorentina = new Squadra("ACF Fiorentina", "Viola", "Vincenzo
		// Italiano", artemioFranchi);
		// Squadra napoli = new Squadra("SSC Napoli", "Azzurri", "Antonio Conte",
		// sanPaolo);
		// Squadra bologna = new Squadra("Bologna FC", "Rossoblù", "Thiago Motta",
		// dallAra);
		// Squadra sampdoria = new Squadra("UC Sampdoria", "Blucerchiati", "Andrea
		// Pirlo", luigiFerraris);
		// Squadra juventus = new Squadra("Juventus FC", "Bianconeri", "Massimiliano
		// Allegri", juventusStadium);
		// Squadra verona = new Squadra("Hellas Verona", "Gialloblù", "Marco Baroni",
		// marcantonioBentegodi);
		// Squadra udinese = new Squadra("Udinese Calcio", "Bianconeri", "Gabriele
		// Cioffi", friuli);
		// Squadra cagliari = new Squadra("Cagliari Calcio", "Rossoblù", "Claudio
		// Ranieri", santElia);
		// Squadra torino = new Squadra("Torino FC", "Granata", "Ivan Juric",
		// olimpicoTorino);

		CampionatoController.addGiocatore(milan, maignan);
		// Difensori
		CampionatoController.addGiocatore(milan, calabria);
		CampionatoController.addGiocatore(milan, tomori);
		CampionatoController.addGiocatore(milan, thiaw);
		CampionatoController.addGiocatore(milan, theo);

		// Centrocampisti
		CampionatoController.addGiocatore(milan, bennacer);
		CampionatoController.addGiocatore(milan, tonali);
		CampionatoController.addGiocatore(milan, loftusCheek);
		CampionatoController.addGiocatore(milan, krunic);

		// Attaccanti
		CampionatoController.addGiocatore(milan, giroud);
		CampionatoController.addGiocatore(milan, leao);

		Campionato serieA = new Campionato(Serie.fromNome("A"));

		System.out.println("Esito inserimento squadra in campionato: " + CampionatoController.addSquadra(serieA, milan));

		Squadra milan1 = new Squadra("AC Milan", "Rossoneri", "Stefano Pioli", sanSiro);

		System.out.println("Squadra ricercata nel campionato: " + CampionatoController.ricercaSquadra(serieA, milan1));

		System.out.println("Ricerca squadra per capienza stadio"
				+ CampionatoController.ricercaSquadrePerCapienzaStadio(serieA, 100000));

	}

}
