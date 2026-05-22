package exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /* 
        1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
        */
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite os valors(a,b,c): ");
        System.out.print("A: ");
        a = sc.nextInt();
        System.out.print("B: ");
        b = sc.nextInt();
        System.out.print("C: ");
        c = sc.nextInt();

        int soma = a + b;

        System.out.println("Soma(a + b): " + soma);

        if(soma > c){
            System.out.println("A soma de a + b é maior que c");
        }else if(soma < c){
            System.out.println("A soma de a + b é menor que C");
        }else {
            System.out.println("A soma de a + b é igual a c");
        }

        sc.close();
    }
}
