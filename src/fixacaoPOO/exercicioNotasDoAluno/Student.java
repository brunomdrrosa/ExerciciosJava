package fixacaoPOO.exercicioNotasDoAluno;

public class Student {

	public String name;
	public double firstSemester;
	public double secondSemester;
	public double thirdSemester;

	public double finalGrade() {
		return firstSemester + secondSemester + thirdSemester;
	}

	public void finalResult() {
		if (finalGrade() >= 60) {
			System.out.println("PASS");
		} else {
			double missingPoints = 60 - finalGrade();

			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", missingPoints);
		}
	}

}
