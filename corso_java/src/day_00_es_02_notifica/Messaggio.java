package day_00_es_02_notifica;

public abstract class Messaggio {
	private String content;
	
	public Messaggio() {
		
	}

	public Messaggio(String aContent) {
		this.content = aContent;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String aContent) {
		this.content = aContent;
	}
	
	//firma astratta: nessun corpo solo firma
	public abstract String invia(Notificabile destinatario);
	
	@Override
	public String toString() {
		return "Messaggio = " + content;
	}
	

}
