package day_00_es_05_conto_bancario;

public class Test {

	public static void main(String[] args) {

		//String aNumeroConto, String aTitolare
		ContoBancario conto1 = new ContoBancario("0225895566", "Paolo Rossi");
		
		System.out.println(conto1);
		
		Controller.deposita(conto1, 100);
		
		System.out.println(conto1);
		
		Controller.preleva(conto1, 50);
		
		System.out.println(conto1);
	}

}
