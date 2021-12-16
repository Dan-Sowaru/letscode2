package br.com.letscode.bank.bankModels;

public class Pessoa {

    private int idade = 0;
    private String nome = null;
    private String sobrenome = null;


    public Pessoa(int idade, String nome, String sobrenome) {
        setIdade(idade);
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        if ((idade >= 0 && idade <= 150)) {
            this.idade = idade;
        } else {
            System.err.print("idade impossível!");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {

        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
