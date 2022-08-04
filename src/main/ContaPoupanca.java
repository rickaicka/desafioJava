package main;

public class ContaPoupanca extends Conta{

    double taxaJurosFixa = 1.2;

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {

        System.out.println("=== Extrato Conta Poupanca ===");
        imprimirInfosComuns();
    }

    public void imprimirSaldoJurosAoMes(double juros, int meses){

        double novoSaldo = jurosAoMes(juros, meses);
        System.out.println("=== O seu saldo após " + meses + " meses é de " + novoSaldo + " reais ===");
    }

    public void imprimirTaxaJurosFixa() {
        System.out.println("=== A taxa de juros da sua conta poupança é de " + taxaJurosFixa + "% ao mes ===");
    }
}
