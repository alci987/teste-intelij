package br.com.fundamentos;

public class Account {
    private String name; // variável de instância

    private double balance;

    public Account(String name, double balance) {

        this.name = name;
        if (balance > 0.0) { // Se o saldo for válido
            this.balance = balance;
        }
    }

    public void depositi(double depositAmount){
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    public Account() {

    }

    // método para pegar o nome
    public String getNome() {
        return name;
    }

    //método para definir o nome
    public void setNome(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
