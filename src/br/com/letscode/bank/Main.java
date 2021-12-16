package br.com.letscode.bank;

import br.com.letscode.bank.bankModels.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

          Gerente gerente = new Gerente(23, "Patinhas", "Husf");
        Pessoa potencialCliente = new Pessoa(65, "Pinho", "Poerat");
        Cliente clientePessoa = gerente.abrirConta(potencialCliente);

        clientePessoa.getConta().setTipo(TipoConta.CC);
        clientePessoa.getConta().saque(BigDecimal.TEN);
        clientePessoa.getConta().deposito(BigDecimal.TEN);
        clientePessoa.getConta().saque(BigDecimal.ONE);
        System.out.println(clientePessoa.getConta());

        System.out.println(clientePessoa);





    }
}
