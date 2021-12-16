package br.com.letscode.bank.bankModels;

public class ClientePessoa extends Pessoa implements Cliente{

    private Conta conta;

    public ClientePessoa(int idade, String nome, String sobrenome) {
        super(idade, nome, sobrenome);
        conta = new Conta();
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
