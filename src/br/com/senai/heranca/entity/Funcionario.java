package br.com.senai.heranca.entity;

public class Funcionario extends Pessoa{
    private String matricula;
    private String email_funcionario;
    private String funcao;
    private double salario;
    private Produto produto;
    private Venda venda;

    public Funcionario() {
    }

    public Funcionario(String matricula, String email_funcionario, String funcao, double salario) {
        this.matricula = matricula;
        this.email_funcionario = email_funcionario;
        this.funcao = funcao;
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, int idade, String email, String telefone, String matricula, String email_funcionario, String funcao, double salario) {
        super(nome, cpf, idade, email, telefone);
        this.matricula = matricula;
        this.email_funcionario = email_funcionario;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail_funcionario() {
        return email_funcionario;
    }

    public void setEmail_funcionario(String email_funcionario) {
        this.email_funcionario = email_funcionario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}
