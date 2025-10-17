package day_00;

public class Scope {
	public static void main(String[] args) {

		int varScopeMetodo = 10; // varScopeMetodo ha scope nel blocco del metodo
		if (varScopeMetodo > 5) {
			int varScopeBlocco = 20;// varScopeBlocco ha scope solo all'interno del blocco if
			System.out.println("Stampo il valore di varScopeBlocco dal blocco dell'if: " + varScopeBlocco);
		}
		System.out.println("Stampo il valore di varScopeMetodo: " + varScopeMetodo);

		//System.out.println(varScopeBlocco); fuori dal blocco dell'if la variabile varScopeBlocco non e'
		// visibile
	}

}
