package day_00_es_02_notifica;

public class Test {

	public static void main(String[] args) {
		
		//String aNome, String aEmail
		Utente u1 = new Utente("Paolo Rossi", "paolo@example.com");
		Utente u2 = new Utente("Marta Neri", "marta@email.com");
		
		
		//String aNome
		Gruppo g = new Gruppo("Gruppo A");
		
		Controller.aggiungi(g, u1);
		Controller.aggiungi(g, u2);
		
		System.out.println(g.notifica("Call alle 15.30"));
		
		System.out.println(u1.notifica("Benvenuto Paolo!"));
		System.out.println(u2.notifica("Ciao Marta!"));
		
		System.out.println("----------------------------");
		
		Messaggio messSemplice = new MessaggioSemplice("Benvenuti nel gruppo Slack!");
		Messaggio messUrgente = new MessaggioUrgente("Verifica in corso!");
		
		System.out.println(messSemplice.invia(g));
		System.out.println(messUrgente.invia(u2));
		
	}

}
