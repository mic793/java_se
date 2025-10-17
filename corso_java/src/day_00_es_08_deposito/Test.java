package day_00_es_08_deposito;

import java.util.Arrays;

public class Test {
	public static void main(String[] args){
		
		Contenitore[] deposito = new Contenitore[]{
		new Lattina("L1", "Olio", 0.5),
		new Lattina("L2", "Acqua", 0.33),
		
		new Bidone("B1", "Olio", 200),
		new Bidone("B2", "Benzina", 500),
		
		new Lattina("L3", "Olio", 0.33)
		};
		
		Contenitore campione = new Lattina("LX", "Olio", 0.25);
		
		System.out.println("Prima: " + Arrays.toString(deposito));

		Contenitore[] filtrati = Controller.filtra(deposito, campione);
		
		System.out.println("Dopo: " + Arrays.toString(filtrati));

		
	}

}
