package br.com.letscode.bank.bankModels;

import java.time.LocalDateTime;

public abstract class Funcionario extends Pessoa {
    public Funcionario(int idade, String nome, String sobrenome) {
        super(idade, nome, sobrenome);
    }



    public abstract void trabalhar();
//    obriga a criação de um método trabalhar() individual na hora que criar Funcionario;

    public void baterPonto() {
        System.out.println("Horário de ponto: " + LocalDateTime.now());
    }
//    reaproveita esse método em qualquer criação de Funcionário;

}
