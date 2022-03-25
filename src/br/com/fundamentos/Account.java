package br.com.fundamentos;

public class Account {
    private String name; // variável de instância

    public Account(String name) {
        this.name = name;
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
}
