package day_00_es_interfacce_persona_edificio;

public class Controller {

	public static <T extends Comparable<T>> T maggioreTraTre(T x1, T x2, T x3) {

		T max = x1;

		if (x2.compareTo(max) > 0) max = x2;
		if (x3.compareTo(max) > 0) max = x3;

		return max;

	}

}
