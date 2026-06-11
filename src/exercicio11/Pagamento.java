package exercicio11;

public class Pagamento {
    private double valorProduto;
    private int codigoPagamento;

    public Pagamento(double valorProduto, int codigoPagamento) {
        this.valorProduto = valorProduto;
        this.codigoPagamento = codigoPagamento;
    }

    public double calcularValorFinal(){
        switch (codigoPagamento) {
            case 1:
                return valorProduto * 0.85;
            case 2:
                return valorProduto * 0.90;
            case 3:
                return valorProduto;
            default:
                throw new IllegalArgumentException("Código de pagamento inválido");
        }
    }

    @Override
    public String toString() {
        return "Pagamento: " + calcularValorFinal();
    }
}
