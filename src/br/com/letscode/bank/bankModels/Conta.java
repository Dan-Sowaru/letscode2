package br.com.letscode.bank.bankModels;

import br.com.letscode.bank.bankModels.TipoConta;

import java.math.BigDecimal;

public class Conta {

    private static int quantidadeContas = 0;

    private int numeroConta;
    private BigDecimal saldo;
    private TipoConta tipo;

    public Conta() {
        numeroConta = ++quantidadeContas;
        this.saldo = BigDecimal.ZERO;
        tipo = TipoConta.CP;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal saque(BigDecimal valor) {
        if (valor.compareTo(saldo) > 0) {
            if (tipo == TipoConta.CC) {
                this.saldo = this.saldo.subtract(valor);
                System.out.printf("Foi efetuado um saque no valor de %s. Você está usando %s do cheque especial%n",
                        valor, saldo);
            } else {
                System.err.printf("Não foi possível efetuar um saque no valor de %s. O Saldo de %s é insuficiente%n",
                        valor, saldo);
            }
        } else {
            this.saldo = this.saldo.subtract(valor);
            System.out.printf("Foi efetuado um saque no valor de %s. O Saldo resultante é %s%n", valor, saldo);
        }
        return this.saldo;
    }

    public BigDecimal deposito(BigDecimal valor) {
        saldo = saldo.add(valor);
        System.out.printf("Foi efetuado um depósito no valor de %s. O Saldo resultante é %s%n", valor, saldo);
        return saldo;
    }

    @Override
    public String toString() {
        return tipo + " numero: " + numeroConta + " e saldo: R$ " + saldo;
    }
}