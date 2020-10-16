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
public class CamaroteInferior extends Vip{
    protected String localizacaoIngresso;

    public CamaroteInferior(double valor, double adicional) {
        super(valor, adicional);
        this.localizacaoIngresso = "Inferior";
    }
    
    public String getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(String localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

}
