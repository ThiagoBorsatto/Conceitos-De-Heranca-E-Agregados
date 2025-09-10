package br.com.senai.heranca.entity;

public class Cliente extends Pessoa{
    private int codigoCliente;
    private String telefoneDoCliente;
    private String emailCliente;
    private Venda venda;

    public Cliente() {
    }

    public Cliente(int codigoCliente, String telefoneDoCliente, String emailCliente) {
        this.codigoCliente = codigoCliente;
        this.telefoneDoCliente = telefoneDoCliente;
        this.emailCliente = emailCliente;
    }

    public Cliente(String nome, String cpf, int idade, String email, String telefone, int codigoCliente, String telefoneDoCliente, String emailCliente) {
        super(nome, cpf, idade, email, telefone);
        this.codigoCliente = codigoCliente;
        this.telefoneDoCliente = telefoneDoCliente;
        this.emailCliente = emailCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTelefoneDoCliente() {
        return telefoneDoCliente;
    }

    public void setTelefoneDoCliente(String telefone) {
        this.telefoneDoCliente = telefone;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}
