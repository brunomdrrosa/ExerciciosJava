package estruturaCondicional;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		if (numero >= 0 && numero <= 25) {
			System.out.printf("Intervalo [0, 25]");
		} else if (numero >= 25 && numero <= 50) {
			System.out.printf("Intervalo [25, 50]");
		} else if (numero >= 50 && numero <= 75) {
			System.out.printf("Intervalo [50, 75]");			
		} else if (numero >= 75 && numero <= 100) {
			System.out.printf("Intervalo [75, 100]");			
		} else {
			System.out.printf("Fora de intervalo");
		}		
		
		sc.close();
	}
}
