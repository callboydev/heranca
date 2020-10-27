public class ContaPoupanca extends ContaBancaria{
    protected int diaRendimento;
    
    public ContaPoupanca(String nome, int numero, float saldo, int dia) {
        this.diaRendimento = dia;
        this.numeroConta = numero;
        this.saldo = saldo;
        this.nomeCliente = nome;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxa) {
        float rendimento = (this.getSaldo() * (taxa/100));
        float novo_saldo = rendimento + this.getSaldo();
        this.setSaldo(novo_saldo);
    }
    
    public void getDados() {
        System.out.println("Nome do cliente: " + this.nomeCliente
        +"\nNúmero da conta: " + this.numeroConta
        +"\nSaldo: " + this.saldo
        +"\nDia de rendimento: " + this.diaRendimento + "\n");
    }

}
