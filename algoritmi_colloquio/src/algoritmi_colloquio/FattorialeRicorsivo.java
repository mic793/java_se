package algoritmi_colloquio;

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
