package algoritmi_colloquio;

public class MoltiplicaRicorsivo {
	
	public static int moltiplica(int a , int b) {
		
		if(a == 0 || b == 0) {
			return 0;
		}
		return a + moltiplica(a, b-1);
		//quando viene richiamato:
				// moltiplica(5, 3)
				// a e b != 0
				// return 5 + moltiplica(5, 2) = 5 + 10 = 15
				// moltiplica(5, 2)
				// a e b != 0
				// return 5 + moltiplica(5, 1) = 5 + 5 = 10
				// moltiplica(5, 1)
				// a e b != 0
				// return 5 + moltiplica(5, 0) = 5 + 0 = 5
				// moltiplica(5, 0) = 0
				// a !=0 b = 0
		
	}

	public static void main(String[] args) {

	int a = 5;
	int b = 3;
	System.out.println(a + " X "+ b + " = " + moltiplica(a, b));

	}

}
