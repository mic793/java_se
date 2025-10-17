package day_00_es_05_operazione;

public class Sottrazione extends OperazioneBase{
	
	public Sottrazione(double aA, double aB ) {
		super(aA, aB);
	}
	
	@Override
	public double operazione() {
		return a - b;
	}
	
}
