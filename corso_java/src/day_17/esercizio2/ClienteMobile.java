package day_17.esercizio2;

public class ClienteMobile extends Cliente{
	private int gigaByte;

	public ClienteMobile() {
		super();
	}
	
	public ClienteMobile(String aCF, String aNome, String aCognome, int aGigaByte) {
		super(aCF, aNome, aCognome);
		this.gigaByte = aGigaByte;
	}
	
	public int getGigaByte() {
		return gigaByte;
	}
	
	public void setGigaByte(int gigaByte) {
		this.gigaByte = gigaByte;
	}

	@Override
	public String toString() {
		return "ClienteMobile [" + super.toString() + ", gigaByte=" + gigaByte + "]";
	}
	
	
	
}


