package day_17.esercizio4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;


public class Volo{
  
    private final Cliente[] posti;
    private final Deque<Cliente> attesa;
    
    
    public Volo(int aCapienzaMassima){
        this.posti = new Cliente[aCapienzaMassima];
        this.attesa = new ArrayDeque<>();
    }
    
    public Cliente[] getPosti(){
        return posti;
    }
    
    public Deque<Cliente> getAttesa(){
        return attesa;
    } 
    
    public String toString(){
        return "Volo[posti=" + Arrays.toString(posti) + ", attesa" + attesa + "]";
    }
    
       
    
}