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
public class Tecnico extends Assistente{
    protected double bonus;
    
    public Tecnico(String nome, String setor, double salario, String matricula, double bonus) {
        super(nome, setor, salario, matricula);
        this.bonus = bonus;
        this.salario += this.bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
