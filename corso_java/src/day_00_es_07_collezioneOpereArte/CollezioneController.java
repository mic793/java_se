package day_00_es_07_collezioneOpereArte;

public class CollezioneController {

	public static boolean inserisciOpera(Collezione aCollezione, OperadArte aOperadArte) {
		return aCollezione.getOpere().add(aOperadArte);

	}

	public static double stampaIngombro(OperadArte aOpera) {
		return aOpera.ingombro();
	}

}
