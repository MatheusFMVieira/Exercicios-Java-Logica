package exercicio09;

public class main {
    public static void main(String[] args) {
        Imc imc = new Imc(60, 1.55);
        imc.calcularImc();
        imc.verificaCondicao();   
    }
}
