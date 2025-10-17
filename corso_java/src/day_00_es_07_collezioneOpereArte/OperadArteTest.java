package day_00_es_07_collezioneOpereArte;

public class OperadArteTest {

	public static void main(String[] args) {
		Collezione c = new Collezione("Collezione moderna");

		//String aTitoloArtista, int aAltezza, int aLarghezza
		Quadro q1 = new Quadro("Pinocchio", "Giotto", 10, 5);
		//System.out.println(q1);
		//System.out.println("Ingombro quadro: " + q1.printIngombro());
		
		//Scultura(String aTitoloArtista, int aAltezza, int aLarghezza, int aProfondita)
		Scultura s1 = new Scultura("La Pieta", "Michelangelo", 30, 20, 5);
		//System.out.println(s1);
		//System.out.println("Ingombro scultura " + s1.printIngombro());
		
		CollezioneController.inserisciOpera(c, s1);
		CollezioneController.inserisciOpera(c, q1);
				
		System.out.println(c.toString());
		
		System.out.println("Ingombro scultura: " + CollezioneController.stampaIngombro(s1));

		System.out.println("Ingombro quadro: " + CollezioneController.stampaIngombro(q1));
	}

}
