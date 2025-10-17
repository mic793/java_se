package day_00_es_ereditarieta_polimorfismo;

public class Studente extends Persona{
	private String matricola;
	private String universita;
	
	public Studente() {
		super();
	}
	
	public Studente(String aCf, String aNome, String aCognome, String aMatricola, String aUniversita) {
		super(aCf, aNome, aCognome);
		this.matricola = aMatricola;
		this.universita = aUniversita;
	}
	
	public String getMatricola() {
		return matricola;
	}
	
	public void setMatricola(String aMatricola) {
		this.matricola = aMatricola;
	}
	
	public String getUniversita() {
		return universita;
	}
	
	public void setUniversita(String aUniversita) {
		this.universita = aUniversita;
	}
	
	@Override
	public String toString() {
		return super.toString() + " matricola studente: " + matricola + " dell'Universita " + universita;
	}

}
