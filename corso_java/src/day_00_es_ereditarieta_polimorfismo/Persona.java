package day_00_es_ereditarieta_polimorfismo;

/*Si scriva una classe Persona dotata dei campi
CodiceFiscale, Nome, Cognome e dei metodi per impostare e leggere tali valori. La classe
inoltre dovrà essere dotata del metodo toString(). Si definisca poi una classe Studente come
estensione di Persona; i campi aggiuntivi di Studente rispetto a Persona sono matricola e
università. Inoltre la classe Studente dovrà avere i metodi per impostare e leggere tali campi
e dovrà sovrascrivere il metodo toString(). Si definisca infine la classe Docente che estende
Persona con campi aggiuntivi materia e salario. Anche in questo caso la classe dovrà avere
metodi per leggere e impostare i vari attributi e dovrà sovrascrivere il metodo toString().
*/

public class Persona {
	private String cf;
	private String nome;
	private String cognome;
	
	public Persona() {
		super();
	}
	
	public Persona(String aCf, String aNome, String aCognome) {
		this.cf = aCf;
		this.nome = aNome;
		this.cognome = aCognome;
	}
	
	public String getCf() {
		return cf;
	}
	
	public void setCf(String aCf) {
		this.cf = aCf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String aNome) {
		this.nome = aNome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String aCognome) {
		this.cognome = aCognome;
	}
	
	@Override
	public String toString() {
		return "Persona [ cf = " + cf + ", nome = " + nome + ", cognome " + cognome + "]";  
	}

}
