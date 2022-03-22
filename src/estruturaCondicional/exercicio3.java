package estruturaCondicional;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int numero2 = sc.nextInt();
				
		if (numero % numero2 == 0 || numero2 % numero == 0) {
			System.out.println("SAO MULTIPLOS");
		} else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		
		sc.close();
	}
}
