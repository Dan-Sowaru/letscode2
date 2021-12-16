package br.com.letscode.bank.bankModels;

public class Gerente extends Funcionario{
    public Gerente(int idade, String nome, String sobrenome) {
        super(idade, nome, sobrenome);
    }

    @Override
    public void trabalhar() {
        System.out.println("gerente trabalhano");
    }

    public Cliente abrirConta(Pessoa pessoa) {
        return new ClientePessoa(pessoa.getIdade(), pessoa.getNome(), pessoa.getSobrenome());
    }

    public Cliente abrirConta(Empresa empresa) {
        return new ClienteEmpresa(empresa.getNomeFantasia(), empresa.getCnpj());

    @Override
    public void baterPonto() {
        super.baterPonto();
    }
}
