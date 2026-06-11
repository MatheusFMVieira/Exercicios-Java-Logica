package exercicio10;

public class Aluno {
    private double nota01;
    private double nota02;
    private double nota03;

    public Aluno(double nota01, double nota02, double nota03) {
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
    }

    public double media(){
        double media = (nota01 + nota02 + nota03)/3;
        return media;
    }

    public void situacaoAluno(){
        if(media() >= 7.0){
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Aluno reprovado");
        }
    }

    @Override
    public String toString() {
        return "Media: " + media();
    }
}
