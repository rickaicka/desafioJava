package main;

public class ContaDigital extends Conta{

    public ContaDigital(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Digital ===");
        imprimirInfosComuns();
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        super.transferir(valor, contaDestino);
    }

    public void efeitoEspecialDigital(int id){
        if(cliente.id == id){
            System.out.println("\n loading efeito especial... \n \n ===   ٩(˘◡˘)۶   === \n \n");
        }else{
            System.out.println("--> Nananinanão, você não deu o id correto <--");
        }
    }
}
