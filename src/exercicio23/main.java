package exercicio23;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo da viagem (horas): ");
        double tempo = sc.nextDouble();

        System.out.print("Digite a velocidade média (km/h): ");
        double velocidade = sc.nextDouble();

        Viagem viagem = new Viagem(tempo, velocidade);

        double distancia = viagem.calcularDistancia();
        double litros = viagem.calcularLitros();

        System.out.println("\n--- Resultado da Viagem ---");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros consumidos: " + litros + " L");

        sc.close();
    }
}