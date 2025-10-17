package day_12;

import javax.swing.*;

public class ProvaEndsWith {

	public static void main(String argv[]) {
    	// Chiede all'utente di inserire un nome di file
    	String file = JOptionPane.showInputDialog(null, "Inserisci il nome di un file java valido");

    	// Controlla se la stringa inserita termina con ".java"
    	if (file.endsWith(".java"))
        	JOptionPane.showMessageDialog(null, "Il nome del file è valido");
    	else
        	JOptionPane.showMessageDialog(null, "Il nome del file non termina con .java");
	}
}

