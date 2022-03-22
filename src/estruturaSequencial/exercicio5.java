package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int codigoPeca1 = sc.nextInt();
		int numeroPecas1 = sc.nextInt();
		double valorPecas1 = sc.nextDouble();

		int codigoPeca2 = sc.nextInt();
		int numeroPecas2 = sc.nextInt();
		double valorPecas2 = sc.nextDouble();

		double total = numeroPecas1 * valorPecas1 + numeroPecas2 * valorPecas2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		sc.close();
	}
}
