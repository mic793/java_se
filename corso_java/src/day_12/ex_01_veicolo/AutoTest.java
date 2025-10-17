package day_12.ex_01_veicolo;

public class AutoTest {

	public static void main(String[] args) {
			
		Auto panda = new Auto();
		Auto ferrari = new Auto();
		                    //String targa, String modello, String marca, String numeroPosti, double serbatoio, double consumo
		Auto mercedes = new Auto("IL 789 MN", "Classe A", "Mercedes", "5", 0, 0.095);
		Auto bmw = new Auto("OP 901 QR", "M3", "BMW", "5", 0, 0.098);
		//panda.targa = "AB 123 CD";
		//ferrari.targa = "EF 456 GH";
		
		panda.setTarga("AB 123 CD");//definizione: "AB 123 CD" viene definito parametro attuale del metodo
		ferrari.setTarga("EF 456 GH");
		
		//System.out.println("Targa panda: " + panda.getTarga());
		//System.out.println("Targa ferrari " + ferrari.getTarga());
		
		//panda.modello = "Nuova Panda";
		//ferrari.modello = "F50";
		
		panda.setModello("Nuova Panda");
		ferrari.setModello("F50");
		
		//System.out.println("Modello panda: " + panda.getModello());
		//System.out.println("Modello ferrari: " + ferrari.getModello());
		
		//panda.marca = "Fiat";
		//ferrari.marca = "Ferrari";
		
		panda.setMarca("Fiat");
		ferrari.setMarca("Ferrari");
		
		//System.out.println("Marca panda: " + panda.getTarga());
		//System.out.println("Marca Ferrari: " + ferrari.getTarga());
		
		//panda.numeroPosti = "5";
		//ferrari.numeroPosti = "2";*/
		
		panda.setNumeroPosti("5");
		ferrari.setNumeroPosti("2");
		
		//System.out.println("Numero posti: " + panda.getNumeroPosti());
		//System.out.println("Numero posti: " + ferrari.getNumeroPosti());
		
		System.out.println(panda.toString());
		System.out.println(ferrari);//se inserisco il riferimento all'oggetto come paramentro della syso viene chiamato di default il toString come sopra.
		System.out.println(mercedes.toString());
		System.out.println(bmw.toString());
		
		bmw.setTarga("ZY 123 CV");//bmw.targa = "ZY 123 CV";
		System.out.println(bmw.toString());
		
		
		/*
		 * Controller control = new Controller(); control.drive(panda, 10);
		 */
		 bmw.setSerbatoio(10);//rifornisco la bmw di 10litri di carburante
		
		System.out.println(Controller.drive(bmw, 5));//percorro con la bmw 5km
	}

}
