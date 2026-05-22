package exercicio05;

public class CalculadoraSalario extends Salario {

    public CalculadoraSalario(double salarioUser) {
        super(salarioUser);
    }

    public double qtdSalariosUser() {
        return getSalarioUser() / getSalarioMin();
    }
}