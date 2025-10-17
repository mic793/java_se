package day_12;

import javax.swing.JOptionPane;

public class ReverseString{
	
	public static void main(String argv[]) {
    	// Finestra di input: chiede all’utente una frase
    	String stringa = JOptionPane.showInputDialog(null, "Inserisci una frase");
   	 
    	// Elimina eventuali spazi all’inizio e alla fine
    	stringa = stringa.trim();
   	 
    	// Variabile che conterrà la stringa invertita
    	String inversa = "";
   	 
    	// Ciclo che parte dall’ultimo carattere e arriva al primo
    	for (int i = stringa.length() - 1; i >= 0; i--) {
        	inversa = inversa + stringa.charAt(i);
    	}
   	 
    	// Finestra di output: mostra la frase invertita
    	JOptionPane.showMessageDialog(null, inversa);
	}
}




