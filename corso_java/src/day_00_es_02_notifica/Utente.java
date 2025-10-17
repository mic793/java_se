package day_00_es_02_notifica;

public class Utente implements Notificabile{
	
	private String nome;
	private String email;
	
	public Utente() {
		super();
	}
	
	public Utente(String aNome, String aEmail) {
		this.nome = aNome;
		this.email = aEmail;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String aNome) {
		this.nome = aNome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String aEmail) {
		this.email = aEmail;
	}
	
	@Override
	public String notifica(String messaggio) {
		return "[Nome]: " + nome + "[Email] a: " + email + " --> " + messaggio;
	}
	
	@Override
	public String toString() {
		return "Utente [nome = " + nome + ", Email = " + email + "]" ;
	}
}
