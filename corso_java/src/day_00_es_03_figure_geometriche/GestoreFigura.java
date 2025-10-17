package day_00_es_03_figure_geometriche;

import java.util.ArrayList;
import java.util.List;

public class GestoreFigura {
	private List<FiguraGeometrica> figure;
	
	public GestoreFigura() {
		super();
		figure = new ArrayList<>();
	}

	public List<FiguraGeometrica> getFigure() {
		return figure;
	}

	@Override
	public String toString() {
		return "GestoreFigura [figure=" + figure + "]";
	}

}
