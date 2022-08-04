package main;

public class Cliente {

    protected static int SEQUENCIAL = 1;
    protected String nome;
    public Boolean contaDigital;
    protected int id;

    public Cliente() {
        this.contaDigital = false;
        id = SEQUENCIAL++;
    }

    public void setName(String nomeCliente) {
        if (this.nome != null) {
            System.out.println("Você já tem um nome inserido!");
        } else {
            this.nome = nomeCliente;
            System.out.println("O nome do cliente " + this.nome + " foi inserido com sucesso");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setContaDigital(){
        this.contaDigital = true;
    }

    public void temContaDigital(){
        if(contaDigital){
            System.out.println("Este cliente tem uma conta digital!");
        }else{
            System.out.println("Este cliente tem não uma conta digital, mas você pode criar uma acessando o método setContaDigital ;)");
        }
    }

    public int getID(){
        return id;
    }
}
