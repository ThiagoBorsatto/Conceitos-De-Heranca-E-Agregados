package br.com.senai.heranca.entity;

public class Produto {
    private String nomeDoProduto;
    private int quantidadeDeProduto;
    private double precoDoProduto;
    private Venda venda;

    public Produto() {
    }

    public Produto(String nomeDoProduto, int quantidadeDeProduto, double precoDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.quantidadeDeProduto = quantidadeDeProduto;
        this.precoDoProduto = precoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public int getQuantidadeDeProduto() {
        return quantidadeDeProduto;
    }

    public void setQuantidadeDeProduto(int quantidadeDeProduto) {
        this.quantidadeDeProduto = quantidadeDeProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}
