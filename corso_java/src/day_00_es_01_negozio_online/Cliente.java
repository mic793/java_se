package day_00_es_01_negozio_online;

public class Cliente {
	
	private String id;
	private String nome;
	private Carrello carrello;
	
	public Cliente() {
		super();
	}

	public Cliente(String aId, String aNome, Carrello aCarrello) {
		super();
		this.id = aId;
		this.nome = aNome;
		this.carrello = aCarrello;
	}

	public String getId() {
		return id;
	}

	public void setId(String aId) {
		this.id = aId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public Carrello getCarrello() {
		return carrello;
	}

	public void setCarrello(Carrello aCarrello) {
		this.carrello = aCarrello;
	}
	

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + "\n " + carrello + "]";
	}
	
		
	
}
