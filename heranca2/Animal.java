
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Animal {
    protected String nome;
    protected String raca;
    
    public Animal(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o nome do animal: ");
        this.nome = sc.next();
        System.out.print("Qual a raça do animal: ");
        this.raca = sc.next();
    }
    
    public Animal(String nome){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual a raça do animal: ");
        this.raca = sc.next();
    }
    
    public String caminhada(){
        return this.nome + " andando...";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
