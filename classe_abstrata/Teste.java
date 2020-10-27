package classe_abstrata;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quadrilatero[] lista = new Quadrilatero[10];

        for(int i = 0; i < 10; i++){
            System.out.println("1. Cadastrar Retângulo\n2. Cadastrar Circulo\n3. Cadastrar Quadrado\n4. Mostrar o valor de todas as área\n5. Mostrar o valor de todas os perímetros");
            
            int escolha = sc.nextInt();
            
            switch(escolha){
                case 1:
                    System.out.println("Lado: ");
                    float lado = sc.nextFloat();

                    System.out.println("Altura: ");
                    float altura = sc.nextFloat();

                    Retangulo retangulo = new Retangulo(lado, altura);

                    for(int j = 0; j < 10; j++){
                        if(lista[j] == null){
                            lista[j] = retangulo;
                            break;
                        }
                    }
                    
                break;
                case 2:
                    System.out.println("Raio: ");
                    float raio = sc.nextFloat();

                    Circulo circulo = new Circulo(raio);

                    for(int j = 0; j < 10; j++){
                        if(lista[j] == null){
                            lista[j] = circulo;
                            break;
                        }
                    }

                break;
                case 3:
                    System.out.println("Digite o lado: ");
                    lado = sc.nextFloat();

                    System.out.println("Digite a altura: ");
                    altura = sc.nextFloat();

                    while(lado != altura){
                        System.out.println("O lado tem que ser igual a altura!");
                        System.out.println("Digite o lado: ");
                        lado = sc.nextFloat();
                        System.out.println("Digite a altura: ");
                        altura = sc.nextFloat();
                    }

                    Quadrado quadrado = new Quadrado(lado, altura);

                    for(int j = 0; j < 10; j++){
                        if(lista[j] == null){
                            lista[j] = quadrado;
                            break;
                        }
                    }

                break;
                case 4:
                    for(int c = 0; c < 10; c++){
                        if(lista[c] != null){
                            System.out.println("Area: " + lista[c].calcularArea());
                        };
                    }
                break;
                case 5:
                    for(int j = 0; j < 10; j++){
                        if(lista[j] != null){
                            System.out.println("Perimetro: " + lista[j].calcularPerimetro());
                        };
                    }
                break;
                default:
                    System.out.println("Opção inválida");
                    System.exit(0);
                break;
            }
        }
    }
}