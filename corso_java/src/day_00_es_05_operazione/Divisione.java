package day_00_es_05_operazione;

/*public class Divisione implements Operazione{
	protected double operando3;
	protected double operando4;
	
	public Divisione() {
		super();
	}
	
	public Divisione(double aOperando3, double aOperando4) {
		this.operando3 = aOperando3;
		this.operando4 = aOperando4;
	}
	
	public double operazione() {
		double risultatoDiv = operando3 / operando4;
		return risultatoDiv;
	}
	

}
*/

public class Divisione extends OperazioneBase{
	
	public Divisione(double aA, double aB) {
		super(aA, aB);
	}
	
	@Override
	public double operazione() {
		if( b == 0) {
			throw new ArithmeticException("Divisione per zero non consentita");
		}
		return a / b;
	}
	
	
}
