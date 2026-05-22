package exercicio05;

public class main {
    public static void main(String[] args) {
        CalculadoraSalario calSlr = new CalculadoraSalario(3200);
        double qtd = calSlr.qtdSalariosUser();
        Impressora imp = new Impressora(calSlr.getSalarioMin(), calSlr.getSalarioUser(), qtd);
        imp.imprimir();
    }
}
