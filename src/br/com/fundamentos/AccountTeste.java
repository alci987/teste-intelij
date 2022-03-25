package br.com.fundamentos;

import java.util.Scanner;

public class AccountTeste {
    public static void main(String[] args) {

        // Cria um objeto Scanner para obeter a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Cria um objeto Account e atribui a variavel account
        Account account = new Account();

        // exibe o valor inicial de getNome()
        System.out.printf("Initical name is %s.%n%n", account.getNome());
        System.out.print("Please, enter the name: ");
        String theName = scanner.nextLine(); // lê o que o usuário digita
        account.setNome(theName);  // atribui o que foi digitado à variável account
        System.out.println();


        System.out.println("Nome: " + account.getNome());
    }
}
