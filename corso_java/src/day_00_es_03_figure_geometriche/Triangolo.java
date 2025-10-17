package day_00_es_03_figure_geometriche;

public class Triangolo implements FiguraGeometrica {

	private double base;
	private double altezza;
	private double lato1;
	private double lato2;
	
	public Triangolo() {
		super();
	}
	
	public Triangolo(double aBase, double aAltezza, double aLato1, double aLato2) {
		this.base = aBase;
		this.altezza = aAltezza;
		this.lato1 = aLato1;
		this.lato2 = aLato2;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double aBase) {
		this.base = aBase;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double aAltezza) {
		this.altezza = aAltezza;
	}
	
	public double getLato1() {
		return lato1;
	}
	public void setLato1(double aLato1) {
		this.lato1 = aLato1;
	}
	
	public double getLato2() {
		return lato2;
	}

	public void setLato2(double aLato2) {
		this.lato2 = aLato2;
	}
	
	@Override
	public double calcolaArea() {
		return (base * altezza) / 2;
	}
	
	@Override
	public double calcolaPerimetro() {
		return base + lato1 + lato2;
	}
	
	@Override
	public String toString() {
		return "Triangolo [base=" + base + ", altezza=" + altezza + ", lato1=" + lato1 + ", lato2=" + lato2 + "]";
	}
	
	
}
