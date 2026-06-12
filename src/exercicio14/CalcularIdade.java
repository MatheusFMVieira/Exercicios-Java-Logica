package exercicio14;

public class CalcularIdade {
    private int anoNascimento;

    public CalcularIdade(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String calcularIdade(){
        int idade = 2026 - anoNascimento;
        int meses = idade * 12;
        int dias = idade * 365;

        return idade + " ano," + meses + " meses e " + dias + " dias de vida.";
    }
}
