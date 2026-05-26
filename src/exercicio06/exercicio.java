package exercicio06;

public class exercicio {
    public static void main(String[] args) {
        CalculaAjuste calc = new CalculaAjuste(1000);
        Impressora imp = new Impressora();

        double ajustado = calc.ajusta();
        imp.imprimir(ajustado);
    }
}
