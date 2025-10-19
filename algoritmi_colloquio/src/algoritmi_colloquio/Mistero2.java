package algoritmi_colloquio;

/*
 * Scambiare il valore di due variabili senza variabili d'appoggio
 */
public class Mistero2 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		a = a+b;//
		b = a-b;//=(a+b)-b=a
		a = a-b;//=(a+b)-a=b
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
	}

}
