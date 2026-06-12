package exercicio13;

public class TrocadorValores {
    private int valorA;
    private int valorB;

    public TrocadorValores(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public void trocadorValores(){
        int aux;
        aux = valorA;
        valorA = valorB;
        valorB = aux;
    }

    public void exibir(){
        System.out.println(valorA);
        System.out.println(valorB);
    }
}
