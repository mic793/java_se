package day_12.ex_08_museo;

import java.util.Objects;

public abstract class Opera {
	private String codice;//attributi
	private String titolo;
	private String autore;
	private boolean esposta;
	
	public Opera() {
		super();
	}
	
	public Opera(String aCodice, String aTitolo, String aAutore, boolean aEsposta) {
		super();
		this.codice = aCodice;
		this.titolo = aTitolo;
		this.autore = aAutore;
		this.esposta = aEsposta;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public boolean isEsposta() {
		return esposta;
	}

	public void setEsposta(boolean esposta) {
		this.esposta = esposta;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(codice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Opera other = (Opera) obj;
		return Objects.equals(this.codice, other.getCodice());
	}

	@Override
	public String toString() {
		return "codice=" + codice + ", titolo=" + titolo + ", autore=" + autore + ", esposta=" + esposta;
	}

}
