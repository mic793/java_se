package day_00_esercizioPunto;

public class PuntoColorato extends Punto{
	public enum Colore {RED, GREEN, BLUE}; 

	private Colore colore;
	
	public PuntoColorato() {
		super();		
	}
	
	public PuntoColorato(float aX, float aY, float aZ, Colore aColore) {
		super(aX, aY, aZ);//viene richiamato il costruttore parametrico della classe Punto
		this.colore=aColore;
	}
	
	public Colore getColore() {
		return colore;
	}
	
	public void setColore(Colore aColore) {
		this.colore=aColore;
	}
	
	@Override
	public String toString() {
		return super.toString() + " colore = " + this.colore;
	}
	
}

