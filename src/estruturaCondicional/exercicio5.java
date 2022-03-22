package estruturaCondicional;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco;
		
		if (codigo == 1) {
			preco = 4 * quantidade;
		} else if (codigo == 2) {
			preco = 4.50 * quantidade;
		} else if (codigo == 3) {
			preco = 5 * quantidade;
		} else if (codigo == 4) {
			preco = 2 * quantidade;
		} else {
			preco = 1.50 * quantidade;
		}
		
		System.out.printf("Total: R$ %.2f%n", preco);
		
		sc.close();
	}
}
