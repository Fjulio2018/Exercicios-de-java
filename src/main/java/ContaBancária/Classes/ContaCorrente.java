package ContaBancária.Classes;

public class ContaCorrente {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;

    public ContaCorrente(int numeroConta, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
    }

    public ContaCorrente(int numeroConta, String nomeCliente, double depInicial) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        deposito( depInicial );
    }

    public int getNumeroConta() {
        return numeroConta;
    }



    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }



    public void deposito(double valorDep){
        saldo += valorDep;


    }

    public  void saque(double valorSaque){
        saldo -= valorSaque + 5.0;


    }

public String toString(){
        return "Número da conta: "
                + numeroConta
                + ", Nome do cliente: "
                + nomeCliente
                + "Seu saldo é: "
                + String.format( "%.2f" , saldo);

}

}
