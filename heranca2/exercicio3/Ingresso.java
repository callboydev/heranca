
package exercicio3;


public class Ingresso {
    protected double valor;
    
    public void imprimeValor() {
        System.out.println(this.valor);
    }

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
