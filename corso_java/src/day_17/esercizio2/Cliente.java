package day_17.esercizio2;

public abstract class Cliente {
	private String cF;
	private String nome;
	private String cognome;
	private double prezzoDaPagare;

	public Cliente() {
		super();
	}
	
	public Cliente(String aCF, String aNome, String aCognome) {
		super();
		this.cF = aCF;
		this.nome = aNome;
		this.cognome = aCognome;
	
	}
	
	public String getCF() {
		return cF;
	}
	
	public void setCF(String cF) {
		this.cF = cF;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public double getPrezzoDaPagare() {
		return prezzoDaPagare;
	}
	
	public void setPrezzoDaPagare(double prezzoDaPagare) {
	    this.prezzoDaPagare = Math.round(prezzoDaPagare * 100.0) / 100.0;//arrotonda alla seconda cifra decimale
	}

	@Override
	public String toString() {
		return "cF=" + cF + ", nome=" + nome + ", cognome=" + cognome + ", prezzoDaPagare=" + prezzoDaPagare;
	}

	
}
