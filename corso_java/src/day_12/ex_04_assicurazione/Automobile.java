package day_12.ex_04_assicurazione;

public class Automobile {
	
	private String numeroTarga;
	private Cliente proprietario;
	
	public Automobile() {
		
	}

	public Automobile(String numeroTarga, Cliente proprietario) {
		super();
		this.numeroTarga = numeroTarga;
		this.proprietario = proprietario;
	}

	public String getNumeroTarga() {
		return numeroTarga;
	}

	public void setNumeroTarga(String numeroTarga) {
		this.numeroTarga = numeroTarga;
	}

	public Cliente getProprietario() {
		return proprietario;
	}

	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Automobile [numeroTarga=" + numeroTarga + ", proprietario=" + proprietario + "]";
	}
}
