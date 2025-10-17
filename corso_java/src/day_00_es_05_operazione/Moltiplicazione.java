package day_00_es_05_operazione;

public class Moltiplicazione extends OperazioneBase {
	
	public Moltiplicazione(double aA, double aB) {
		super(aA, aB);
	}
	
	@Override
	public double operazione() {
		return a * b;
	}
}
