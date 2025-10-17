package day_00_es_04_elettrodomestici;

public abstract class Elettrodomestico implements Accendibile{
	
	private String marca;
	private String modello;
	private String classeEnergetica;
	private int potenza;
	private boolean stato;
	
	public Elettrodomestico() {
		super();
	}
	
	public Elettrodomestico(String aMarca, String aModello, String aClasseEnergetica, int aPotenza, boolean aStato) {
		this.marca = aMarca;
		this.modello = aModello;
		this.classeEnergetica = aClasseEnergetica;
		this.potenza = aPotenza;
		this.stato = aStato;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String aMarca) {
		this.marca = aMarca;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String aModello) {
		this.modello = aModello;
	}
	
	public String getClasseEnergetica() {
		return classeEnergetica;
	}
	
	public void setClasseEnergetica(String aClasseEnergetica) {
		this.classeEnergetica = aClasseEnergetica;
	}
	
	public int getPotenza() {
		return potenza;
	}

	public void setPotenza(int aPotenza) {
		this.potenza = aPotenza;
	}
	
	public boolean isAcceso() {
		return stato;
	}

	//String accendi();
	//String spegni();
	//creare una classe base Elettrodomestico che implementa Accendibile e che contiene un attributo booleano acceso.VERIFICARE!!!!
	@Override
	public String accendi() {
		this.stato = true;
		return "acceso";
	}
	
	@Override
	public String spegni() {
		this.stato = false;
		return "spento";
	}

	@Override
	public String toString() {
		return "marca=" + marca + ", modello=" + modello + ", classeEnergetica=" + classeEnergetica
				+ ", potenza=" + potenza + ", stato=" + stato;
	}
	
}
