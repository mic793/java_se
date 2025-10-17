package day_00_es_ereditarieta_polimorfismo;

public class Docente extends Persona{
	
	private String materia;
	private double salario;
	
	public Docente() {
		super();
	}
	
	public Docente(String aCf, String aNome, String aCognome, String aMateria, double aSalario) {
		super(aCf, aNome, aCognome);
		this.materia = aMateria;
		this.salario = aSalario;
	}
	
	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String aMateria) {
		this.materia = aMateria;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double aSalario) {
		this.salario = aSalario;
	}
	
	@Override
	public String toString() {
		return super.toString() + " materia insegnata: " + materia + " con salario " + salario;
	}

}
