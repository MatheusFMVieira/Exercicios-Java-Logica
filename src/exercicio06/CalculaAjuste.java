package exercicio06;

public class CalculaAjuste {
    private double valor;

    public CalculaAjuste(double valor) {
        this.valor = valor;
    }
    
    public double ajusta(){
        valor *= 1.05;
        return valor;
    }
}
