package br.com.senai.heranca.service;

import br.com.senai.heranca.entity.Endereco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnderecoService {
    Scanner tec = new Scanner(System.in);
    List<Endereco> listaDeEmderecos = new ArrayList<>();
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private int cep;
    private int id;

    public void lerDadosEndereco() {
        System.out.println("--- DADOS DO ENDEREÇO ---");
        System.out.print("Nome da Cidade: ");
        cidade = tec.nextLine();
        System.out.print("Nome do Bairro: ");
        bairro = tec.nextLine();
        System.out.print("Nome da Rua: ");
        rua = tec.nextLine();
        System.out.print("Número: ");
        numero = tec.nextInt();
        System.out.print("CEP: ");
        cep = tec.nextInt();
        System.out.println();
    }

    public void cadastrarEndereco() {
        Endereco endereco = new Endereco();
        endereco.setCidade(cidade);
        endereco.setBairro(bairro);
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setCep(cep);
        listaDeEmderecos.add(endereco);
    }

    public void leitorDeID() {
        System.out.print("Digite o ID: ");
        id = tec.nextInt();
        while (id < 0 || id >= listaDeEmderecos.size()) {
            System.out.print("ID inválido, digite novamente: ");
            tec.nextLine();
            id = tec.nextInt();
        }
        System.out.println();
        tec.nextLine();
    }

    public void editarEndereco() {
        Endereco endereco = new Endereco();
        endereco.setCidade(cidade);
        endereco.setBairro(bairro);
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setCep(cep);
        listaDeEmderecos.set(id, endereco);
    }

    public void listarEnderecos() {
        System.out.println("--- LISTA DE PESSOAS ---");
        for (int i = 0; i < listaDeEmderecos.size(); i++) {
            System.out.println("Cidade: " + listaDeEmderecos.get(i).getCidade() + "  |  Bairro: " + listaDeEmderecos.get(i).getBairro() + "  |  Rua: " + listaDeEmderecos.get(i).getRua());
            System.out.println("Número: " + listaDeEmderecos.get(i).getNumero() + "  |  CEP: " + listaDeEmderecos.get(i).getCep());
            System.out.println();
        }
    }

    public void buscarEndereco() {
        System.out.println("Cidade: " + listaDeEmderecos.get(id).getCidade() + "  |  Bairro: " + listaDeEmderecos.get(id).getBairro() + "  |  Rua: " + listaDeEmderecos.get(id).getRua());
        System.out.println("Número: " + listaDeEmderecos.get(id).getNumero() + "  |  CEP: " + listaDeEmderecos.get(id).getCep());
        System.out.println();
    }

    public void removerEndereco() {
        listaDeEmderecos.remove(id);
        System.out.println("Dados removidos com sucesso!");
        System.out.println();
    }
}
