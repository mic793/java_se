package day_00_es_04_distributore;

public class DistributoreTest {

	public static void main(String[] args) {
		
		//String aCitta, String aProprietario, double aCapacita, double aBenzinaContenuta
		 Distributore d1 = new Distributore("Roma", "Alfa Srl", 5000.0, 1200.0);
	     Distributore d2 = new Distributore("Milano", "Beta Srl", 7000.0, 3000.0);

	     int comparazione = d1.compareTo(d2);
	     
	     //service = new Controller();
	     
	     //public double erogaCarburante(Distributore aDistributore, double aLitriRichiesti, double aPrezzoAlLitro) 
	     double incasso1 = Controller.erogaCarburante(d1, 120, 1.60);
	     double incasso2 = Controller.erogaCarburante(d2, 100, 1.77);
	     
	     System.out.println("Confronto capacita d1 vs d2: " + comparazione);
	     
	     System.out.println("Incasso d1: " + incasso1);
	     System.out.println("Incasso d2: " + incasso2);
	     
	     System.out.println(d1);
	     System.out.println(d2);
	}

}
