package day_00;

public class OperatoreTernario {

    public static void main(String[] args) {
        int numero = 10;
        String risultato;

        // Utilizzo dell'operatore ternario per determinare se il numero è pari o dispari
        risultato = (numero % 2 == 0) ? "pari" : "dispari";

        System.out.println("Il numero " + numero + " e' " + risultato);
    }
}


