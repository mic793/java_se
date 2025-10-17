package day_00_es_07_collezioneOpereArte;

public class Quadro extends OperadArte {
	private double altezza;
	private double larghezza;
	
	public Quadro() {
		super();
	}
	
	public Quadro(String aTitolo, String aArtista, double aAltezza, double aLarghezza) {
		super(aTitolo, aArtista);
		this.altezza = aAltezza;
		this.larghezza = aLarghezza;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public void setAltezza(double aAltezza, double aLarghezza) {
		this.altezza = aAltezza;
		this.larghezza = aLarghezza;
	}
	
	@Override
	public double ingombro() {
		//per calcolare l'ingombro calcoliamo l'area del cerchio
		return altezza * larghezza;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", altezza = " + altezza + ", larghezza = " + larghezza + "]";
	}
	
}
