import java.util.ArrayList;
import java.util.Scanner;

public class TesteAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Peixe> listaPeixes = new ArrayList();
        ArrayList<Mamifero> listaMamiferos = new ArrayList();
        
        int opcao = 1;
        while(opcao != 0) {
            
            System.out.println("1) Incluir dados relativo a um peixe;\n" +
"2) Incluir dados relativo a um mamífero;\n" +
"3) Listar todos os animais cadastrados;\n" +
"4) Lista todos os peixes cadastrados");
            
            opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Nome do PEIXE: ");
                    String nomePeixe = sc.next();
                    System.out.println("Comprimento do PEIXE: ");
                    double comprimentoPeixe = sc.nextDouble();
                    System.out.println("Velocidade do PEIXE em m/s: ");
                    double velocidadePeixe = sc.nextDouble();
                    System.out.println("Número de barbatanas do PEIXE: ");
                    int barbatanas = sc.nextInt();
                    System.out.println("Número de caudas do PEIXE: ");
                    int caudas = sc.nextInt();
                    
                    Peixe peixe = new Peixe(nomePeixe, comprimentoPeixe, velocidadePeixe, barbatanas, caudas);
                    listaPeixes.add(peixe);
                    
                    System.out.println("Peixe cadastrado!\n");
                break;
                case 2:
                    System.out.println("Digite o nome do mamifero: ");
                    String nomeMamifero = sc.next();
                    System.out.println("Digite o comprimento do mamifero: ");
                    double comprimentoMamifero = sc.nextDouble();
                    System.out.println("Digite a velocidade do mamifero em m/s: ");
                    double velocidadeMamifero = sc.nextDouble();
                    System.out.println("Digite a cor do mamifero: ");
                    String cor = sc.next();
                    System.out.println("Digite o alimento preferido do mamifero: ");
                    String alimento = sc.next();
                    
                    Mamifero mamifero = new Mamifero(nomeMamifero, comprimentoMamifero, cor, velocidadeMamifero, alimento);
                    listaMamiferos.add(mamifero);
                    
                    System.out.println("Mamifero cadastrado com sucesso!\n");
                break;
                case 3:
                    if(listaMamiferos.size() == 0 && listaPeixes.size() == 0) {
                        System.out.println("Nenhum animal cadastrado, CADASTRE ANTES SEU ANIMAL :)");
                    } else {
                        System.out.println("Animais: ");
                        
                        for(int i = 0; i < listaMamiferos.size(); i++) {
                            Mamifero m = listaMamiferos.get(i);
                            System.out.println("Mamifero: " + m.getNome());
                        }
                        
                        System.out.println("\n");
                        
                        for(int i = 0; i < listaPeixes.size(); i++) {
                            Peixe p = listaPeixes.get(i);
                            System.out.println("Peixe: " + p.getNome());
                        }
                        
                        System.out.println("\n");
                    }
                break;
                case 4:
                    if(listaPeixes.size() == 0) {
                        System.out.println("Nenhum peixe cadastrado..........................");
                    } else {
                        for(int i = 0; i < listaPeixes.size(); i++) {
                            Peixe p = listaPeixes.get(i);
                            System.out.println("Peixe: " + p.getNome());
                        }
                        System.out.println("\n");
                    }
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }
}
