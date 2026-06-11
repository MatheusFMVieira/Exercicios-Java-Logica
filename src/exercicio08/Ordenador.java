package exercicio08;

public class Ordenador {
    private int vl01;
    private int vl02;
    private int vl03;
    public Ordenador(int vl01, int vl02, int vl03) {
        this.vl01 = vl01;
        this.vl02 = vl02;
        this.vl03 = vl03;
    }
    
    public void ordenar() {
        int aux;

        if (vl01 < vl02) {
            aux = vl01;
            vl01 = vl02;
            vl02 = aux;
        }

        if (vl01 < vl03) {
            aux = vl01;
            vl01 = vl03;
            vl03 = aux;
        }

        if (vl02 < vl03) {
            aux = vl02;
            vl02 = vl03;
            vl03 = aux;
        }
    }

    public void exibir(){
        System.out.println(vl01);
        System.out.println(vl02);
        System.out.println(vl03);
    }    
}
