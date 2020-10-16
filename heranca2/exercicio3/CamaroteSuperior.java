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
public class CamaroteSuperior extends Vip{
    double camaroteAdicional;
    
    public CamaroteSuperior(double valor, double adicional, double camaroteAdicional) {
        super(valor, adicional);
        this.camaroteAdicional = camaroteAdicional;
    }
    
    public double valorDoIngresso() {
        return (this.valor + this.adicional + this.camaroteAdicional);
    }
    
}
