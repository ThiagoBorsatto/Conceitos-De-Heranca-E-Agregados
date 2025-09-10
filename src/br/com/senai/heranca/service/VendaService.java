package br.com.senai.heranca.service;

import br.com.senai.heranca.entity.Venda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendaService {
    Scanner tec = new Scanner(System.in);
    List<Venda> listaDeVendas = new ArrayList<>();
    private int quantidadeDeProdutosVendidos;
    private double valorDaVenda;
    private int id;

    public void lerDadosVenda() {
        System.out.println("--- DADOS DA VENDA ---");
        System.out.print("Quantidade de itens vendidos: ");
        quantidadeDeProdutosVendidos = tec.nextInt();
        System.out.print("Valor tota da venda: R$");
        valorDaVenda = tec.nextDouble();
    }

    public void cadastrarVenda() {
        Venda venda = new Venda();
        venda.setQuantidadeDeProdutosVendidos(quantidadeDeProdutosVendidos);
        venda.setValorDaVenda(valorDaVenda);
        listaDeVendas.add(venda);
    }

    public void leitorDeID() {
        System.out.print("Digite o ID: ");
        id = tec.nextInt();
        while (id < 0 || id >= listaDeVendas.size()) {
            System.out.print("ID inválido, digite novamente: ");
            tec.nextLine();
            id = tec.nextInt();
        }
        System.out.println();
        tec.nextLine();
    }

    public void editarVenda() {
        Venda venda = new Venda();
        venda.setQuantidadeDeProdutosVendidos(quantidadeDeProdutosVendidos);
        venda.setValorDaVenda(valorDaVenda);
        listaDeVendas.set(id, venda);
    }

    public void listarVendas() {
        System.out.println("--- LISTA DE VENDAS ---");
        for (int i = 0; i < listaDeVendas.size(); i++) {
            System.out.println("Quantidade de intes: " + listaDeVendas.get(i).getQuantidadeDeProdutosVendidos() + "  |  Valor total: R$" + listaDeVendas.get(i).getValorDaVenda());
            System.out.println();
        }
    }

    public void buscarVenda() {
        System.out.println("Quantidade de intes: " + listaDeVendas.get(id).getQuantidadeDeProdutosVendidos() + "  |  Valor total: R$" + listaDeVendas.get(id).getValorDaVenda());
        System.out.println();
    }

    public void removerVenda() {
        listaDeVendas.remove(id);
        System.out.println("Dados removidos com sucesso!");
        System.out.println();
    }
}
