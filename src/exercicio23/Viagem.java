package exercicio23;

public class Viagem {
    private double tempo;
    private double velocidade;

    public Viagem(double tempo, double velocidade) {
        this.tempo = tempo;
        this.velocidade = velocidade;
    }

    public double calcularDistancia(){
        return tempo * velocidade;
    }

    public double calcularLitros(){
        return calcularDistancia() / 12.00;
    }
}
