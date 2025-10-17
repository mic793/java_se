package day_01;

public class ContatoreVariabileStatic {

    // variabile statica: condivisa da tutti gli oggetti
    public static int contaOggetti = 0;

    // costruttore
    public ContatoreVariabileStatic() {
        contaOggetti++; // ogni volta che si crea un oggetto, il contatore cresce
    }

    public static void main(String[] args) {
    	ContatoreVariabileStatic c1 = new ContatoreVariabileStatic();
    	ContatoreVariabileStatic c2 = new ContatoreVariabileStatic();
    	ContatoreVariabileStatic c3 = new ContatoreVariabileStatic();

        System.out.println("Numero totale di oggetti creati: " + ContatoreVariabileStatic.contaOggetti);
    }
}


//contaOggetti è statica, quindi tiene traccia del numero complessivo di oggetti creati, 
//indipendentemente dall’istanza.