package classe_abstrata;

public class Retangulo extends Quadrilatero {
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    @Override
    public float calcularArea() {
        return (this.lado * this.altura);
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularPerimetro() {
        return (2 * this.lado) + ( 2 * this.altura);
    }
}