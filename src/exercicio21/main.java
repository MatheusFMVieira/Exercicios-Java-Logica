package exercicio21;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Digite um valor para A: ");
        int a = sc.nextInt();
        System.out.print("Digite um valor para B: ");
        int b = sc.nextInt();

        Calcula c = new Calcula(a,b);

        
        c.quociente();
        c.resto();
        c.imprime();

        sc.close();
    }
}
