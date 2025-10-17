package day_00_es_03_figure_geometriche;

public class Rettangolo implements FiguraGeometrica{
	
	private double lunghezza;
	private double larghezza;
	
	public Rettangolo() {
		super();
	}
	
	public Rettangolo(double aLunghezza, double aLarghezza) {
		this.lunghezza = aLunghezza;
		this.larghezza = aLarghezza;
	}

	public double getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(double aLunghezza) {
		this.lunghezza = aLunghezza;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double aLarghezza) {
		this.larghezza = aLarghezza;
	}

	//double calcolaArea();
	//double calcolaPerimetro();
	@Override
	public double calcolaArea() {
		return lunghezza * larghezza;
	}
	
	@Override
	public double calcolaPerimetro() {
		return 2 * (lunghezza + larghezza);
	}
	
	
	@Override
	public String toString() {
		return "Rettangolo [lunghezza=" + lunghezza + ", larghezza=" + larghezza + "]";
	}
	
	
}
