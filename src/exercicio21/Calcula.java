package exercicio21;

public class Calcula {
    private int a;
    private int b;

    public Calcula(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int quociente(){
        if(b == 0){
            System.out.println("Não é possível dividir por zero");
            return 0;
        }
        int quociente = a / b;
        return quociente;
    }

    public int resto(){
        if(b == 0){
            System.out.println("Não é possível dividir por zero");
            return 0;
        }
        int resto = a % b;
        return resto;
    }

    public void imprime(){
        System.out.println("Quociente: " + quociente());
        System.out.println("Resto: " + resto());
    }
}
