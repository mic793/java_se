package day_00_es_07_collezioneOpereArte;

import java.util.Objects;

/*
 * ESERCIZIO 7
 * Realizza una opportuna gerarchia di classi per modellare una collezione (c)
 * identificata da un nome, da un luogo, da un insieme di opere d'arte e dalle
 * informazioni relative al loro ingombro.
 * Radice della gerarchia la classe astratta operadarte (OD) contenente :
 * — i campi protetti titolo artista
 * — il costruttore
 * — il metodo public abstract double printingo±ro ( ) Che restituisce
 * l'ingombro dell'opera
 * — il metodo public boolean equals (Object o) cheverifica se due opere d'arte
 * sono uguali ed altri metodi di interesse.
 * La sottoclasse quadro (Q) ha due variabili aggiuntive:altezza e larghezza che
 * identificano la misura del quadro.
 * La sottoclasse scultura (s) ha 3 variabili aggiuntive altezza larghezza e profonditå che
 * identificano le misure della scultura.
 * Implementare le due classi concretizzando il metodo ingornbro ( ) .
 * Realizzare poi, una classe collezione identificata da un nome e da un insieme di opere
 * d'arte scrivere i seguenti metodi: inserire un opera d'arte, stampare la collezione ,
 * stampare l'occupazione di una data opera.
 */

public abstract class OperadArte {
	protected String titolo;
	protected String artista;

	public OperadArte() {
		super();
	}
	
	public OperadArte(String aTitolo, String aArtista) {
		this.titolo = aTitolo;
		this.artista = aArtista;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String aTitolo) {
		this.titolo = aTitolo;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String aArtista) {
		this.artista = aArtista;
	}
	
	public abstract double ingombro();
	
	@Override
	public int hashCode() {
		return Objects.hash(artista, titolo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OperadArte other = (OperadArte) obj;
		return Objects.equals(artista, other.artista) && Objects.equals(titolo, other.titolo);
	}
	
	@Override
	public String toString() {
		return "Opera d'arte [Titolo =" + titolo + ", Artista = " + artista;
	}
	
}
