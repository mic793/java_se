package day_12.ex_03_employee_salary;

import day_12.ex_02_employee.Employee;

public class EmployeeController {
	
	public static void raiseSalary(Employee empl, double byPercent) {
		double stipendio = empl.getStipendio();
		double stipendioIncrementato = stipendio + stipendio * byPercent;
		empl.setStipendio(stipendioIncrementato);
	}
}
