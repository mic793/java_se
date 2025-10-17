package day_00_es_09_valori_numerici;

public class Test {
    public static void main(String[] args) {
        // Numeri
        Intero i1 = new Intero(6);
        Intero i2 = new Intero(4);
        Frazione f1 = new Frazione(3, 5);
        Frazione f2 = new Frazione(7, 2);

        // Operazioni
        Operazione somma      = new Operazione(i1, f1, '+'); // 6 + 3/5
        Operazione differenza = new Operazione(f2, i2, '-'); // 7/2 - 4
        Operazione prodotto   = new Operazione(i2, f1, '*'); // 4 * 3/5
        Operazione divisione  = new Operazione(f2, f1, '/'); // (7/2) / (3/5)

        // Stampa richiesta: forma “op1opop2” e valore
        System.out.println(somma.stampa()      + " = " + somma.valore());
        System.out.println(differenza.stampa() + " = " + differenza.valore());
        System.out.println(prodotto.stampa()   + " = " + prodotto.valore());
        System.out.println(divisione.stampa()  + " = " + divisione.valore());
    }
}

