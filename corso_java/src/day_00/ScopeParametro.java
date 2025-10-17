package day_00;

public class ScopeParametro {

	// Metodo con parametro
	public static void metodo(int parScopeMetodo) {
		// Utilizzo del parametro
		System.out.println("Hai passato il valore: " + parScopeMetodo);
	}

	// System.out.println("Hai passato il valore: " + parScopeMetodo);parScopeMetodo
	// e' visibile solo all'interno di metodo
	public static void main(String[] args) {

		// Chiamata al metodo passando un valore
		ScopeParametro.metodo(42);
		// System.out.println("Hai passato il valore: " + parScopeMetodo);parScopeMetodo
		// e' visibile solo all'interno di metodo
	}
}
