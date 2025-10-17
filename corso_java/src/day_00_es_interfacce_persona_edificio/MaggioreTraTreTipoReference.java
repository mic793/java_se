package day_00_es_interfacce_persona_edificio;

public class MaggioreTraTreTipoReference {

	public static void main(String[] args) {

		Edificio e1 = new Edificio(10.2);
		Edificio e2 = new Edificio(1.9);
		Edificio e3 = new Edificio(15.2);
		
		Persona p1 = new Persona(1.9);
		Persona p2 = new Persona(1.73);
		Persona p3 = new Persona(1.85);
		
		System.out.println("L'edificio piu' alto e': " + Controller.maggioreTraTre(e1, e2, e3));
		
		System.out.println("La persona piu' alta e': " + Controller.maggioreTraTre(p1, p2, p3));
	}

}
