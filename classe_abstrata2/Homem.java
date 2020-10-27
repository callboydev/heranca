public class Homem extends PessoaIMC{

    public Homem(double altura, double peso, String nome, String dataNascimento) {
        super(altura, peso, nome, dataNascimento);
    }

    @Override
    public String resultIMC() {
        double imc = this.calculaIMC(this.getAltura(), this.getPeso());
        if(imc > 26.4){
            return "Está Acima do peso ideal";
        } else if(imc < 26.4 && imc > 20.7){
            return "ESTÁ Peso ideal";
        } else if(imc < 20.7){
            return "Esta Abaixo do peso ideal";
        }
        return null;
    }

}
