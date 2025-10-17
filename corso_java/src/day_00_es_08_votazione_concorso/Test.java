package day_00_es_08_votazione_concorso;

public class Test {

	public static void main(String[] args) {
	
		//String aNome
		Partecipante p1 = new Partecipante("Paolo Rossi");
		Partecipante p2 = new Partecipante("Marta Neri");
		Partecipante p3 = new Partecipante("Francesca Verdi");
		Partecipante p4 = new Partecipante("Mario Gialli");
		
		
		//System.out.println(p1);
		Concorso c1 = new Concorso();
		
		Controller.iscriviPartecipante(c1, p1);
		Controller.iscriviPartecipante(c1, p2);
		Controller.iscriviPartecipante(c1, p3);
		Controller.iscriviPartecipante(c1, p4);
		
		System.out.println(c1.toString());
		
		System.out.println(Controller.aggiungiVoto(p4, 5));
		System.out.println(p4);
		
		System.out.println(Controller.aggiungiVoto(p4, 8));
		System.out.println(p4);
		
		System.out.println(Controller.vota(c1, p4, 20));
		
		System.out.println(Controller.mostraClassifica(c1));
		
		
		

	}

}
