package day_00_es_09_valori_numerici;

/**
 * Rappresenta un’operazione aritmetica tra due Numero.
 * Operazioni ammesse: '+', '-', '*', '/'.
 */
public class Operazione implements Numero {
    private final Numero op1;
    private final Numero op2;
    private final char op;

    public Operazione(Numero aOp1, Numero aOp2, char aOp) {
        this.op1 = aOp1;
        this.op2 = aOp2;
        this.op  = aOp;
    }

    public Numero getOp1() { return op1; }
    public Numero getOp2() { return op2; }
    public char getOp()    { return op;  }

    // stampa nella forma op1opop2 (senza spazi), come da traccia
    @Override
    public String stampa() {
        return op1.stampa() + op + op2.stampa();
    }

    // calcola il valore double dell’espressione
    @Override
    public double valore() {
        double v1 = op1.valore();
        double v2 = op2.valore();
        switch (op) {
            case '+': return v1 + v2;
            case '-': return v1 - v2;
            case '*': return v1 * v2;
            case '/':
                if (v2 == 0.0) throw new ArithmeticException("Divisione per zero");
                return (double) v1 / (double) v2;
            default:
                throw new IllegalArgumentException("Operatore non valido: " + op);
        }
    }

    @Override
    public String toString() {
        return "Operazione[" + stampa() + "] = " + valore();
    }
}
