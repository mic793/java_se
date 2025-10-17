package day_00_es_03_figure_geometriche;

public class Cerchio implements FiguraGeometrica{
	
	private double raggio;
	
	public Cerchio() {
		super();
	}
	
	public Cerchio(double aRaggio) {
		this.raggio = aRaggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	@Override
	public double calcolaArea() {
		return Math.PI * raggio * raggio;
	}
	
	@Override
	public double calcolaPerimetro() {
		return 2 * Math.PI * raggio;
	}

	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + "]";
	}

}
