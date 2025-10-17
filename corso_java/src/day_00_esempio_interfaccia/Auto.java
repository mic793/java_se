package day_00_esempio_interfaccia;

public class Auto implements Avviabile{
	
	private boolean motoreAcceso;
	
	public Auto() {
		super();
	}
	
	public Auto(boolean aMotoreAcceso) {
		this.motoreAcceso = aMotoreAcceso;
	}
	
	public void avvia() {
		motoreAcceso = true;
	}
	
	public void arresta() {
		motoreAcceso = false;
	}
	
	public boolean isAvviato() {
		return motoreAcceso;
	}
	
	@Override
	public String toString() {
		return "Auto(motore " + (motoreAcceso ? "acceso" : "spento") + ")";
	}

}
