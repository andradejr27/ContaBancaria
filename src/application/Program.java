package application;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
	
			Account acc = new Account(number, holder, balance, withdrawLimit);
	
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
		}
		catch(InputMismatchException e) {
			System.out.println("Erro! Tipo de dado digitado inv�lido!");
		}
		
		sc.close();

	}

}