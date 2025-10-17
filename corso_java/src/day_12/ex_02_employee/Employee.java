package day_12.ex_02_employee;

public class Employee {
	
	private String nome;
	private double stipendio;
	
	public Employee() {
		
	};
	
	public Employee(String nome, double stipendio) {
		this.nome = nome;
		this.stipendio = stipendio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Employee [nome=" + nome + ", stipendio=" + stipendio + "]";
	}

	
}
