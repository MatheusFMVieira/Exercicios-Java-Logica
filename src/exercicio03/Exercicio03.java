package exercicio03;

import exercicio03.Calculador.Calculador;
import exercicio03.impressoras.Impressora;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, 
            caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
            imprimir seu valor na tela.
        */
       Calculador calculador = new Calculador(2, 2);
       Impressora impressora = new Impressora();
       calculador.calcular();
       impressora.imprimir(calculador.getResultado());

    }
}
