package exercicio19;

public class Tabuada {
    private int num;

    public Tabuada(int num) {
        this.num = num;
    }

    public void contaTabuada(){
        for(int i = 0; i <= 10; i++){
            int v = num * i;
            System.out.println("Tabuada: " + num + " x " + i + " = " + v);
        }
    }
}
