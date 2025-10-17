package day_00_esercizioPunto;

public class PuntoConMassa extends Punto{
	private float massa;
	
	public PuntoConMassa() {
		super();
	}
	
	public PuntoConMassa(float aX, float aY, float aZ, float aMassa) {
		super(aX, aY, aZ);
		this.massa=aMassa;
	}
	
	public float getMassa() {
		return massa;
	}
	
	public void setMassa(float aMassa) {
		this.massa=aMassa;
	}
	
	public String toString() {
		return super.toString() + " massa = " + massa;
	}
	

}
