package day_17.esercizio2;

public class ClienteGas extends Cliente {
	
	private double costoMetroCubo;
	private double metroCubo;

	public ClienteGas() {
		super();
	}
	
	//String aCF, String aNome, String aCognome
	public ClienteGas(String aCF, String aNome, String aCognome, double aMetroCubo) {
		super(aCF, aNome, aCognome);
		this.metroCubo = aMetroCubo;		
	}
	
	public double getMetroCubo() {
		return metroCubo;
	}
	
	public void setMetroCubo(double metroCubo) {
		this.metroCubo = metroCubo;
	}
	
	public double getCostoMetroCubo() {
		return costoMetroCubo;
	}
	
	public void setCostoMetroCubo(double costoMetroCubo) {
		this.costoMetroCubo = costoMetroCubo;
	}
	
	@Override
	public String toString() {
		return "ClienteGas [" + super.toString() + " costoMetroCubo=" + costoMetroCubo + ", metroCubo=" + metroCubo + "]";
	}
	
	
	
	
	
}


