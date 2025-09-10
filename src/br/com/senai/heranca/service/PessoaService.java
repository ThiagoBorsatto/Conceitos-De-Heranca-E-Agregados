package br.com.senai.heranca.service;

import br.com.senai.heranca.entity.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaService {
    Scanner tec = new Scanner(System.in);
    List<Pessoa> listaDePessoas = new ArrayList<>();
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private int idade;
    private int id;

    public void lerDadosPessoa() {
        System.out.println("--- DADOS DA PESSOA ---");
        System.out.print("Nome: ");
        nome = tec.nextLine();
        System.out.print("CPF: ");
        cpf = tec.nextLine();
        System.out.print("Idade: ");
        idade = tec.nextInt();
        tec.nextLine();
        System.out.print("Email: ");
        email = tec.nextLine();
        System.out.print("Telefone: ");
        telefone = tec.nextLine();
        System.out.println();
    }

    public void cadastrarPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setIdade(idade);
        pessoa.setEmail(email);
        pessoa.setTelefone(telefone);
        listaDePessoas.add(pessoa);
    }

    public void leitorDeID() {
        System.out.print("Digite o ID: ");
        id = tec.nextInt();
        while (id < 0 || id >= listaDePessoas.size()) {
            System.out.print("ID inválido, digite novamente: ");
            tec.nextLine();
            id = tec.nextInt();
        }
        System.out.println();
        tec.nextLine();
    }

    public void editarPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setIdade(idade);
        pessoa.setEmail(email);
        pessoa.setTelefone(telefone);
        listaDePessoas.set(id, pessoa);
    }

    public void listarPessoas() {
        System.out.println("--- LISTA DE PESSOAS ---");
        for (int i = 0; i < listaDePessoas.size(); i++) {
            System.out.println("Nome: " + listaDePessoas.get(i).getNome() + "  |  CPF: " + listaDePessoas.get(i).getCpf() + "  |  Idade: " + listaDePessoas.get(i).getIdade());
            System.out.println("Email: " + listaDePessoas.get(i).getEmail() + "  |  Telefone: " + listaDePessoas.get(i).getTelefone());
            System.out.println();
        }
    }

    public void buscarPessoa() {
        System.out.println("Nome: " + listaDePessoas.get(id).getNome() + "  |  CPF: " + listaDePessoas.get(id).getCpf() + "  |  Idade: " + listaDePessoas.get(id).getIdade());
        System.out.println("Email: " + listaDePessoas.get(id).getEmail() + "  |  Telefone: " + listaDePessoas.get(id).getTelefone());
        System.out.println();
    }

    public void removerPessoa() {
        listaDePessoas.remove(id);
        System.out.println("Dados removidos com sucesso!");
        System.out.println();
    }
}
