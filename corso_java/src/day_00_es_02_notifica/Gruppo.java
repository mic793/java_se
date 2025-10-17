package day_00_es_02_notifica;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Gruppo implements Notificabile {

	private String nome;
	private List<Utente> utenti = new LinkedList<>();

	public Gruppo() {
		super();
	}

	public Gruppo(String aNome) {
		this.nome = aNome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public List<Utente> getUtenti() {
		return utenti;
	}
	
	@Override
	public String notifica(String messaggio) {
		String[] messaggi = new String[utenti.size()];
		for(int i = 0; i < utenti.size(); i++) {
			messaggi[i] = utenti.get(i).notifica(messaggio);
		}
		return Arrays.toString(messaggi);
	}

	@Override
	public String toString() {
		return "Gruppo [nome = " + nome + utenti.toString() + "]";
	}

}
