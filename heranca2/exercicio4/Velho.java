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
public class Velho extends Imovel{
    protected double desconto;
    
    public Velho(String endereco, double preco) {
        super(endereco, preco);
        this.desconto = 10;
        this.preco -= (this.preco*10)/100;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
}
