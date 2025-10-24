package day_00;

import java.util.Scanner;

public class LineInputWithIntegerWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        String inputLine = scanner.nextLine();

        try {
            int number = Integer.parseInt(inputLine);//Conversione della stringa in intero
            System.out.println("Hai inserito il numero intero: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Input non valido. Assicurati di inserire un numero intero.");
        }

        scanner.close();
    }
}
