package day_00_es_04_distributore;

public class Controller {
	
	public static double erogaCarburante(Distributore aDistributore, double aLitriRichiesti, double aPrezzoAlLitro) {
		if(aDistributore == null) {
			return 0.0;
		}
		if(aLitriRichiesti <= 0 || aPrezzoAlLitro <= 0) {
			return 0.0;
		}
		
		double carburanteDisponibile = aDistributore.getBenzinaContenuta();
		
		if(aLitriRichiesti > carburanteDisponibile) {
			return 0.0;
		}
		
		aDistributore.setBenzinaContenuta(carburanteDisponibile - aLitriRichiesti);
				
		double incasso = aLitriRichiesti * aPrezzoAlLitro;
		aDistributore.setIncasso(aDistributore.getIncasso() + incasso);
		return incasso;
	}

}

