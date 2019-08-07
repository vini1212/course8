package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char first = sc.next().charAt(0);
		
		if (first == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			Account conta = new Account(account, name, initialDeposit);
			
			System.out.println();
			
			System.out.println("Account data: ");
			System.out.print(conta.toString());
			
			System.out.println();
			System.out.println();
			
			System.out.print("Enter a deposit value: ");
			double money = sc.nextDouble();
			conta.depositValue(money);
			
			System.out.println("Updated data: ");
			System.out.print(conta.toString());
			
			System.out.println();
			System.out.println();
			
			System.out.print("Enter a withdraw value: ");
			money = sc.nextDouble();
			conta.withdrawValue(money);
			
			System.out.println();
			
			System.out.println("Updated data: ");
			System.out.print(conta.toString());
			
		}
		
		else {
			Account conta = new Account(account, name);
			
			System.out.println();
			
			System.out.println("Account data: ");
			System.out.print(conta.toString());
			
			System.out.println();
			System.out.println();
			
			System.out.print("Enter a deposit value: ");
			double money = sc.nextDouble();
			conta.depositValue(money);
			
			System.out.println("Updated data: ");
			System.out.print(conta.toString());
			
			System.out.println();
			System.out.println();
			
			System.out.print("Enter a withdraw value: ");
			money = sc.nextDouble();
			conta.withdrawValue(money);
			
			System.out.println("Uptade data: ");
			System.out.print(conta.toString());
			
		}
		
		sc.close();
	}

}
