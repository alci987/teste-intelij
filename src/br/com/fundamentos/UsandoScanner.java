package br.com.fundamentos;

import java.util.Scanner;

/*
* Um Scanner permiete ler dados digitados pelo usuário
* O objeto de entrada padrão System.in permite que aplicativos
* leiam bytes de informações digitadas pelo usuário. O Scanner traduz esses bytes em tipos;*/

public class UsandoScanner {
    public static void main(String[] args) {
        /* O intervalo de valores para um int é –2.147.483.648 a +2.147.483.647*/
        int num1, num2, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
        System.out.print("Digite outro número: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        // uma forma diferente de exibir o mesmo resultado
        System.out.printf("%d + %d = %d\n", num1, num2, sum); // %d é um marcador de lugar

        if (num1 == num2){
            System.out.println("Os números são iguais");
        }else{
            System.out.println("Os números são diferentes");
        }
        System.out.printf("O caractece %c tem o valor inteiro de %d", 'A', (int)'A');


    }
}
