import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<ContaPoupanca> contasPoupanca = new ArrayList();
        ArrayList<ContaEspecial> contasEspecial = new ArrayList();
        
        while(true) {
            System.out.println("1) Incluir dados relativos a conta de um cliente (Limitado a 5 contas);\n" +
"2) Sacar um determinado valor de uma conta (Procure pelo número da conta);\n" +
"3) Depositar um determinado valor na sua conta (Procure pelo número da conta);\n" +
"4) Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que\n" +
"possuem conta poupança;\n" +
"5) Mostrar os dados de todas as contas cadastradas.\n"
                    + "6) Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    if(contasPoupanca.size() + contasEspecial.size() < 5) {
                        System.out.println("Nome do CLIENTE: ");
                        String nome = sc.next();

                        System.out.println("Número da CONTA: ");
                        int numero = sc.nextInt();

                        System.out.println("Saldo INICIAL: ");
                        float saldo = sc.nextFloat();

                        int tipo = 0;
                        while(tipo != 1 && tipo != 2) {
                            System.out.println("Tipo de CONTA:\n"
                                + "1 - Poupanca\n"
                                + "2 - Especial");
                            tipo = sc.nextInt();

                            if(tipo == 1) {
                                System.out.println("Dia de RENDIMENTO: ");
                                int dia = sc.nextInt();
                                ContaPoupanca conta = new ContaPoupanca(nome, numero, saldo, dia);
                                contasPoupanca.add(conta);
                                System.out.println("Conta criada!\n");
                            } else if(tipo == 2) {
                                float limite = 0;
                                while(limite >= 0) {
                                    System.out.println("LIMITE (negativo): ");
                                    limite = sc.nextFloat();
                                }
                                ContaEspecial conta = new ContaEspecial(nome, numero, saldo, limite);
                                contasEspecial.add(conta);
                                System.out.println("Sucesso!\n");
                            }
                        }
                    } else {
                        System.out.println("Limite 4 contas");
                    }
                break;
                
                case 2:
                    System.out.println("Valor: ");
                    float valor = sc.nextFloat();
                    
                    System.out.println("Número da CONTA: ");
                    int numeroSacar = sc.nextInt();
                    
                    int sizePoupanca = contasPoupanca.size();
                    for(int i = 0; i < sizePoupanca; i++) {
                        if(numeroSacar == contasPoupanca.get(i).getNumeroConta()) {
                            contasPoupanca.get(i).sacar(valor);
                        }
                    }
                    
                    int sizeEspecial = contasEspecial.size();
                    for(int i = 0; i < sizeEspecial; i++) {
                        if(numeroSacar == contasEspecial.get(i).getNumeroConta()) {
                            contasEspecial.get(i).sacar(valor);
                        }
                    }
                    
                break;
                
                case 3:
                    System.out.println("Valor: ");
                    valor = sc.nextFloat();
                    
                    System.out.println("Número da CONTA: ");
                    numeroSacar = sc.nextInt();
                    
                    sizePoupanca = contasPoupanca.size();
                    for(int i = 0; i < sizePoupanca; i++) {
                        if(numeroSacar == contasPoupanca.get(i).getNumeroConta()) {
                            contasPoupanca.get(i).depositar(valor);
                        }
                    }
                    
                    sizeEspecial = contasEspecial.size();
                    for(int i = 0; i < sizeEspecial; i++) {
                        if(numeroSacar == contasEspecial.get(i).getNumeroConta()) {
                            contasEspecial.get(i).depositar(valor);
                        }
                    }
                break;
                
                case 4:
                    System.out.println("Cliente com poupança: ");
                    String nomeBuscar = sc.next();
                    
                    sizePoupanca = contasPoupanca.size();
                    for(int i = 0; i < sizePoupanca; i++) {
                        if(nomeBuscar.equals(contasPoupanca.get(i).getNomeCliente())) {
                            System.out.println("Digite a taxa de rendimento: ");
                            float taxa = sc.nextFloat();
                            contasPoupanca.get(i).calcularNovoSaldo(taxa);
                            System.out.println("O novo saldo é de R$" + contasPoupanca.get(i).getSaldo() + "\n");
                        }
                    }
                break;
                
                case 5:
                    sizePoupanca = contasPoupanca.size();
                    for(int i = 0; i < sizePoupanca; i++) {
                        contasPoupanca.get(i).getDados();
                    }
                    
                    sizeEspecial = contasEspecial.size();
                    for(int i = 0; i < sizeEspecial; i++) {
                        contasEspecial.get(i).getDados();
                    }
                break;
            }
            
        }
    }
}
