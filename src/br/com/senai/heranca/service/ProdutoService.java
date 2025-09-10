package br.com.senai.heranca.service;

import br.com.senai.heranca.entity.Produto;
import br.com.senai.heranca.entity.Venda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoService {
    Scanner tec = new Scanner(System.in);
    List<Produto> listaDeProdutos = new ArrayList<>();
    private String nomeDoProduto;
    private int quantidadeDeProduto;
    private double precoDoProduto;
    private int id;

    public void lerDadosProduto() {
        System.out.println("--- DADOS DO PRODUTO ---");
        System.out.print("Nome do Produto: ");
        nomeDoProduto = tec.nextLine();
        System.out.print("Quantidade do Produto: ");
        quantidadeDeProduto = tec.nextInt();
        System.out.print("Preço do Produto: ");
        precoDoProduto = tec.nextDouble();
        System.out.println();
    }

    public void cadastrarProduto() {
        Produto produto = new Produto();
        produto.setNomeDoProduto(nomeDoProduto);
        produto.setQuantidadeDeProduto(quantidadeDeProduto);
        produto.setPrecoDoProduto(precoDoProduto);
        listaDeProdutos.add(produto);
    }

    public void leitorDeID() {
        System.out.print("Digite o ID: ");
        id = tec.nextInt();
        while (id < 0 || id >= listaDeProdutos.size()) {
            System.out.print("ID inválido, digite novamente: ");
            tec.nextLine();
            id = tec.nextInt();
        }
        System.out.println();
        tec.nextLine();
    }

    public void editarProduto() {
        Produto produto = new Produto();
        produto.setNomeDoProduto(nomeDoProduto);
        produto.setQuantidadeDeProduto(quantidadeDeProduto);
        produto.setPrecoDoProduto(precoDoProduto);
        listaDeProdutos.set(id, produto);
    }

    public void listarProdutos() {
        System.out.println("--- LISTA DE PRODUTOS ---");
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            System.out.println("Nome: " + listaDeProdutos.get(i).getNomeDoProduto() + "  |  Quantidade: " + listaDeProdutos.get(i).getQuantidadeDeProduto() + "  |  Preço: R$" + listaDeProdutos.get(i).getPrecoDoProduto());
            System.out.println();
        }
    }

    public void buscarProduto() {
        System.out.println("Nome: " + listaDeProdutos.get(id).getNomeDoProduto() + "  |  Quantidade: " + listaDeProdutos.get(id).getQuantidadeDeProduto() + "  |  Preço: R$" + listaDeProdutos.get(id).getPrecoDoProduto());
        System.out.println();
    }

    public void removerProduto() {
        listaDeProdutos.remove(id);
        System.out.println("Dados removidos com sucesso!");
        System.out.println();
    }
}
