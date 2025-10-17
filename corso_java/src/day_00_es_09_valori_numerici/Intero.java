package day_00_es_09_valori_numerici;

import java.util.Scanner;

public class Intero implements Numero{
	private int v;
	
	public Intero() {
		super();
	}
	
	public Intero(int aV) {
		this.v = aV;
	}
	
	public int getV() {
		return v;
	}
	
	public void setV(int aV) {
		this.v = aV;
	}
	
	@Override
	public double valore() {
		return v;
	}
	
	@Override
	public String stampa() {
		return Integer.toString(v);
	};
	
	//metodo per verificare se il numero e' divisibile
	public boolean estd(int aV) {
		if(this.v % aV == 0) {
			return true;
		}
		return false;		
	}
	
	@Override
	public String toString() {
		return "Intero [valore = " + v + "]";
	}
	
}
