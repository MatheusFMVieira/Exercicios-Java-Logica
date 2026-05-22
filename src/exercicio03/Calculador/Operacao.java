package exercicio03.Calculador;

public abstract class Operacao {
    private int a;
    private int b;


    public Operacao(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract void calcular();

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
