package day_00_esercizioPunto;

public class Segmento{
	   Punto p1;
	   Punto p2;
	   
	   public Segmento(){
	        super();
	    }

	    public Segmento(Punto aP1, Punto aP2){
	        this.p1=aP1;
	        this.p2=aP2;
	    }
	    
	    public Punto getP1(){
	        return p1;
	    }
	    
	    public void setP1(Punto aP1){
	        this.p1=aP1;
	    }
	    
	    public Punto getP2(){
	        return p2;
	    }
	    
	    public void setP2(Punto aP2){
	        this.p2=aP2;
	    }
	    
	      
	    public String toString(){
	        return "Segmento [" + p1 +", " + p2 +"]";
	    }
	}