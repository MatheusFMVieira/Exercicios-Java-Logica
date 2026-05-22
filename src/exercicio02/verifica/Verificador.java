package exercicio02.verifica;

public class Verificador {
    int x;

    public Verificador(int x) {
        this.x = x;
    }

    public void parOuImpar(){
        if(x % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }
    
    public void positivoOuNegativo(){
        if (x > 0) {
            System.out.println("Positivo");
        }else if(x < 0){
            System.out.println("Negativo");
        }else {
            System.out.println("Zero");
        }
    }
}
