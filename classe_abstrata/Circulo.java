package classe_abstrata;

public class Circulo extends Quadrilatero{
    private float raio;
    
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) Math.PI*(Math.pow(this.raio, 2));
    }

    public Circulo(float raio) {
        this.raio = raio;
    }
    
    @Override
    public float calcularPerimetro() {
        return (float) (2*Math.PI*this.raio);
    }
}