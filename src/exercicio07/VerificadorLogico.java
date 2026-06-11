package exercicio07;

public class VerificadorLogico {
    private boolean valor01;
    private boolean valor02;

    public VerificadorLogico(boolean valor01, boolean valor02) {
        this.valor01 = valor01;
        this.valor02 = valor02;
    }

    public String verifica(){
        if (valor01 && valor02) {
            return "Ambos são verdadeiros";
        }else if(!valor01 && valor02){
            return "Valor 01 é falso e valor 02 é verdadeiro";
        }else if(valor01 && !valor02){
            return "Valor 01 é verdadeiro e valor 02 é falso";
        }else {
            return "Ambos são falsos";
        }
    }

    @Override
    public String toString() {
        return verifica();
    }
}
