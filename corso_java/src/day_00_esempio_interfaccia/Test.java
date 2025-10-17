package day_00_esempio_interfaccia;

public class Test {

	public static void main(String[] args) {

		Avviabile server = new Server(true);
		Avviabile auto = new Auto(false);
		
		Avviabile[] avviabili = {server, auto};
		
		for(int i = 0; i < avviabili.length; i++) {
			System.out.println(avviabili[i].toString());
		}
	}

}
