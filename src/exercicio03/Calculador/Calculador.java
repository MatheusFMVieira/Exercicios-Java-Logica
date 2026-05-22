package exercicio03.Calculador;

public class Calculador extends Operacao implements OperacaoMatematica{
    private int c;

    public Calculador(int a, int b) {
        super(a, b);
    }

    @Override
    public void calcular() {
        if(getA() == getB()){
            c = getA() + getB();
        }else {
            c = getA() * getB();
        }
    }

    public int getResultado() {
        return c;
    }
}
