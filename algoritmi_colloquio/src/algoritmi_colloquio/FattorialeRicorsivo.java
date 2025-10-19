package algoritmi_colloquio;

/*
 * Il fattoriale di un numero serve per calcolare il prodotto di tutti i numeri interi positivi fino a quel numero.
 * 
 * Si indica con il punto esclamativo (!).
 * Per esempio:
 * 5! = 5×4×3×2×1=120
 * 4! = 4×3×2×1=24
 * 3!=3×2×1=6
 * 1!=1
 * E per convenzione, 0!=1
 * 
 * In pratica, il fattoriale serve per contare quante possibili combinazioni o permutazioni ci sono in certi problemi matematici o informatici 
 * (come disporre oggetti in tutti i modi possibili).
 * Esempio: se ci sono 3 libri diversi e si vogliono mettere in ordine su uno scaffale, ci sono
 * 3!=3×2×1 = 6 modi diversi per farlo.
 */

public class FattorialeRicorsivo {
	
	public static int fattoriale(int numero) {
		if(numero == 1) {
			return 1;
		}else {
			return numero * fattoriale(numero-1);
		}
	}


	public static void main(String[] args) {
		
		int numero = 3;
		
		System.out.println("Il fattoriale di " + numero + " e' " + fattoriale(numero));
		
	}

}
