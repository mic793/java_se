package day_03;


//ESERCIZIO 6
/*
 * Write a program that displays your large, centered initials made up of many identical characters on the terminal screen.
 */

public class InizialiMyName {

	public static void main(String[] args) {
		String inizialeP =
				" P  P  P\n" +
				" P     P\n" +
				" P    P\n" +
				" PPPP \n" +
				" P    \n" +
				" P    \n" +	
				" P    \n" +
				" P    \n";
		
       String inizialeR = 
               "  R   R   R \n" +
               "  R       R \n" +
               "  R       R \n" +
               "  R   R     \n" +
               "  R     R   \n" +
               "  R      R   \n" +
               "  R        R  \n" +
               "  R          R \n";
       
       System.out.println("Iniziale 'P': ");
       System.out.println(inizialeP);
       System.out.println("\nIniziale 'R':");
       System.out.println(inizialeR);

	}

}
