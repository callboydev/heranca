/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author USER
 */
public class Vip extends Ingresso{
    protected double adicional;
    
    public Vip() {
        this.adicional = 20;
        this.valor += 20;
    }
    
    public void imprimeValor() {
        System.out.println(this.valor);
    }
    
    @Override
    public double getValor() {
        return this.valor;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
}
