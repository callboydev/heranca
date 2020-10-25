/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author USER
 */
public class Novo extends Imovel{
    protected double adicional;
    
    public Novo(String endereco, double preco) {
        super(endereco, preco);
        this.adicional = 10;
        this.preco += (this.preco*this.adicional)/100;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
}
