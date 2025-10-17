package day_12.ex_08_museo;

public class Statua extends Opera{
	private double altezza;
	private Materiale materialeUsato;
	
	//String aCodice, String aTitolo, String aAutore, boolean aEsposta
	public Statua(String aCodice, String aTitolo, String aAutore, boolean aEsposta, double aAltezza, Materiale aMaterialeUsato) {
		super(aCodice, aTitolo, aAutore, aEsposta);
		materialeUsato = aMaterialeUsato;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public Materiale getMaterialeUsato() {
		return materialeUsato;
	}

	public void setMaterialeUsato(Materiale materialeUsato) {
		this.materialeUsato = materialeUsato;
	}

	@Override
	public String toString() {
		return "Statua [" + super.toString() + " altezza =" + altezza + ", materialeUsato=" + materialeUsato + "]";
	}
}
