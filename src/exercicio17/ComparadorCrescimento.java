package exercicio17;

public class ComparadorCrescimento {
    private double alturaPessoa01;
    private double alturaPessoa02;

    public ComparadorCrescimento(double alturaPessoa01, double alturaPessoa02) {
        this.alturaPessoa01 = alturaPessoa01;
        this.alturaPessoa02 = alturaPessoa02;
    }

    public int calcularAnos(){
        int anos = 0;

        while (alturaPessoa02 <= alturaPessoa01) {
            alturaPessoa01 += 0.02;
            alturaPessoa02 += 0.03;
            anos++;
        }
        return anos;
    }
}
