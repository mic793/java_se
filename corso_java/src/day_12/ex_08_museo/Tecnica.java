package day_12.ex_08_museo;

public enum Tecnica {
	
	OLIO("oil"), TEMPERA("tempera"), ACQUERELLO("watercolor"), AFFRESCO("fresco");
	
	private final String tecnic;//attributo specifico di tecnica
	
	private Tecnica(String aTecnic) {
		tecnic = aTecnic;
	}

	public String getTecnica() {
		return tecnic;
	}
	
	public String getTecnic() {
		return tecnic;
	}
	
	public static Tecnica fromTecnic(String aTecnic) {
		for(Tecnica t: values()) {
			if(t.tecnic.equalsIgnoreCase(aTecnic)) {
				return t;
			}
		}
		return null;
	}

}
