package exercicio04;

import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
    /*
    4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
    */
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int x = sc.nextInt();
    
    System.out.println("Sucessor: " + (x + 1));
    System.out.println("Antecessor: " + (x - 1));

    }
}
