package algoritmi_colloquio;

public class Max1Max2Array {
	
	public static int[] trovaPrimiDueMassimi(int[] arr) {
		
		int primoMassimo = Integer.MIN_VALUE;
		int secondoMassimo = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++){
			
			if(arr[i] > primoMassimo) {
				secondoMassimo = primoMassimo;
				primoMassimo = arr[i];
			}else if(arr[i] > secondoMassimo && arr[i] < primoMassimo) {
				secondoMassimo = arr[i];
			}
			
		}
		int[] maxValue = {primoMassimo, secondoMassimo};
		return maxValue;
 		
	} 

	public static void main(String[] args) {
		int[] numeri = {3, 58, 10, 1000, 421, 675, 31, 90};
		int[] maxValue = trovaPrimiDueMassimi(numeri);
		
		System.out.println("Primo massimo = " + maxValue[0]);
		System.out.println("Secondo massimo = " + maxValue[1]);

	}

}

