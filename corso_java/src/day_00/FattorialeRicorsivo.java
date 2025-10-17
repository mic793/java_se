package day_00;

import java.util.Scanner;

public class FattorialeRicorsivo {

    // Metodo ricorsivo 9*8*7*6*5*4*3*2*1
    public static long fattorialeRicorsivo(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * fattorialeRicorsivo(n - 1);
        }
    }
    //return 9 * fattorialeRicorsivo(9 - 1) = 9 * 8 * 7 * 5 * 24
    //return 8 * fattorialeRicorsivo(8 - 1) = 8 * 7 * 5 * 24
    //return 7 * fattorialeRicorsivo(7 - 1) = 7 * 5 * 24
    //return 6 * fattorialeRicorsivo(6 - 1) = 6 * 5 * 24
    //return 5 * fattorialeRicorsivo(5 - 1) = 5 * 24
    //return 4 * fattorialeRicorsivo(4 - 1) = 4 * 6 
    //return 3 * fattorialeRicorsivo(3 - 1) = 3 * 2
    //return 2 * fattorialeRicorsivo(2 - 1) = 2 * 1
    //return 1 

    // Metodo iterativo
	/*
	 * public static long fattorialeIterativo(int n) { long fattoriale = 1; while (n
	 * > 0) { fattoriale *= n; n--; } return fattoriale; }
	 */

    // Metodo per costruire la stringa esplicativa
    public static String stringFattoriale(int numero) {
        StringBuilder stringa = new StringBuilder(numero + "! = ");
        for (int i = numero; i > 1; i--) {
            stringa.append(i).append(" * ");
        }
        stringa.append("1 = ");
        return stringa.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input da tastiera
        System.out.print("Inserire un numero intero per il calcolo del fattoriale: ");
        int numero = scanner.nextInt();//9

        long risultatoRicorsivo = fattorialeRicorsivo(numero);
       //long risultatoIterativo = fattorialeIterativo(numero);

        // Output
        System.out.println(stringFattoriale(numero) + risultatoRicorsivo);
        // Se vuoi vedere anche la versione iterativa
        //System.out.println("Versione iterativa: " + risultatoIterativo);

        scanner.close();
    }
}

