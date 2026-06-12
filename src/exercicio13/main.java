package exercicio13;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TrocadorValores tv = new TrocadorValores(10, 0);
        tv.trocadorValores();
        tv.exibir();

        sc.close();
    }
}
