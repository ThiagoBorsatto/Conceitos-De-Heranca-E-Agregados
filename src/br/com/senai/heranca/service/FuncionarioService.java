package br.com.senai.heranca.service;

import br.com.senai.heranca.entity.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioService {
    Scanner tec = new Scanner(System.in);
    List<Funcionario> listaDeFuncionarios= new ArrayList<>();
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String matricula;
    private String email_funcionario;
    private String funcao;
    private int idade;
    private int id;
    private double salario;

    public void lerDadosFuncionario() {
        System.out.println("--- DADOS DO FUNCIONÁRIO ---");
        System.out.print("Matrícula: ");
        matricula = tec.nextLine();
        System.out.print("Função: ");
        funcao = tec.nextLine();
        System.out.print("Nome: ");
        nome = tec.nextLine();
        System.out.print("CPF: ");
        cpf = tec.nextLine();
        System.out.print("Idade: ");
        idade = tec.nextInt();
        System.out.print("Valor do Salário: R$");
        salario = tec.nextDouble();
        tec.nextLine();
        System.out.print("Email: ");
        email = tec.nextLine();
        System.out.print("Email de trabalho: ");
        email_funcionario = tec.nextLine();
        System.out.print("Telefone: ");
        telefone = tec.nextLine();
        System.out.println();
    }

    public void cadastrarFuncionario() {
        Funcionario funcionario = new Funcionario(nome, cpf, idade, email, telefone, matricula, email_funcionario, funcao, salario);
        listaDeFuncionarios.add(funcionario);
    }

    public void leitorDeID() {
        System.out.print("Digite o ID: ");
        id = tec.nextInt();
        while (id < 0 || id >= listaDeFuncionarios.size()) {
            System.out.print("ID inválido, digite novamente: ");
            tec.nextLine();
            id = tec.nextInt();
        }
        System.out.println();
        tec.nextLine();
    }

    public void editarFuncionario() {
        Funcionario funcionario = new Funcionario(nome, cpf, idade, email, telefone, matricula, email_funcionario, funcao, salario);
        listaDeFuncionarios.set(id, funcionario);
    }

    public void listarFuncionario() {
        System.out.println("--- LISTA DE FUNCIONÁRIOS ---");
        for (int i = 0; i < listaDeFuncionarios.size(); i++) {
            System.out.println("Matrícula"+ listaDeFuncionarios.get(i).getMatricula() + "  |  Função: " + listaDeFuncionarios.get(i).getFuncao() + "  |  Nome: " + listaDeFuncionarios.get(i).getNome() + "  |  CPF: " + listaDeFuncionarios.get(i).getCpf() + "  |  Idade: " + listaDeFuncionarios.get(i).getIdade());
            System.out.println("Salário: R$" + listaDeFuncionarios.get(i).getSalario() + "  |  Email: " + listaDeFuncionarios.get(i).getEmail() + "  |  Email de trabalho: " + listaDeFuncionarios.get(i).getEmail_funcionario() + "  |  Telefone: " + listaDeFuncionarios.get(i).getTelefone());
            System.out.println();
        }
    }

    public void buscarFuncionario() {
        System.out.println("Matrícula"+ listaDeFuncionarios.get(id).getMatricula() + "  |  Função: " + listaDeFuncionarios.get(id).getFuncao() + "  |  Nome: " + listaDeFuncionarios.get(id).getNome() + "  |  CPF: " + listaDeFuncionarios.get(id).getCpf() + "  |  Idade: " + listaDeFuncionarios.get(id).getIdade());
        System.out.println("Salário: R$" + listaDeFuncionarios.get(id).getSalario() + "  |  Email: " + listaDeFuncionarios.get(id).getEmail() + "  |  Email de trabalho: " + listaDeFuncionarios.get(id).getEmail_funcionario() + "  |  Telefone: " + listaDeFuncionarios.get(id).getTelefone());
        System.out.println();
    }

    public void removerFuncionario() {
        listaDeFuncionarios.remove(id);
        System.out.println("Dados removidos com sucesso!");
        System.out.println();
    }
}
