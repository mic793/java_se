package day_17.esercizio4;

import java.util.Objects;

public class Cliente{
    
    private String nome;
    private String cognome;
    
    public Cliente(){
        super();
    }
    
    public Cliente(String aNome, String aCognome){
        super();
        this.nome = aNome;
        this.cognome = aCognome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCognome(){
        return cognome;
    }
   
    
    @Override
    public int hashCode(){
        return Objects.hash(cognome, nome);
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente)obj;
        return Objects.equals(cognome, other.cognome) && Objects.equals(nome, other.nome);
        }
        
        @Override
        public String toString(){
            return "Cliente [nome=" + nome + ", cognome=" + cognome + "]";
        }
    
}