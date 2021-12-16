package br.com.letscode.bank.bankModels;

public class FuncionarioRH extends Funcionario{

    public FuncionarioRH(int idade, String nome, String sobrenome) {
        super(idade, nome, sobrenome);
    }

    @Override
    public void trabalhar() {
        System.out.println("trabalhano o RH");

    }

    public void darAumento(Gerente gerente) {
        System.out.println("gerente ganhou mais dinheiro");
    }

    public void darAumento(FuncionarioRH funcionarioRH) {
        System.out.println("RH ganhou mais dinheiro");
    }
}
