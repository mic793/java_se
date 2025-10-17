package day_00_esercizioPunto;

import day_00_esercizioPunto.PuntoColorato.Colore;

public class SegmentoTest {

	public static void main(String[] args) {
		Punto punto1 = new PuntoColorato(5, 5, 5, Colore.BLUE);
		Punto punto2 = new PuntoColorato(10, 10, 10, Colore.GREEN);

		Segmento segmento1 = new Segmento(punto1, punto2);
		//System.out.println(segmento1.toString());
		
		
		Punto punto3 = new PuntoConMassa(20, 20, 20, 55);
		Punto punto4 = new PuntoConMassa(30, 30, 30, 60);
		
		Segmento segmento2 = new Segmento(punto3, punto4);
		//System.out.println(segmento2.toString());
		
		Punto punto5 = new PuntoConMassaEVelocita(40, 40, 40, 70, 100);
		Punto punto6 = new PuntoConMassaEVelocita(50, 50, 50, 80, 150);
		
		Segmento segmento3 = new Segmento(punto5, punto6);
		//System.out.println(segmento3.toString());
		
		Punto[] punti = {punto1, punto2, punto3, punto4, punto5, punto6};
		
		for(int i = 0; i < punti.length; i++) {
			System.out.println("Punto" + (i+1) + " [ " + punti[i] + "]");
		} 
	}

}
