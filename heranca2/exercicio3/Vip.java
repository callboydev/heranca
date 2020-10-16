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
    
    public Vip(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }
    
    @Override
    public void imprimeValor() {
        System.out.println("Valor: " + this.valor + this.adicional);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
}
