package br.com.senai.heranca.service;

import br.com.senai.heranca.entity.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteService {
    Scanner tec = new Scanner(System.in);
    List<Cliente> listaDeClientes = new ArrayList<>();
    private String nome;
    private String cpf;
    private String email;
    private String emailCliente;
    private String telefone;
    private int codigoCliente;
    private String telefoneDoCliente;
    private int idade;
    private int id;

    public void lerDadosCliente() {
        System.out.println("--- DADOS DA CLIENTE ---");
        System.out.print("Nome: ");
        nome = tec.nextLine();
        System.out.print("CPF: ");
        cpf = tec.nextLine();
        System.out.print("Idade: ");
        idade = tec.nextInt();
        tec.nextLine();
        System.out.print("Email: ");
        email = tec.nextLine();
        System.out.print("Email cliente: ");
        emailCliente = tec.nextLine();
        System.out.print("Telefone: ");
        telefone = tec.nextLine();
        System.out.print("Código do cliente: ");
        codigoCliente = tec.nextInt();
        tec.nextLine();
        System.out.print("Telefone do Cliente: ");
        telefoneDoCliente = tec.nextLine();
        System.out.println();
    }

    public void cadastrarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setIdade(idade);
        cliente.setEmail(email);
        cliente.setTelefone(telefone);
        cliente.setCodigoCliente(codigoCliente);
        cliente.setTelefoneDoCliente(telefoneDoCliente);
        cliente.setEmailCliente(emailCliente);
        listaDeClientes.add(cliente);
    }

    public void leitorDeID() {
        System.out.print("Digite o ID: ");
        id = tec.nextInt();
        while (id < 0 || id >= listaDeClientes.size()) {
            System.out.print("ID inválido, digite novamente: ");
            tec.nextLine();
            id = tec.nextInt();
        }
        System.out.println();
        tec.nextLine();
    }

    public void editarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setIdade(idade);
        cliente.setEmail(email);
        cliente.setTelefone(telefone);
        cliente.setCodigoCliente(codigoCliente);
        cliente.setTelefoneDoCliente(telefoneDoCliente);
        cliente.setEmailCliente(emailCliente);
        listaDeClientes.set(id, cliente);
    }

    public void listarClientes() {
        System.out.println("--- LISTA DE CLIENTES ---");
        for (int i = 0; i < listaDeClientes.size(); i++) {
            System.out.println("Nome: " + listaDeClientes.get(i).getNome() + "  |  CPF: " + listaDeClientes.get(i).getCpf() + "  |  Idade: " + listaDeClientes.get(i).getIdade());
            System.out.println("Email: " + listaDeClientes.get(i).getEmail() + "  |  Email do Cliente: " + listaDeClientes.get(i).getEmailCliente() + "  |  Telefone: " + listaDeClientes.get(i).getTelefone() + "  |  Telefone do Cliente: " + listaDeClientes.get(i).getTelefoneDoCliente());
            System.out.println();
        }
    }

    public void buscarCliente() {
        System.out.println("Nome: " + listaDeClientes.get(id).getNome() + "  |  CPF: " + listaDeClientes.get(id).getCpf() + "  |  Idade: " + listaDeClientes.get(id).getIdade());
        System.out.println("Email: " + listaDeClientes.get(id).getEmail() + "  |  Email do Cliente: " + listaDeClientes.get(id).getEmailCliente() + "  |  Telefone: " + listaDeClientes.get(id).getTelefone() + "  |  Telefone do Cliente: " + listaDeClientes.get(id).getTelefoneDoCliente());
        System.out.println();
    }

    public void removerCliente() {
        listaDeClientes.remove(id);
        System.out.println("Dados removidos com sucesso!");
        System.out.println();
    }
}
