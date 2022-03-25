package br.com.fundamentos;

import org.w3c.dom.ls.LSOutput;

public class CriandoArrays {
    public static void main(String[] args) {
        int[] a = new int[10];
        // atribuido o dobro do valor ao array a
        for (int i = 0; i < a.length; i++) {
            a[i] = 2 + 2 * i;
        }

        System.out.println("Mostrando o dobro do valor");
        System.out.printf("%s %8s %n", "Indice", "Valor");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%5d %8d %n", i, a[i]);
        }

        int[] b = {10, 34, 5, 65, 99, 16, 73, 88, 59, 10};
        System.out.println("Mostrando um array aleatório");
        System.out.printf("%s %8s %n", "Index", "Value");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%5d %8d %n", i, b[i]);
        }
        // criando vários arrays na mesma linha
        String[] c = new String[100], x = new String[27];
    }


}
