package algoritmi_colloquio;

public class FibonacciIterativo {

	public static void fibonacciIterativo(int n) {
		int x = 1;
		int y = 0;
		int z = 0;

		//System.out.print(x + "\t");

		for (int i = 0; i < n - 1; i++) {
			z = x;
			x += y;
			y = z;
			System.out.print(x + "\t");
		}

	}

	public static void main(String[] args) {

			System.out.println("Successione di Fibonacci: ");
			fibonacciIterativo(5);
	}

}
