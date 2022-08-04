package main;

public class Main {
    public static void main(String[] args) {
        Cliente julia = new Cliente();
        julia.setName("Julia");

        Conta ccJulia = new ContaCorrente(julia);
        ccJulia.depositar(100);

        ContaPoupanca poupancaJulia = new ContaPoupanca(julia);
        ccJulia.transferir(100, poupancaJulia);

        ccJulia.imprimirExtrato();
        poupancaJulia.imprimirExtrato();

        poupancaJulia.imprimirSaldoJurosAoMes(1.2, 3);
        poupancaJulia.imprimirTaxaJurosFixa();

        Cliente ricardo = new Cliente();
        ricardo.setName("Ricardo");

        Conta ccRicardo = new ContaCorrente(ricardo);
        ccRicardo.depositar(2000);

        ContaPoupanca poupancaRicardo = new ContaPoupanca(ricardo);
        ccRicardo.transferir(1000, poupancaRicardo);

        ccRicardo.imprimirExtrato();
        poupancaRicardo.imprimirExtrato();

        ricardo.setContaDigital();
        ricardo.temContaDigital();

        julia.temContaDigital();
        julia.setName("Gabriela");

        ContaDigital digitalRicardo = new ContaDigital(ricardo);
        digitalRicardo.efeitoEspecialDigital(2);

        julia.setContaDigital();
        ContaDigital digitalJulia = new ContaDigital(julia);
        digitalJulia.efeitoEspecialDigital(2);
    }
}
