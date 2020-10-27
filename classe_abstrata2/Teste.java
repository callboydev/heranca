import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        
        ArrayList<Mulher> listaMulher = new ArrayList();
        ArrayList<Homem> listaHomem = new ArrayList();

        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("1. Cadastra Homem\n2. Cadastrar Mulher\n3. Consultar IMC (Busca pelo nome)\n4. Listar listaHomem\n5. Listar listaMulher\n6. Listar todos os IMCs dos listaHomem\n7. Listas todos os IMCs\n0. Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("nome: ");
                    String nome = sc.next();

                    System.out.println("altura: ");
                    double altura = sc.nextDouble();

                    System.out.println("data nascimnto: ");
                    String dataNascimento = sc.next();

                    System.out.println("peso: ");
                    double peso = sc.nextDouble();

                    Homem homem = new Homem(altura, peso, nome, dataNascimento);
                    listaHomem.add(homem);
                break;
                case 2:
                    System.out.println("Digite seu nome: ");
                    nome = sc.next();

                    System.out.println("Digite sua altura: ");
                    altura = sc.nextDouble();

                    System.out.println("Digite sua data de nascimnto: ");
                    dataNascimento = sc.next();

                    System.out.println("Digite seu peso: ");
                    peso = sc.nextDouble();

                    Mulher mulher = new Mulher(altura, peso, nome, dataNascimento);
                    listaMulher.add(mulher);
                break;
                case 3:
                    System.out.println("Nome para a consulta: ");
                    nome = sc.next();

                    for(int i = 0; i < listaHomem.size(); i++){
                        Homem h = listaHomem.get(i);
                        if(h.getNome().equals(nome)){
                            System.out.println(h.resultIMC());
                        }
                    }

                    for(int i = 0; i < listaMulher.size(); i++){
                        Mulher m = listaMulher.get(i);
                        if(m.getNome().equals(nome)){
                            System.out.println(m.resultIMC());
                        }
                    }

                break;
                case 4:
                    for(int i = 0; i < listaHomem.size(); i++){
                        Homem h = listaHomem.get(i);
                        System.out.println(h.getNome());
                    }
                break;
                case 5:
                    for(int i = 0; i < listaMulher.size(); i++){
                        Mulher m = listaMulher.get(i);
                        System.out.println(m.getNome());
                    }
                break;
                case 6:
                    for(int i = 0; i < listaHomem.size(); i++){
                        Homem h = listaHomem.get(i);
                        System.out.println(h.getNome() + " - " + h.resultIMC());
                    }
                break;
                case 7:
                    for(int i = 0; i < listaHomem.size(); i++){
                        Homem h = listaHomem.get(i);
                        System.out.println(h.getNome() + " - " + h.resultIMC());
                    }

                    for(int i = 0; i < listaMulher.size(); i++){
                        Mulher m = listaMulher.get(i);
                        System.out.println(m.getNome() + " - " + m.resultIMC());
                    }
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }
}
