package day_00;

public class EsempioShadowing {
    int x = 10; // Variabile nell'ambito della classe

    public void esempioMetodo() {
        int x = 20; // Variabile locale con lo stesso nome dell'ambito della classe
        System.out.println("Variabile locale x: " + x); // Stampa il valore della variabile locale
    }

    public static void main(String[] args) {
        EsempioShadowing esempio = new EsempioShadowing();
        System.out.println("Variabile dell'ambito della classe x: " + esempio.x);
        esempio.esempioMetodo(); // Chiama il metodo che utilizza la variabile locale
    }
}
