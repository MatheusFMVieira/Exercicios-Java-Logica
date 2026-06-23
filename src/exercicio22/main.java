package exercicio22;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Digite o número de aulas lecionadas: ");
        int numeroAulas = sc.nextInt();
        System.out.print("Digite o percentual do INSS descontado: ");
        double percentualINSS = sc.nextDouble();

        Professor p = new Professor(valorHora, numeroAulas, percentualINSS);

        System.out.println("---------------");
        System.out.println(p);


        sc.close();
    }
}
