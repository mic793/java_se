package day_00_es_08_deposito;

public final class Controller {
	
	//costruttore parametrico private: in questo modo dall'esterno non si puo' fare new Controller()
	private Controller() {
		
	}
	
	public static Contenitore[] filtra(Contenitore[] contenitori, Contenitore campione) {

		for(int i = 0; i < contenitori.length; i++) {
	
			if(contenitori[i].getNome().equals(campione.getNome())) {
				contenitori[i] = null;
			}
		}
		return contenitori;
		
	}
}
