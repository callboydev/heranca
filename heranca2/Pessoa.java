/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pessoa {
    protected String nome;
    protected int idade;
    
    public Pessoa(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        this.nome = sc.next();
        
        System.out.print("Digite a idade: ");
        this.idade = sc.nextInt();
    }
}
