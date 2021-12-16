package br.com.letscode.bank.bankModels;

public enum TipoConta {

    CC("Conta Corrente"),
    CP("Conta Poupança");

    private final String nome;


    TipoConta(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
