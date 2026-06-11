package exercicio12;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String verificaMaioridade(){
        if(idade > 17){
            return nome + ": " + "Maior de idade";
        }
        return nome + ": " + "Menor de idade";
    }

    @Override
    public String toString() {
        return verificaMaioridade();
    }
}
