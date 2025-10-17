package day_00_es_05_operazione;

import java.util.List;

public class OperazioneController {

	public static void main(String[] args) {

		// Sottrazione operando1 = new Sottrazione(10,5);
		// Sottrazione operando2 = new Sottrazione(5,5);

		// Esempi singoli: si istanzia e si invoca operazione()
		Operazione sottrazione = new Sottrazione(10, 4);
		System.out.println(sottrazione.toString());		
		Operazione moltiplicazione = new Moltiplicazione(5, 9);
		System.out.println(moltiplicazione.toString());
		Operazione divisione = new Divisione(10, 2);
		System.out.println(divisione.toString());
		System.out.println();
		
		List<Operazione> operazioni = List.of(new Sottrazione(10, 8), new Moltiplicazione(8, 9), new Divisione(20, 10));

		System.out.println("******************");
		System.out.println();
		for (Operazione opr : operazioni) {
			System.out.println(opr.toString());
		}

	}

}
