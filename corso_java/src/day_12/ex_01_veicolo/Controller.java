package day_12.ex_01_veicolo;

public class Controller {

	public static String drive(Auto auto, double km) {
		if (auto.getSerbatoio() > 0) {
			double litriConsumati = km * auto.getConsumo();
			if (litriConsumati < auto.getSerbatoio()) {
				auto.setSerbatoio(auto.getSerbatoio() - litriConsumati);
				return "consumati: " + litriConsumati + " litri," + " nel serbatoio sono rimasti: " + auto.getSerbatoio() + " litri";
			}
			double kmMax = auto.getSerbatoio() * auto.getConsumo();
			return "Il numero massimo di km percorribile e': " + kmMax;
		}
		return "Il serbatoio deve essere prima riempito!";
	}

}
