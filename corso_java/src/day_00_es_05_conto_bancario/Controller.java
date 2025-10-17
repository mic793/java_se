package day_00_es_05_conto_bancario;

public class Controller {

	public static String deposita(ContoBancario aConto, double aImporto) {
		aConto.setSaldo(aConto.getSaldo() + aImporto);
		return "saldo attuale: " + aConto.getSaldo();
	}
	
	public static String preleva(ContoBancario aConto, double aImporto) {
		if(aImporto > aConto.getSaldo()) {
			System.out.println("impossibile prelevare");
		}else {
			aConto.setSaldo(aConto.getSaldo() - aImporto);			
		}
		return "saldo attuale: " + aConto.getSaldo() ;

	}
	
}
