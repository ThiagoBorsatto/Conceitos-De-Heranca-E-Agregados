package br.com.senai.heranca.entity;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String email;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, int idade, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
