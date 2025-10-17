package day_00;

public class EsponenzialeRicorsivo {

    // Metodo ricorsivo per calcolare la potenza
    public static int exponentRicorsivo(int n, int exp) {
        if (exp < 2) {
            return n;
        } else {
            return n * exponentRicorsivo(n, exp - 1);
        }
    }

    // Metodo per costruire la stringa della moltiplicazione
    public static String toStringExp(int n, int exp) {
        StringBuilder stringa = new StringBuilder();
        for (int i = 0; i < exp - 1; i++) {
            stringa.append(n).append(" * ");
        }
        stringa.append(n).append(" = ");
        return stringa.toString();
    }

    public static void main(String[] args) {
        int number = 5;
        int exp = 2;

        System.out.print(toStringExp(number, exp));
        System.out.println(exponentRicorsivo(number, exp));
    }
}

