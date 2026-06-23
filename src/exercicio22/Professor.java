package exercicio22;

public class Professor {
    private double valorHora;
    private int numeroAulas;
    private double percentualINSS;

    public Professor(double valorHora, int numeroAulas, double percentualINSS2) {
        this.valorHora = valorHora;
        this.numeroAulas = numeroAulas;
        this.percentualINSS = percentualINSS2;
    }

    public double calcularSalarioBruto(){
        return valorHora * numeroAulas;
    }

    public double calcularDescontoINSS(){
        return calcularSalarioBruto() * (percentualINSS / 100);
    }

    public double calcularSalarioLiquido(){
        return calcularSalarioBruto() - calcularDescontoINSS();
    }

    @Override
    public String toString() {
        return "Sálario bruto: R$ " + calcularSalarioBruto() +
                "\nDesconto INSS: R$ " + calcularDescontoINSS() +
                "\nSalário liquido: R$ " + calcularSalarioLiquido();
    }

    
}
