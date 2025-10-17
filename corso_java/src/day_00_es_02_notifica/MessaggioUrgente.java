package day_00_es_02_notifica;

public class MessaggioUrgente extends Messaggio {
	// Messaggio private String content;
	public MessaggioUrgente(String aContent) {
		super(aContent);
	}

	public String invia(Notificabile destinatario) {
		//implementa invia() aggiungendo una prefazione specifica al messaggio 
		//(es. "URGENTE: " + messaggio). Questo sfrutta il polimorfismo per cambiare il comportamento.
		return destinatario.notifica("URGENTE: " + getContent());
		}

}
