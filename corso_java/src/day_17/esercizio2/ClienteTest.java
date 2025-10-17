package day_17.esercizio2;

public class ClienteTest {

	public static void main(String[] args) {

		//String aCF, String aNome, String aCognome, double aKwh
		Cliente paoloRossi = new ClienteLuce("CF1", "Paolo", "Rossi", 701.30);
		
		//String aCF, String aNome, String aCognome, double aMetroCubo
		Cliente martaBianchi = new ClienteGas("CF2", "Marta", "Bianchi", 81.10);
		
		//String aCF, String aNome, String aCognome, TipoCliente aTipo
		Cliente marcoVerdi = new ClienteFisso("CF3", "Marco", "Verdi", TipoCliente.SUPERSPECIAL);
		
		//String aCF, String aNome, String aCognome, int aGigaByte
		Cliente luciaGialli = new ClienteMobile("CF4", "Lucia", "Gialli", 80);
		
		ClienteController.prezzoDaPagare(paoloRossi);
		ClienteController.prezzoDaPagare(martaBianchi);
		ClienteController.prezzoDaPagare(marcoVerdi);
		ClienteController.prezzoDaPagare(luciaGialli);
	
		System.out.println(paoloRossi);
		System.out.println(martaBianchi); 
		System.out.println(marcoVerdi);
		System.out.println(luciaGialli);
		 
		
	}		

}
