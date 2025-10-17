package algoritmi_colloquio;

public class InvertiArray {
	
	public static void inverti(int[] arr) {
		int i = 0;
		int j = arr.length -1;
		while(i<j) {
			swap(i, j, arr);
			i++;
			j--;
		}
	}
	
	public static void swap(int i, int j, int[] arr) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
		
	}
	
	public static String printArray(int[] arr) {
		for(int num : arr) {
			System.out.print(num + " ");
		}
		return "";		
	}

	public static void main(String[] args) {
        int[] numeri= {0,1,2,3,4,5,6,7,8,9};
        System.out.println(printArray(numeri) + "Array di partenza");        
        inverti(numeri);
        System.out.println();
        System.out.println(printArray(numeri) + "Array invertito");
        
	}

}
