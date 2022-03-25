package br.com.fundamentos;

import java.util.Arrays;
import java.util.Scanner;

public class AccountTeste {
    public static void main(String[] args) {

        // Cria um objeto Scanner para obeter a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Cria um objeto Account e atribui a variavel account
        Account account1 = new Account("Alciliano", 50.0);
        Account account2 = new Account("Mirian", -17.0);

        // exibe o valor inicial de getNome()
        System.out.printf("Name is %s and the balance is %.2f.%n", account1.getNome(), account1.getBalance());
        System.out.printf("Name is %s and the balance is %.2f.%n", account2.getNome(), account2.getBalance());


        System.out.print("Enter deposit amount for account1: ");
        double amount = scanner.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n", amount);
        System.out.println("-------------------------------------------------------------------");
        account1.deposit(amount);
        System.out.printf("Name is %s and the balance is %.2f.%n", account1.getNome(), account1.getBalance());


        System.out.print("Enter deposit amount for Account2: ");
        amount = scanner.nextDouble();

        System.out.println("-------------------------------------------------------------------");
        account2.deposit(amount);
        System.out.printf("Name is %s and the balance is %.2f.%n", account2.getNome(), account2.getBalance());
    }
}
