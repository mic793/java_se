package day_12.ex_04_assicurazione;

public class Archivio {

	public static void main(String[] args) {
		//String nome
		Cliente paoloRossi = new Cliente("Paolo Rossi");
		Cliente mariaBianchi = new Cliente("Maria Bianchi");
		
		//String numeroTarga, Cliente proprietario
		Automobile panda = new Automobile("AB 123 CD", paoloRossi);
		Automobile bmw = new Automobile("EF 456 GH", mariaBianchi);
		
		Automobile[] archivio = {panda, bmw};
					//indici		0    1
		
		for(int i = 0; i < archivio.length; i++) {
			
			System.out.println(archivio[i].toString());
		}
		//Output:
		//Automobile [numeroTarga=AB 123 CD, proprietario=Cliente [nome=Paolo Rossi]]
		//Automobile [numeroTarga=EF 456 GH, proprietario=Cliente [nome=Maria Bianchi]]
		
		for(int i = 0; i < archivio.length; i++) {
			
			System.out.println(archivio[i].getProprietario().toString());
			//Cliente [nome=Paolo Rossi]
			//Cliente [nome=Maria Bianchi]      
		}
	}
}
