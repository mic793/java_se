package day_01;

public class Persona {
	private String nome;
	private int eta;

	public Persona(String aNome, int aEta) {
    	this.nome = aNome;
    	this.eta = aEta;
	}

	public static void main(String[] args) {
    	Persona persona1 = new Persona("Alice", 30);
    	System.out.println("Nome: " + persona1.nome);
    	System.out.println("Età: " + persona1.eta);
	}
}
