package day_00_esempio_interfaccia;

public class Server implements Avviabile{
	
	private boolean acceso;
	
	public Server() {
		super();
	}
	
	public Server(boolean aAcceso) {
		this.acceso = aAcceso;
	}
	
	public void avvia() {
		acceso = true;
	}
	
	public void arresta() {
		acceso = false;
	}
	
	public boolean isAvviato() {
		return acceso;
	}
	
	public String toString() {
		return "Server(" + (acceso ? "ON" : "OFF") + ")";
	}

}
