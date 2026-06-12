package exercicio15;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public boolean heValido(){
        return ladoA + ladoB > ladoC &&
               ladoA + ladoC > ladoB &&
               ladoB + ladoC > ladoA;
    }

    public void TipoTriangulo(){
        if(!heValido()){
            System.out.println("Triângulo inválido");
        }

        if(ladoA == ladoB && ladoB == ladoC){
            System.out.println("Equilátero");
        }else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            System.out.println("Isósceles");
        }else {
            System.out.println("Escaleno");
        }
    }
}
