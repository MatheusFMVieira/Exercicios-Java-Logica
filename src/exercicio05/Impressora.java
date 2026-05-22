package exercicio05;

public class Impressora {
    double salarioMin;
    double salarioUsr;
    double qtdSalarios;

    public Impressora(double salarioMin, double salarioUsr, double qtdSalarios) {
        this.salarioMin = salarioMin;
        this.salarioUsr = salarioUsr;
        this.qtdSalarios = qtdSalarios;
    }

    public void imprimir(){
        System.out.printf("Valor do sálario minimo: %.2f%n", salarioMin);
        System.out.printf("Sálario usuário: %.2f%n", salarioUsr);
        System.out.printf("Quantidade de salários: %.2f%n", qtdSalarios);
    }
}
