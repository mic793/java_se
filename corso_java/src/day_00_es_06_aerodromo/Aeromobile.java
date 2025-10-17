package day_00_es_06_aerodromo;

/*
 * ESERCIZIO 6
 * In un aerodromo si vuol mantenere informazioni sugli aeromobili. Di ogni aeromobile
 * si vuole sapere la sigla (string) che lo identifica.
 * Gli alianti sono aeromobili caratterizzati da un numero (int) che ne descrive
 * l'efficienza aereodinamica. Degli aerei a motore si vuole sapere la potenza in CV del
 * motopropulsore (double).
 * Aeromobili dello stesso tipo devono essere confrontabili fra loro in modo da poter
 * stabilire quale sia quello con prestazioni migliori.
 * Gli alianti si confrontano in base all'efficienza; gli aerei a motore in base alla potenza
 * in CV.
 * Scrivi un'interfaccia pubblica CMP contenente un metodo boolean superiore (CMP
 * x) per verificare se un aeromobile (this) é superione ad un altro x come prestazioni.
 * II metodo deve sempre restituire false se x=null o se gli oggetti coinvolti nel confronto
 * non sono dello stesso tipo.
 * Scrivi tre classi pubbliche: aeromobile (A) aliante (AL) ed aereomotore (AM) ciascuna
 * con un metodo get pubblico per accedere all'attributo specifico della classe.
 * Ogni classe deve fornire anche: un costruttore, i metodi equals e tostring.
 * II codice scritto deve rispettare i seguenti vincoli:
 * — La classe aeromobile (A) deve implementare l'Interfaccia CMP.
 * — Aliante (AL) ed aereomotore (AM) devono estendere aeromobile (A).
 * — Deve esserci almeno una classe astratta.
 */

public abstract class Aeromobile implements Comparable<Aeromobile>{
	String sigla;

	public Aeromobile() {
		super();
	}
	
	public Aeromobile(String aSigla) {
		this.sigla = aSigla;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String aSigla) {
		this.sigla = aSigla;
	}
	
	public abstract int compareTo(Aeromobile a);
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Aeromobile other = (Aeromobile) obj;
		return (sigla == null ? other.sigla == null : sigla.equals(other.sigla));
	}
	
	@Override
	public int hashCode() {
		return (sigla == null ? 0 : sigla.hashCode());
	}
	
	@Override
	public String toString() {
		return "Aeromobile [sigla = " + sigla;		
	}
	
}
