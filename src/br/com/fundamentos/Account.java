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

    // método que deposita apenas quantia válida
    public void deposit(double depositAmount){
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
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

    /*public void setBalance(double balance) {
        this.balance = balance;
    }*/
}
