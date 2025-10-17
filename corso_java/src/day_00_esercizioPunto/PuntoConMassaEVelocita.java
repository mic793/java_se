package day_00_esercizioPunto;

public class PuntoConMassaEVelocita extends PuntoConMassa{
	private float velocita;
	
	public PuntoConMassaEVelocita() {
		super();
	}
	
	public PuntoConMassaEVelocita(float aX, float aY, float aZ, float aMassa, float aVelocita) {
		super(aX, aY, aZ, aMassa);
		this.velocita=aVelocita;		
	}
	
	public float getVelocita() {
		return velocita;
	}
	
	public void setVelocita(float aVelocita) {
		this.velocita=aVelocita;
	}
	
	@Override
	public String toString() {
		return super.toString() + " velocita = " + velocita;
	}

}
