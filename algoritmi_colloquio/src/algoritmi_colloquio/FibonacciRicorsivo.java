package algoritmi_colloquio;

public class FibonacciRicorsivo {

	static int n = 5;

	public static int fibonacci(int x) {
		if (x < 2) {
			return 1;
		} else {
			return fibonacci(x - 1) + fibonacci(x - 2);
		}

		// x=3, voglio calcolare il terzo numero di fibonacci
		// fibonacci(3 - 1) + fibonacci (3 - 2) prima ricorsione
		// fibonacci(2 - 1) + fibonacci (1) restituisce 1 seconda ricorsione
		// fibonacci(1) + 1 = 1+1 = 2 terza ricorsione
	}

	public static void main(String[] args) {
		String successione = "";
		for (int i = 0; i < n; i++) {
			successione = successione + fibonacci(i) + "\t";
		}
		System.out.println("Successione di fibonacci ricorsivo: " + successione);
	}
	
}
