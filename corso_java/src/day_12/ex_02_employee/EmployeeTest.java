package day_12.ex_02_employee;

public class EmployeeTest {

	public static void main(String[] args) {
		//String nome, double stipendio
		Employee paoloRossi = new Employee("Paolo Rossi", 15000.10); 
		// new crea un nuovo oggetto in memoria e restituisce il riferimento ad esso
		Employee paolaBianchi = new Employee("Paola Bianchi", 16000.80);
		
		System.out.println(paoloRossi);
		System.out.println(paolaBianchi.toString());
	}

}
