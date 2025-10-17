package day_00;

public class OperatoriLogici {

    public static void main(String[] args) {
        boolean condizione1 = true;
        boolean condizione2 = false;

        // Operatori logici AND, OR, NOT
        boolean risultatoAnd = condizione1 && condizione2;  // AND logico
        boolean risultatoOr = condizione1 || condizione2;   // OR logico
        boolean risultatoNot1 = !condizione1;               // NOT logico su condizione1
        boolean risultatoNot2 = !condizione2;               // NOT logico su condizione2

        System.out.println("Condizione1 AND Condizione2: " + risultatoAnd);
        System.out.println("Condizione1 OR Condizione2: " + risultatoOr);
        System.out.println("NOT Condizione1: " + risultatoNot1);
        System.out.println("NOT Condizione2: " + risultatoNot2);
    }
}
