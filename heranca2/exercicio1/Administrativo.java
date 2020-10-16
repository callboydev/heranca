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
public class Administrativo extends Assistente{
    protected String turno;
    protected double adicionalNoturno;
    
    public Administrativo(String nome, String setor, double salario, String matricula, String turno) {
        super(nome, setor, salario, matricula);
        this.turno = turno;
    }
    
    public Administrativo(String nome, String setor, double salario, String matricula, String turno, double adicionalNoturno) {
        super(nome, setor, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
        this.salario += this.adicionalNoturno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
