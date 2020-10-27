public class Mamifero extends Animal {
    protected String alimentoPreferido;

    public void setAlimentoPreferido(String alimentoPreferido) {
        this.alimentoPreferido = alimentoPreferido;
    }

    public String getAlimentoPreferido() {
        return alimentoPreferido;
    }
    
    public Mamifero(String nome, double comprimento, String cor, double velocidade, String alimento) {
        super(nome, comprimento, cor, "terra", velocidade);
        this.alimentoPreferido = alimento;
    }
    
}
