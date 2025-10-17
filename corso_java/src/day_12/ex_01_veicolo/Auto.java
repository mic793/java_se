package day_12.ex_01_veicolo;

public class Auto {
	
	private String targa;//attributo private quindi accessibile solamente da codice scritto nella stessa classe --> INFORMATION HIDING
	private String modello;
	private String marca;
	private String numeroPosti;
	private double serbatoio;
	private double consumo;//l/km   4litri/100km = 0,04 
	 	
	//COSTRUTTORE DI DEFAULT	
	 public Auto() {//il costruttore di default se non viene dichiarato esplicitamente lo aggiunge Java ma solo se non e' presente un altro costruttore parametrico
	
	 }
	 
	//COSTRUTTORE PARAMETRICI
	public Auto(String aTarga, String aModello, String aMarca, String aNumeroPosti, double aSerbatoio, double aConsumo) {//il costruttore deve avere lo stesso nome della classe e deve essere scritto in maiuscolo
		this.targa = aTarga;
		this.modello = aModello;
		this.marca = aMarca;
		this.numeroPosti = aNumeroPosti;		
		this.serbatoio = aSerbatoio;
		this.consumo = aConsumo;
	}
	
	
	public String getTarga() {
		return this.targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	public String getModello() {
		return this.modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {//DEFINIZIONE: marca e' il paramentro formale del metodo
		this.marca = marca;
	}
	
	public String getNumeroPosti() {
		return this.numeroPosti;
	}
	
	public void setNumeroPosti(String numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	
	public double getSerbatoio() {
		return this.serbatoio;
	}
	
	public void setSerbatoio(double serbatoio) {
		this.serbatoio = serbatoio;
	}
	
	public double getConsumo() {
		return this.consumo;
	}
	
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Auto [targa=" + targa + ", modello=" + modello + ", marca=" + marca + ", numeroPosti=" + numeroPosti
				+ ", serbatoio=" + serbatoio + ", consumo=" + consumo + "]";
	}
	
}
