public class Peixe extends Animal{
    protected int numeroBarbatanas;
    protected int numeroCaudas;

    public void setNumeroCaudas(int numeroCaudas) {
        this.numeroCaudas = numeroCaudas;
    }

    public int getNumeroBarbatanas() {
        return numeroBarbatanas;
    }

    public Peixe(String nome, double comprimento, double velocidade, int barbatanas, int caudas) {
        super(nome, comprimento, "cinzenta", "mar", velocidade);
        this.numeroPatas = 0;
        this.numeroBarbatanas = barbatanas;
        this.numeroCaudas = caudas;
    }

    public void setNumeroBarbatanas(int numeroBarbatanas) {
        this.numeroBarbatanas = numeroBarbatanas;
    }

    public int getNumeroCaudas() {
        return numeroCaudas;
    }

}
