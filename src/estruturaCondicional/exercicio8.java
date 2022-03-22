package estruturaCondicional;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double renda = sc.nextDouble();
		double taxa = 0;

		if (renda <= 2000) {
			System.out.println("Isento");
		} else if (renda <= 3000) {
			taxa = (renda - 2000.0) * 0.08;
		} else if (renda <= 4500) {
			taxa = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			taxa = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (taxa > 0) {
			System.out.printf("R$ %.2f%n", taxa);
		}

		sc.close();
	}
}
