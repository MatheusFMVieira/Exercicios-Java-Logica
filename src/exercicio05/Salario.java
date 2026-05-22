package exercicio05;

public class Salario {
    private double salarioUser;
    private final double salarioMin;

    public Salario(double salarioUser) {
        this.salarioUser = salarioUser;
        this.salarioMin = 1293.20;
    }

    public double getSalarioUser() {
        return salarioUser;
    }

    public void setSalarioUser(double salarioUser) {
        this.salarioUser = salarioUser;
    }

    public double getSalarioMin() {
        return salarioMin;
    }
}
