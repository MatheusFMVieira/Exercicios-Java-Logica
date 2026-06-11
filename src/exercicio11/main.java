package exercicio11;

public class main {
    public static void main(String[] args) {
        Pagamento pg = new Pagamento(100, 2);
        pg.calcularValorFinal();
        System.out.println(pg);
    }
}
