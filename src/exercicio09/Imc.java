package exercicio09;

public class Imc {
    private double peso;
    private double altura;

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc(){
        double imc;
        imc = peso / Math.pow(altura, 2);
        return imc;
    }

    public void verificaCondicao(){
        if(calcularImc() >= 18.5){
            System.out.println("Abaixo do peso");
        }else if(calcularImc() > 18.5 && calcularImc() <= 24.9){
            System.out.println("Peso ideal");
        }else if(calcularImc() > 24.9 && calcularImc() <= 29.9){
            System.out.println("Levemente acima do peso");
        }else if(calcularImc() > 29.9 && calcularImc() <= 30.0){
            System.out.println("Obesidade Grau I");
        }else if(calcularImc() > 30.0 && calcularImc() <= 39.9){
            System.out.println("Obesidade Grau II");
        }else if(calcularImc() > 39.9){
            System.out.println("Obesidade Grau III");
        }
    }
}
