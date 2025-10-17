package dynamic_binding;

public class Test {
    public static void main(String[] args) {
        Animale a1 = new Cane();  // variabile di tipo Animale, ma oggetto Cane
        Animale a2 = new Gatto(); // variabile di tipo Animale, ma oggetto Gatto

        a1.verso(); // stampa: "Il cane abbaia: Bau Bau!"
        a2.verso(); // stampa: "Il gatto miagola: Miao!"
    }
}
