package day_17.esercizio2;

public class ClienteFisso extends Cliente {
	
	private TipoCliente tipo;
	
	public ClienteFisso() {
		super();
	}
	
	public ClienteFisso(String aCF, String aNome, String aCognome, TipoCliente aTipo) {
		super(aCF, aNome, aCognome);
		this.tipo = aTipo;
	}
	
	public TipoCliente getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "ClienteFisso ["+ super.toString() + ", tipo=" + tipo + "]";
	}
	

}
