/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author USER
 */
public class Assistente extends Funcionario {
    protected String matricula;
    
    public Assistente(String nome, String setor, double salario, String matricula) {
        super(nome, setor, salario);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public void exibirDados() {
        System.out.println("Matricula: " + this.matricula +  "\nNome: " + this.nome + "\nSetor: " + this.setor + "\nSalário: " + this.salario);
    }
    
}
