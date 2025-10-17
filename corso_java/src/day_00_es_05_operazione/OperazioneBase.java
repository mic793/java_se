package day_00_es_05_operazione;

public abstract class OperazioneBase implements Operazione {
	protected final double a;
	protected final double b;
	
	protected OperazioneBase(double aA, double aB){
		this.a = aA;
		this.b = aB;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public abstract double operazione();
	
	@Override
	public String toString() {
		double risultato = this.operazione();
		String nome = super.getClass().getSimpleName();
		return nome + " --> risultato " + risultato;
	}
	
}
