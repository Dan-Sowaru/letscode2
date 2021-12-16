package br.com.letscode.bank.bankModels;

public class ClienteEmpresa extends Empresa implements Cliente {


    private Conta conta;

    public ClienteEmpresa(String nomeFantasia, String cnpj) {
        super(nomeFantasia, cnpj);
        conta = new Conta();
    }

    @Override
    public Conta getConta() {
        return conta;
    }

}
