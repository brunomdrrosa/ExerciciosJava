package ConstrutoresThisSobrecargaEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Account account;

		System.out.print("Enter account number: ");
		int number = input.nextInt();
		
		System.out.print("Enter account holder: ");
		input.nextLine();
		String holder = input.nextLine();
		
		System.out.print("Is there an initial deposit (Y/N)? ");
		char initialDeposit = input.next().charAt(0);
		
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositValue = input.nextDouble();
			account = new Account(number, holder, depositValue);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = input.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = input.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		input.close();
	}
}
