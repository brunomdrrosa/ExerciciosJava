package fixacaoPOO.exercicioNotasDoAluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Student student = new Student();
		Scanner input = new Scanner(System.in);

		student.name = input.nextLine();
		student.firstSemester = input.nextDouble();
		student.secondSemester = input.nextDouble();
		student.thirdSemester = input.nextDouble();

		System.out.printf("FINAL GRADE = %.2f", student.finalGrade());
		System.out.println();
		
		student.finalResult();

		input.close();
	}
}
