package br.com.fundamentos;

import javax.swing.*;

public class UsandoJOptionPane {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Informe seu nome:");
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser depsitado: "));
        String message = String.format("Bem vindo %s, seu novo saldo é de: R$%.2f", name, balance);
        Account account = new Account(name, balance);
        JOptionPane.showMessageDialog(null, message);

    }
}
