package day_00;

public class Cast{
	
	public static void main(String[] args) {
		        
		//CAST IMPLICITO -- spreco di memoria ma non perdita di informazioni
        byte b = 1; //e' rappresentato da 00000001
        short s = b;//e' rappresentato da 00000000 00000001
        int i = s; // e' rappresentato da 00000000 00000000 00000000 00000001
        long l = i;// e' rappresentato da 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001  
        /*
         * la conversione implicita da long a float è permessa perché è una widening primitive conversion in senso di intervallo di valori: 
         * tutto l’intervallo di long (≈ ±9.22·10^18) rientra nell’intervallo rappresentabile da float (≈ ±3.40·10^38). 
         * Quindi non c’è rischio di overflow verso Infinity.
         * 
         */
        float f = l;//e' rappresentato da 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
        double d = f;//e' rappresentato da 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
        
        
        
        //CAST ESPLICITO -- ci potrebbe essere perdita di informazioni nel caso in cui si perde qualche informazione significativa
        f = (float)d;//e' rappresentato da 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
        l = (long)f;//e' rappresentato da 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
        i = (int)l;//e' rappresentato da 00000000 00000000 00000000 00000001
        s = (short)i;//e' rappresentato da 00000000 00000001
        b = (byte)s;//e' rappresentato da 00000001
        System.out.println("Il valore della variabile: " + b);
        
    }
}

