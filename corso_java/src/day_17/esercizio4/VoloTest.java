package day_17.esercizio4;

import java.util.ArrayList;
import java.util.List;

public class VoloTest {

    public static void main(String[] args) {
        
           
        Cliente marioRossi = new Cliente("Mario", "Rossi");
        Cliente lucaBianchi = new Cliente("Luca", "Bianchi");
        Cliente giuliaVerdi = new Cliente("Giulia", "Verdi");
        Cliente annaNeri = new Cliente("Anna", "Neri");
        Cliente paoloFerrari = new Cliente("Paolo", "Ferrari");
        Cliente elisaGalli = new Cliente("Elisa", "Galli");
        Cliente marcoColombo = new Cliente("Marco", "Colombo");
        Cliente francescaConti = new Cliente("Francesca", "Conti");
        Cliente davideRomano = new Cliente("Davide", "Romano");
        Cliente chiaraFontana = new Cliente("Chiara", "Fontana");
                 
    
        
        Volo voloRomaMilano = new Volo(9);
        //Volo aVolo, Cliente aCliente
        VoloController.aggiungiCliente(voloRomaMilano, marioRossi); 
        VoloController.aggiungiCliente(voloRomaMilano, lucaBianchi);
        VoloController.aggiungiCliente(voloRomaMilano, giuliaVerdi);
        VoloController.aggiungiCliente(voloRomaMilano, annaNeri);
        VoloController.aggiungiCliente(voloRomaMilano, paoloFerrari);
        VoloController.aggiungiCliente(voloRomaMilano, elisaGalli); 
        VoloController.aggiungiCliente(voloRomaMilano, marcoColombo); 
        VoloController.aggiungiCliente(voloRomaMilano, francescaConti);
        VoloController.aggiungiCliente(voloRomaMilano, davideRomano);
        VoloController.aggiungiCliente(voloRomaMilano, chiaraFontana);
        
        System.out.println(voloRomaMilano);
        
        VoloController.disdiciPrenotazione(voloRomaMilano, marioRossi);
        System.out.println(voloRomaMilano);
       
    }
    
    
}
