package fixacaoPOO.exercicioFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Employee employee = new Employee();
		Scanner input = new Scanner(System.in);

		System.out.print("Name: ");
		employee.name = input.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = input.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = input.nextDouble();

		System.out.println("");
		System.out.println("Employee: " + employee.name + ", $ %.2f" + employee.netSalary());
		System.out.println("");
		
		System.out.printf("Which percentage to increase salary? ");
		double percentage = input.nextDouble();
		employee.IncreaseSalary(percentage);

		System.out.println("");
		System.out.println("Updated data: " + employee.name + ", $ %.2f" + employee.netSalary());

		input.close();
	}
}
