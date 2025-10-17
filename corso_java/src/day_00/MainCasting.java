package day_00;

class Animale {
    void verso() {
        System.out.println("L'animale emette un verso.");
    }
}

class Cane extends Animale {
    void verso() {
        System.out.println("Il cane abbaia: Woof!");
    }
    
    void scodinzola() {
        System.out.println("Il cane scodinzola.");
    }
}

public class MainCasting {
    public static void main(String[] args) {
        
        // --- UPCASTING ---
        Cane cane = new Cane();
        Animale a1 = cane;  // upcasting (automatico)
        
        System.out.println("Upcasting:");
        a1.verso();   // chiama il metodo di Cane (polimorfismo)
        // a1.scodinzola(); // ERRORE: per il compilatore è solo un Animale
        
        
        // --- DOWNCASTING CORRETTO ---
        Animale a2 = new Cane(); // oggetto è davvero un Cane
        Cane c2 = (Cane) a2;     // downcasting esplicito
        System.out.println("\nDowncasting corretto:");
        c2.verso();
        c2.scodinzola();
        
        
        // --- DOWNCASTING ERRATO ---
        Animale a3 = new Animale(); // oggetto è un Animale puro
        try {
            Cane c3 = (Cane) a3;  // forzatura sbagliata
            c3.scodinzola();
        } catch (ClassCastException e) {
            System.out.println("\nDowncasting errato:");
            System.out.println("Errore: " + e);
        }
        
        
        // --- DOWNCASTING SICURO CON instanceof ---
        Animale a4 = new Animale();
        System.out.println("\nDowncasting con instanceof:");
        if (a4 instanceof Cane) {
            Cane c4 = (Cane) a4;
            c4.scodinzola();
        } else {
            System.out.println("a4 non è un Cane, non faccio il cast!");
        }
    }
}
