public class Pessoa {
    private String nome;
    private String dataNascimento;

    @Override 
    public String toString(){
        return " Nome: "  + this.nome + "\n Data nascimento: " + this.dataNascimento;
    }

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }   

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
