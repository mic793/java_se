package day_12.ex_03_employee_salary;

import day_12.ex_02_employee.Employee;

public class EmployeeRaiseSalaryTest {

	public static void main(String[] args) {

		Employee paoloRossi = new Employee("Paolo Rossi", 2000.00); 
		System.out.println("Stipendio prima dell'incremento: " + paoloRossi.getStipendio());
		EmployeeController.raiseSalary(paoloRossi, 0.10);
		System.out.println("Stipendio dopo l'incremento: " + paoloRossi.getStipendio());
	}

}
