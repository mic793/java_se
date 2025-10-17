package day_17.esercizio2;

public class ClienteLuce extends Cliente{
	
	private double costoKwh;
	private double kwh;
	
	public ClienteLuce() {
		super();
	}
	
	public ClienteLuce(String aCF, String aNome, String aCognome, double aKwh) {
		super(aCF, aNome, aCognome);
		//this.costoKwh = aCostoKwh; in questo caso il costo deve essere impostato con il metodo Set perche' dovra' essere calcolato in base al consumo
		this.kwh = aKwh;
	}
	
	public double getCostoKwh() {
		return costoKwh;
	}
	
	public void setCostoKwh(double costoKwh) {
		this.costoKwh = costoKwh;
	}
	
	public double getKwh() {
		return kwh;
	}
	
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

	@Override
	public String toString() {
		return "ClienteLuce [" + super.toString() +", costoKwh=" + costoKwh + ", kwh=" + kwh + "]";
	}
	
	
	
	
	
	

}
