package algoritmi_colloquio;

import java.util.Arrays;

/*
 * /**
* Aggiungi qui una descrizione della classe InvertiArray
* Dato un array di interi di lunghezza n scrivere un metodo che lo stampi con l'ordine descritto nell'esempio:
* int array={14,5,23,89,4,50}
* stampa: 14 50 5 4 23 89
* Ricostruisce un nuovo array (arrayOrdinato) prendendo in ordine alternato il primo e l’ultimo elemento dell’array originale, 
* poi il secondo e il penultimo, e così via (pattern “estremi alternati”).
* 
*/

public class RiordinaArray {

	public static void main(String[] args) {

		int[] array = { 14, 5, 23, 1, 89, 4, 50 };
                    //  0   1  2   3   4  5   6
		
		int[] arrayRiordinato = new int[array.length];

		int start = 0;//indice del primo elemento dell'array
		int end = array.length - 1;//indice dell'ultimo elemento dell'array
		int index = 0;

		while (start < end) {

			arrayRiordinato[index] = array[start];//arrayRiordinato[14,0,0,0,0,0,0]
			arrayRiordinato[++index] = array[end];//arrayRiordinato[14,50,0,0,0,0,0] index =1
			
													//arrayRiordinato[14,50,5,0,0,0,0]
													//arrayRiordinato[14,50,5,4,0,0,0] index =3
			
													//arrayRiordinato[14,50,5,4,23,0,0]
													//arrayRiordinato[14,50,5,4,23,89,0] index =5
			
			
			index++;// index =2 , index=3, index=4
			start++;// start = 1, start=2, start=3
			end--;// end = array.length - 2  = 5, end = array.length - 3  = 4, end = array.length - 3  = 3

		}

		if (array.length % 2 == 1) {

			arrayRiordinato[index] = array[array.length / 2];

		}

		// UTILIZZO CON CICLO FOR
		for (int i = 0; i < arrayRiordinato.length; i++) {
			System.out.print(arrayRiordinato[i] + " ");

		}

		System.out.println();
		System.out.println("**********************");
		System.out.println();

		
		// SOLUZIONE CON UTILIZZO CLASSE DI LIBRERIA ARRAYS CON METODO TOSTRING
		System.out.println("Array non ordinato: " + Arrays.toString(array));

		System.out.println("Array ordinato: " + Arrays.toString(arrayRiordinato));

	}

}
