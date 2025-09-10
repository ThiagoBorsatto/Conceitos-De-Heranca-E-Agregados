package br.com.senai.heranca.entity;

public class Venda {
    private int quantidadeDeProdutosVendidos;
    private double valorDaVenda;

    public Venda() {
    }

    public Venda(int quantidadeDeProdutosVendidos, double valorDaVenda) {
        this.quantidadeDeProdutosVendidos = quantidadeDeProdutosVendidos;
        this.valorDaVenda = valorDaVenda;
    }

    public int getQuantidadeDeProdutosVendidos() {
        return quantidadeDeProdutosVendidos;
    }

    public void setQuantidadeDeProdutosVendidos(int quantidadeDeProdutosVendidos) {
        this.quantidadeDeProdutosVendidos = quantidadeDeProdutosVendidos;
    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }
}
