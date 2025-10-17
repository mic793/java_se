package day_12.ex_08_museo;

public class Quadro extends Opera{
	private Tecnica tecnicaUsata;//attributo specifico di quadro
	
	//String aCodice, String aTitolo, String aAutore, boolean aEsposta
	public Quadro(String aCodice, String aTitolo, String aAutore, boolean aEsposta, Tecnica aTecnicaUsata) {
		super(aCodice, aTitolo, aAutore, aEsposta);
		tecnicaUsata = aTecnicaUsata;		
	}

	public Tecnica getTecnicaUsata() {
		return tecnicaUsata;
	}

	public void setTecnicaUsata(Tecnica tecnicaUsata) {
		this.tecnicaUsata = tecnicaUsata;
	}

	@Override
	public String toString() {
		return "Quadro [" + super.toString() + ", tecnica usata=" + this.tecnicaUsata + "]";
	}
	
}
