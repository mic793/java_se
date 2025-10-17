package day_00_es_04_elettrodomestici;

import java.util.List;

public class Controller {
	
    public static boolean aggiungiElettrodomestico(List<Elettrodomestico> aElettrodomestici, Elettrodomestico aElettrodomestico) {
        if (aElettrodomestici == null || aElettrodomestico == null) return false;
        return aElettrodomestici.add(aElettrodomestico);
    }

    public static boolean rimuoviElettrodomestico(List<Elettrodomestico> aElettrodomestici, Elettrodomestico aElettrodomestico) {
        return aElettrodomestici.remove(aElettrodomestico);
    }
    
    public static void accendiElettrodomestico(List<Elettrodomestico> aElettrodomestici){
    	for(Elettrodomestico e : aElettrodomestici) {
    		e.accendi();
    	}
    
    }

}
