package day_17.esercizio3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Rappresenta un archivio musicale digitale.
 * Questa classe agisce come un repository centrale che gestisce le collezioni di
 * artisti, generi, CD e brani.
 * La sua logica principale è quella di garantire l'unicità di artisti, generi e CD,
 * creando nuovi oggetti solo quando non ne esistono già di corrispondenti.
 */
public class Archivio {
	
	// Collezione per memorizzare gli artisti. Usando un Set si garantisce che ogni artista sia unico.
	private Set<Artista> artisti = new HashSet<>();
	// Collezione per memorizzare i generi. Anche qui, un Set assicura l'unicità.
	private Set<Genere> generi = new HashSet<>();
	// Collezione per memorizzare i CD. Un Set per evitare duplicati.
	private Set<Cd> cds = new HashSet<>();
	// Collezione per memorizzare i brani. Una List è appropriata qui perché
	// non è necessario imporre l'unicità a livello di archivio (potrebbero esistere più versioni dello stesso brano).
	private List<Brano> brani = new ArrayList<>();
	
	/**
	 * Cerca un artista per nome. Se lo trova, restituisce l'oggetto esistente.
	 * Altrimenti, ne crea uno nuovo, lo aggiunge all'archivio e lo restituisce.
	 * Questo pattern è noto come "get or create".
	 * @param nome Il nome dell'artista da cercare o creare.
	 * @return L'oggetto Artista, esistente o appena creato.
	 */
	public Artista getOrCreateArtista(String nome) {
		// Itera attraverso la collezione di artisti esistenti.
		for(Artista a : artisti) {
			// Confronta il nome dell'artista corrente con quello fornito, ignorando maiuscole/minuscole.
			if(a.getNome().equalsIgnoreCase(nome)) return a; // Se lo trova, restituisce l'oggetto esistente.
		}
		// Se il ciclo termina, significa che l'artista non è stato trovato.
		Artista nuovoArtista = new Artista(nome); // Crea una nuova istanza.
		artisti.add(nuovoArtista); // La aggiunge alla collezione.
		return nuovoArtista; // E la restituisce.
	}
	
	/**
	 * Cerca un genere per nome. Se lo trova, lo restituisce.
	 * Altrimenti, ne crea uno nuovo, lo aggiunge all'archivio e lo restituisce.
	 * @param nome Il nome del genere da cercare o creare.
	 * @return L'oggetto Genere, esistente o appena creato.
	 */
	public Genere getOrCreateGenere(String nome) {
		// La logica è identica a quella di getOrCreateArtista.
		for(Genere g : generi) {
			if(g.getNome().equalsIgnoreCase(nome)) return g;
		}
		Genere nuovoGenere = new Genere(nome);
		generi.add(nuovoGenere);
		return nuovoGenere;
	}
	
	/**
	 * Cerca un CD per titolo e artista. Se lo trova, lo restituisce.
	 * Altrimenti, ne crea uno nuovo, lo aggiunge all'archivio e lo restituisce.
	 * @param aTitolo Il titolo del CD.
	 * @param aArtista L'oggetto Artista del CD.
	 * @param aGenere L'oggetto Genere del CD (necessario per creare un nuovo CD).
	 * @return L'oggetto Cd, esistente o appena creato.
	 */
	public Cd getOrCreateCd(String aTitolo, Artista aArtista, Genere aGenere) {
		// Itera attraverso la collezione di CD esistenti.
		for(Cd c : cds) {
			// Un CD è considerato un duplicato se ha lo stesso titolo E lo stesso artista.
			// Il confronto sull'artista si basa sul metodo .equals() della classe Artista.
			if(c.getTitolo().equalsIgnoreCase(aTitolo) && c.getArtista().equals(aArtista)) {
				return c; // Se lo trova, restituisce l'oggetto esistente.
			}
		}
		// Se non viene trovato, crea un nuovo CD con tutti i dati forniti.
		Cd nuovoCd = new Cd(aTitolo, aArtista, aGenere);
		cds.add(nuovoCd); // Lo aggiunge alla collezione.
		return nuovoCd; // E lo restituisce.
	}
	
	/**
	 * Metodo di alto livello per aggiungere un nuovo brano all'archivio.
	 * Orchestra le chiamate ai metodi "getOrCreate" per gestire artisti, generi e CD
	 * prima di creare e aggiungere il brano finale.
	 * @param aTitoloBrano Il titolo del brano da aggiungere.
	 * @param aTitoloCd Il titolo del CD a cui il brano appartiene.
	 * @param aNomeArtista Il nome dell'artista.
	 * @param aNomeGenere Il nome del genere.
	 */
	public void aggiungiBrano(String aTitoloBrano, String aTitoloCd, String aNomeArtista, String aNomeGenere) {
		// 1. Ottiene o crea l'artista.
		Artista artista = getOrCreateArtista(aNomeArtista);
		// 2. Ottiene o crea il genere.
		Genere genere = getOrCreateGenere(aNomeGenere);
		// 3. Ottiene o crea il CD, usando gli oggetti artista e genere appena recuperati.
		Cd cd = getOrCreateCd(aTitoloCd, artista, genere);
		// 4. Crea la nuova istanza del brano, associandola al CD corretto.
		Brano brano = new Brano(aTitoloBrano, cd);
		// 5. Aggiunge il nuovo brano alla lista dei brani dell'archivio.
		brani.add(brano);
	}
	
	/**
	 * Stampa a video l'intero contenuto dell'archivio, un brano alla volta.
	 */
	public void stampaArchivio() {
		System.out.println("=== CONTENUTO ARCHIVIO ===");
		// Itera sulla lista di brani.
		for(Brano b : brani) {
			// Per ogni brano, invoca il suo metodo toString(), che a sua volta
			// invocherà i metodi toString() di Cd, Artista e Genere per una stampa completa.
			System.out.println(b);
		}
	}
}