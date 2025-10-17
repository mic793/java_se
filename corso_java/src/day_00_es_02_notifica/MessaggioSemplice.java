package day_00_es_02_notifica;

public class MessaggioSemplice extends Messaggio{
//Messaggio	private String content;
	protected MessaggioSemplice(String aContent) {
		super(aContent);
	}
	
	public String invia(Notificabile destinatario) {
		// implementa invia() in modo standard
		return destinatario.notifica(getContent());
	}
	
}
