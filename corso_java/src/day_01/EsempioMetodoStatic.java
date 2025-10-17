package day_01;

public class EsempioMetodoStatic {

    // metodo statico
    public static void saluta() {
        System.out.println("Ciao, questo è un metodo static!");
    }

    public static void main(String[] args) {
        // richiamo diretto perché main è static
        saluta();

        // richiamo tramite nome della classe
        EsempioMetodoStatic.saluta();
    }
}

//il metodo statico si può chiamare direttamente con il nome della classe.

//il metodo non statico richiede la creazione di un oggetto con new.

