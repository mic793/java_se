package day_00_es_07_collezioneOpereArte;

public class Scultura extends OperadArte{
	private double altezza;
	private double larghezza;
	private double profondita;
	
	public Scultura() {
		super();
	}
	
	public Scultura(String aTitolo, String aArtista, double aAltezza, double aLarghezza, double aProfondita) {
		super(aTitolo, aArtista);
		this.altezza = aAltezza;
		this.larghezza = aLarghezza;
		this.profondita = aProfondita;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public void setAltezza(double aAltezza) {
		this.altezza = aAltezza;
	}
	
	public double getLarghezza() {
		return larghezza;
	}
	
	public void setLarghezza(double aLarghezza) {
		this.larghezza = aLarghezza;
	}	
	
	public double getProfondita() {
		return profondita;
	}
	
	public void setProfondita(double aProfondita) {
		this.profondita = aProfondita;
	}
	
	@Override
	public double ingombro() {
		return altezza * larghezza * profondita;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", altezza = " + altezza + ", larghezza = " + larghezza + ", profondita = " + profondita + "]";
	}
	

}
