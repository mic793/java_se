package day_00_es_09_valori_numerici;

public class Frazione implements Numero {
    // campi: numeratore (n) e denominatore (d)
    private int n;
    private int d;
    
    public Frazione() {
    	super();
    }

    // costruttore a due argomenti 
    public Frazione(int aN, int aD) {
        if (aD == 0) {
            throw new IllegalArgumentException("Denominatore zero non ammesso");
        }
        // normalizzazione: si mantiene il denominatore sempre positivo
        if (aD < 0) {
            aN = -aN;
            aD = -aD;
        }
        this.n = aN;
        this.d = aD;
    }

    public int getN() {
        return n;
    }

    public void setN(int aN) {
        this.n = aN;
    }

    public int getD() {
        return d;
    }

    public void setD(int aD) {
        if (aD == 0) {
            throw new IllegalArgumentException("Denominatore zero non ammesso");
        }
        if (aD < 0) {
            this.n = -this.n;
            this.d = -aD;
        } else {
            this.d = aD;
        }
    }

    // true se è frazione propria: |n| < |d|
    public boolean estfp() {
        return Math.abs(n) < Math.abs(d);
    }

    // inversa della frazione (n/d -> d/n)
    public void inversa() {
        if (n == 0) {
            throw new ArithmeticException("Inversa non definita per 0/d");
        }
        int tmp = n;
        n = d;
        d = tmp;
        // si mantiene d positivo
        if (d < 0) {
            n = -n;
            d = -d;
        }
    }

    // ===== Implementazione dell'interfaccia Numero =====

    @Override
    public double valore() {
        return (double) n / (double) d;
    }

    @Override
    public String stampa() {
        return "(" + n + "/" + d + ")";
    }

    // rappresentazione testuale di supporto
    @Override
    public String toString() {
        return "Frazione [n=" + n + ", d=" + d + "]";
    }
}
