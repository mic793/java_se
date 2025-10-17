package day_12.ex_08_museo;

import java.util.ListIterator;

public class MuseoController {

	// 1. caricare un'opera
	public static void caricaOpera(Museo museo, Opera opera) {

		int index = -1;
		if (opera.isEsposta() == true) {
			for (int i = 0; i < museo.getOperaEsposta().length; i++) {
				if (museo.getOperaEsposta()[i] == null) {
					index = i;
					break;
				}
			}
		}
		if (index != -1 && opera.isEsposta() == true) {
			museo.getOperaEsposta()[index] = opera;
			// operaEsposta[index] = opera;

		} else {
			opera.setEsposta(false);
			museo.getOperaNonEsposta().add(opera);
			// operaEsposta.add(opera);
		}
	}

	// 2. spostare un'opera: permette di trasferire un’opera dall'esposizione al magazzino.
	public static String spostaOpera(Museo museo, Opera opera) {
		int index = -1;
		Opera o = null;
		for(int i = 0; i < museo.getOperaEsposta().length; i++) {
			if(museo.getOperaEsposta()[i].equals(opera)) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			museo.getOperaEsposta()[index].setEsposta(false);
			museo.getOperaNonEsposta().add(museo.getOperaEsposta()[index]);
			//opera = operaEsposta[index];
			museo.getOperaEsposta()[index] = null;
			return "opera spostata da esposta a non esposta";
		}
		return "opera non trovata";
	}
	
	//3.Cercare un’opera: cerca per codice l'opera sia nel museo che nel deposito
	public static int cercaOpera(Museo museo, Opera opera) {
		ListIterator listIterator = museo.getOperaNonEsposta().listIterator();
		
		for(int i = 0; i < museo.getOperaEsposta().length; i++) {
			if(museo.getOperaEsposta()[i].equals(opera)) {
				return i;
			}
		}
		
		
		int index = 0;
		while(listIterator.hasNext()) {
			if(listIterator.next().equals(opera)) {
				return index;
			}else {
				index++;
			}
			
		}
		return -1;
		
		//return museo.getOperaNonEsposta().indexOf(opera);//soluzione alternativa utilizzando un metodo di libreria
	}
	
	//4.Stampare le opere esposte: mostra tutte le opere attualmente visibili nel museo.
	public static String stampaEsposizione(Museo museo) {
	    StringBuilder sb = new StringBuilder();
	    Opera[] esposte = museo.getOperaEsposta();
	    for (int i = 0; i < esposte.length; i++) {
	        if (esposte[i] != null) {
	            sb.append(esposte[i]).append('\n');
	        }
	    }
	    return sb.toString();
	}
	
	//5.Stampare le opere non esposte: mostra le opere collocate nel deposito.
	public static String stampaDeposito(Museo museo) {
	    StringBuilder sb = new StringBuilder();
	    ListIterator<Opera> listIterator = museo.getOperaNonEsposta().listIterator();
	    while (listIterator.hasNext()) {
	        Opera o = listIterator.next();
	        sb.append(o.toString()).append("\n");
	    }

	    return sb.toString();
	}
	
}
