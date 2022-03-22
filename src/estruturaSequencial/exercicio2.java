package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		double pi = 3.14159;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();

		double area = pi * Math.pow(raio, 2);

		System.out.printf("%.4f", area);
		sc.close();
	}
}
