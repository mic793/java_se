package day_00_es_ereditarieta_polimorfismo;

public class ElencoPersone {
	private Persona[] persone; 
	
	public ElencoPersone(int aCapienza) {
		persone = new Persona[aCapienza];		
	}
	
	public String aggiungiPersona(Persona p) {
		
		for(int i = 0; i < persone.length; i++) {
			if(persone[i] == null) {
				persone[i] = p;
				return persone[i] + " inserita correttamente!";
			}
		}
		return p + "non inserita!";
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Persona p : persone) {
			if(p != null) {
				str = str + " " + p;
			}
		}
			return str;
		
	}

}
