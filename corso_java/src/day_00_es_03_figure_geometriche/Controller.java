package day_00_es_03_figure_geometriche;

import java.util.List;

public class Controller {
	
	public static boolean aggiungiFigura(GestoreFigura aG, FiguraGeometrica aF) {
		if (aG == null || aF == null) return false;
        return aG.getFigure().add(aF);
	}
	
	public static void stampaReport(GestoreFigura aG) {
		if(aG == null || aG.getFigure().isEmpty()) {
			return;
		}
		for(FiguraGeometrica f : aG.getFigure()) {
			String tipo = f.getClass().getSimpleName();
			System.out.println(tipo + " area " + f.calcolaArea() + " | perimetro " + f.calcolaPerimetro());
		}
	}
	
	public static double sommaAree(GestoreFigura aG) {
		if(aG == null) return 0.0;
		double somma = 0.0;
		for(FiguraGeometrica f : aG.getFigure()) {
			somma = somma + f.calcolaArea();
		}
		return somma;				
	}

}
