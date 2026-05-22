package exercicio02;

import exercicio02.verifica.Verificador;

public class Exercicio02 {
/*
2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
*/

    public static void main(String[] args) {
        Verificador verificador = new Verificador(-21);
        verificador.parOuImpar();
        verificador.positivoOuNegativo();
    }
}
