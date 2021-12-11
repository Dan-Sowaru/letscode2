package br.com.letscode.bank.bankModels;

import java.math.BigDecimal;

public class Conta {

    public static int quantidadeContas = 0;
    public int numeroConta;
    public BigDecimal saldo;

    public Conta() {
        numeroConta = ++quantidadeContas;

    }
}
