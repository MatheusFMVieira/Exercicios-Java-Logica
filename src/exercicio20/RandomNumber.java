package exercicio20;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int n = random.nextInt(100);
        System.out.println("Número gerado: " + n);
    }
}
