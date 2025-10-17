package day_00_esercizioPunto;

/**
 * Aggiungi qui una descrizione della classe Punto
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public abstract class Punto{
    private float x, y, z;
    
    public Punto(){
    super();
}

    public Punto(float aX, float aY, float aZ){
    	this.x=aX;
        this.y=aY;
        this.z=aZ;
    }
    
    public float getX(){
        return x;
    }
    
    public void setX(float aX){
        this.x=aX;
    }
    
     public float getY(){
        return y;
    }
    
    public void setY(float aY){
        this.y=aY;
    } 
    
    public float getZ(){
        return z;
    }
    
    public void setZ(float aZ){
        this.z=aZ;
    }
    
    @Override
    public String toString(){
        return "x = " + this.x + ", y = " + this.y + ", z = " + this.z;
    }

}



