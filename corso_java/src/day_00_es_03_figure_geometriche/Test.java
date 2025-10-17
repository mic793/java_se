package day_00_es_03_figure_geometriche;

public class Test {
	
	public static void main(String[] args) {
	
	//double aLunghezza, double aLarghezza
	FiguraGeometrica r1 = new Rettangolo(10, 5);
	
	//double aRaggio
	FiguraGeometrica c1 = new Cerchio(6.5);
	
	//double aBase, double aAltezza, double aLato1, double aLato2
	FiguraGeometrica t1 = new Triangolo (10.5, 9, 10.5, 9.0);
	
	GestoreFigura g = new GestoreFigura();
	
	Controller.aggiungiFigura(g, r1);
	Controller.aggiungiFigura(g, c1);
	Controller.aggiungiFigura(g, t1);
	
	Controller.stampaReport(g);
	
	System.out.println("Somma aree: " + Controller.sommaAree(g)); 
	
	}

}
